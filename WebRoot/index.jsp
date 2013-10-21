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
			var json = $.parseJSON(rv);
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

	//更换往返地址
	$("#chGo").click(function(){
		var dc = $("#departCity").val();
		var ac = $("#arriveCity").val();
		$("#departCity").val(ac);
		$("#arriveCity").val(dc);
		$("#serchform").submit();
	});
	
})();

	function serchform_btn(){
		$("#serchform").submit();
	};
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
				value="BJS" /> <label>出发时间</label><input
				id="departDate" name="view.departDate"
				value="2013-11-01" /><br /> <input
				name="view.searchType" type="radio" value="D"
				<s:if test='%{#type=="D"}'>checked='checked'</s:if> /><span>往返</span>
			<label>到达城市</label><input id="arriveCity" name="view.arriveCity"
				value="KMG" /> <label id="arrLabel">返程时间</label><input
				id="returnDate" name="view.returnDate"
				value="<s:property value="#arriveTime"/>" /><br /> <input
				id="menuSubmit" type="hidden" name="view.menuSubmit" /> <br /> <input type="button"
				 value="submit"  onclick="serchform_btn()"/>
		</form>

		<div style="float: right;">
			<a href="reserve.jsp">我的订单</a>
		</div>
		
	</center>

</body>
</html>
