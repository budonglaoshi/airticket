<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>去买呀-机票</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script type="text/javascript"
	src="/airticket/js/linechart/highcharts.js"></script>
<script type="text/javascript" src="/airticket/js/linechart/line.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	//出发城市
	var dcity = "BJS";
	//达到城市
	var acity = "KMG";
	
	//加载曲线图
	var LineGraph = function(dcity,acity){
		$.post("loadLine", {
			"view.departCity" : dcity,
			"view.arriveCity" : acity
		}, function(rv) {
			var json = eval(rv);
			//出发日期
			var takeOffTime = new Array();
			//出发票价
			var price = new Array();
			var depaerAPortName;
			var arriveAPortName;
			for ( var i = 0; i < json.length; i++) {
				takeOffTime[i]='';
				price[i] = json[i].price;
				depaerAPortName = json[i].depCityDetail.cityName;
				arriveAPortName = json[i].arrCityDetail.cityName;
				var time = json[i].takeOffTime.split("-");
				
				takeOffTime[i] = time[1]+"-"+time[2];
				
				
			}
			loadLine(depaerAPortName,arriveAPortName,price,takeOffTime);
		});
	}
	
	
	
	//加载曲线图
	LineGraph(dcity,acity);

	function loadLink(){
		
	}
	
	//更换往返地址
	$(".chGo").click(function(){
		var dc = $("#departCity").val();
		var ac = $("#arriveCity").val();
		$("#departCity").val(ac);
		$("#arriveCity").val(dc);
		$("#serchform").submit();
	});
	
	$(".goOrder").click(function(){
		var index = $(this).attr("index");
		var dcity = $("#dcity"+index).html(); 
		var acity = $("#acity"+index).html(); 
		var price = $("#price"+index).html(); 
		var ddate = $("#ddate"+index).html();
		var fno = $("#fno"+index).html(); 
		var ftype = $("#ftype"+index).html();
		var jsondata = "{";
			jsondata+="\"view.departCity\":\""+dcity+"\",";
			jsondata+="\"view.arriveCity\":\""+acity+"\",";
			jsondata+="\"view.takeOffTime\":\""+ddate+"\",";
			jsondata+="\"view.price\":\""+price+"\",";
			jsondata+="\"view.flightClass\":\""+ftype+"\",";
			jsondata+="\"view.flightNo\":\""+fno+"\"";
		jsondata+="}";
		
		location.replace("reserve.jsp?params="+jsondata);
	});
	
	
	
	
})();
</script>
<style type="text/css">
* {
	margin: 0PX;
	padding: 0px;
}

a {
	border: 1px solid #adf;
	width: 80px;
	height: 30px;
	display: block;
	line-height: 30px;
	text-align: center;
	text-decoration: none;
	background-color: #adf;
}
</style>
</head>
<body>
	<center>

		<div id="container"
			style="width: 633px; height: 215px; margin: 0 auto"></div>
		<form id="serchform" action="serchflight" method="post">
			<input name="view.searchType" type="radio" value="S"
				<s:if test='%{#type eq "S"}'>checked='checked'</s:if>
				<s:elseif test='%{#type=="D"}'></s:elseif>
				<s:else>checked='checked'</s:else> /><span>单程</span> <label>出发城市</label><input
				id="departCity" name="view.departCity"
				value="<s:property value="#depart"/>" /> <label>出发时间</label><input
				id="departDate" name="view.departDate"
				value="<s:property value="#departTime"/>" /><br /> <input
				name="view.searchType" type="radio" value="D"
				<s:if test='%{#type=="D"}'>checked='checked'</s:if> /><span>往返</span>
			<label>到达城市</label><input id="arriveCity" name="view.arriveCity"
				value="<s:property value="#arrive"/>" /> <label id="arrLabel">返程时间</label><input
				id="returnDate" name="view.returnDate"
				value="<s:property value="#arriveTime"/>" /><br /> <input
				id="menuSubmit" type="hidden" name="view.menuSubmit" /> <br /> <input
				type="submit" value="submit" />
		</form>
		<s:if test="#viewers!=null">
			<br />
			<br />
			<br />
			<s:iterator var="viewer" value="#viewers" status="index">
				<div style="border: 1px solid #dedede;height: 150px;">
					<s:property value="#viewer.depCityDetail.cityName" />
					<label style="display: none;" id="dcity<s:property value="#index.index"/>"><s:property value="#viewer.depCityDetail.cityCode" /></label>
					-
					<s:property value="#viewer.arrCityDetail.cityName" />
					<label style="display: none;" id="acity<s:property value="#index.index"/>"><s:property value="#viewer.arrCityDetail.cityCode" /></label>
					<br />
					<s:property value="#viewer.depAirportInfo.airPortName" />
					-
					<s:property value="#viewer.arrAirportInfo.airPortName" />
					&nbsp;&nbsp;
					<label id="price<s:property value="#index.index"/>"><s:property value="#viewer.price" /></label>
					(
					<s:property value="#viewer.rate" />
					) 起飞时间：
					<label id="ddate<s:property value="#index.index"/>"><s:date name="#viewer.takeOffTime" format="yyyy-MM-dd hh:mm:ss" /></label>
					还剩
					<s:property value="#viewer.quantity" />
					张票<br /> 航班号：
					<label id="fno<s:property value="#index.index"/>"><s:property value="#viewer.flightNo" /></label>
					<br /> 航班类型：
					<s:property value="#viewer.craftInfo.craftType" />
					<br />
					<s:property value="#viewer.flightClassName" />
					<label id="ftype<s:property value="#index.index"/>"><s:property value="#viewer.flightClass" /></label>
					<br />
					<s:property value="#viewer.airlineInfo.airLineName" />
					<br />

					<s:if test='%{#type eq "S"}'>
						<a class="goOrder" href="javascript:void(0);" index="<s:property value="#index.index"/>">预定</a>
					</s:if>
					<s:elseif test='%{#type eq "D"}'>
						<a class="chGo" href="javascript:void(0);">选择去程</a>
					</s:elseif>
					
				</div>
			</s:iterator>
		</s:if>
		<s:elseif test="#reserveViews==null">
			<br />
			<br />
			<br />
			<b>你木有资料，不要和朕开玩笑！</b>
			<br />
			<img alt="你木有订单，不要和朕开玩笑！" src="/airticket/image/x.gif">
		</s:elseif>
	</center>

</body>
</html>
