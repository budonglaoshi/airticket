<%@page import="java.math.BigDecimal"%>
<%@page import="com.airticket.bean.ResponseView"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script type="text/javascript" src="/airticket/js/map.js"></script>
<script type="text/javascript" src="/airticket/js/person.js"></script>
<script type="text/javascript" src="/airticket/js/personView.js"></script>
<script type="text/javascript" src="/airticket/js/area.js"></script>
</head>
<body onload="setup();">
	<div id="orderInfo">
	</div>
	<div id="list_passenger"></div>
		<input id="addPerson" type="button" value="＋添加乘机人">
	<div>
			<input id="order_departCityCode" value="<s:property value="#reserveViews.get(0).depCityDetail.cityCode" />"/>
			<input id="order_arriveCityCode" value="<s:property value="#reserveViews.get(0).arrCityDetail.cityCode" />"/>
			<input id="order_departCityName" value="<s:property value="#reserveViews.get(0).depCityDetail.cityName" />"/>
			<input id="order_arriveCityName" value="<s:property value="#reserveViews.get(0).arrCityDetail.cityName" />"/>
			<input id="order_takeOffTime" value="<s:date name="#reserveViews.get(0).takeOffTime" format="yyyy-MM-dd hh:mm:ss"/>"/>
			<input id="order_arriveTime" value="<s:date name="#reserveViews.get(0).arriveTime" format="yyyy-MM-dd hh:mm:ss"/>"/>
			<input id="order_craftType" value="<s:property value="#reserveViews.get(0).craftInfo.craftType" />"/>
			<input id="order_airlineCode" value="<s:property value="#reserveViews.get(0).airlineInfo.airLine" />"/>
			<input id="order_airlineName" value="<s:property value="#reserveViews.get(0).airlineInfo.airLineName" />"/>
	</div>

	<br />


		<div>
			<label>总价：￥</label><span id="localPrice"><s:property value="#reserveViews.get(0).price" /></span>

			<input type="hidden" id="order_price">
		</div>

		<h2>乘机人信息</h2>
		<div id="list_passenger"></div>
		
		<input id="addPerson" value="＋添加乘机人" type="button">
		
		<hr />

		<h2>联系人信息</h2>
		姓名*<input id="order_contactName" name="order.contactName">&nbsp;&nbsp;&nbsp; 
		手机*<input id="order_mobilePhone" name="order.mobilePhone">&nbsp;&nbsp;&nbsp; 
		电子邮箱<input id="order_contactEmail" name="order.contactEmail">&nbsp;&nbsp;&nbsp;
		<hr />

		<h2>报销信息</h2>
		<input type="radio" name="isa" value="0" onclick="showinvoices_false(this)" checked="checked" />自取行程单<br /> 
		<input type="radio" name="isa" value="1" onclick="showinvoices_true(this)" />邮件行程单
		
		<br />
		<div id="invoices" style="display: none;">
			填写邮寄地址 收件人*<input id="invoices_receiver" name="orderTravelInvoices.receiver" >&nbsp;<input onclick="ispassenger(this)" type="checkbox">同联系人<br />
			
			手机号*<input id="invoices_mobilePhone" name="orderTravelInvoices.mobilePhone" type="text"><br />
			
		           所在地区*<select id="invoices_province" name="orderTravelInvoices.province"></select>
				  <select id="invoices_city" name="orderTravelInvoices.city" ></select>
				  <select id="invoices_canton" name="orderTravelInvoices.canton"></select><br />
				  
		           街道地址*<input id="invoices_address" name="orderTravelInvoices.address"><br />
		           
		           邮政编号*<input id="invoices_postCode" name="orderTravelInvoices.postCode"><br />
		           
		           快递费&nbsp;￥20
		</div>
		<br />
		<input id="add_btn" type="button" value="提交订单">
		<a href="javascript:void(0);" onclick="javascript:location.href ='saveorder'">提交</a>
</body>
</html>
<script type="text/javascript">
$(function(){
		function getUrlParam(name) {
    	var reg = new RegExp('(^|&)'+name+'=([^&]*)(&|$)');
    	var r = window.location.search.substr(1).match(reg);
    	if (r != null){
        	return unescape(r[2]);
    	}
    	return null;
	}
	
	function getOrder(){
		var flightNo = getUrlParam("view.flightNo");		
		var price = getUrlParam("view.price");		
		var flightClass = getUrlParam("view.flightClass");		
		var departCity = getUrlParam("view.departCity");		
		var arriveCity = getUrlParam("view.arriveCity");		
		var takeOffTime = getUrlParam("view.takeOffTime");		
		
		$.post(
			"/airticket/savereserve",
			{
				"view.flightNo":flightNo,
				"view.price":price,
				"view.flightClass":flightClass,
				"view.departCity":departCity,
				"view.arriveCity":arriveCity,
				"view.takeOffTime":takeOffTime
			},
			function(rv){
				if(rv=="false"){
					alert("缓存订单已存在!");
				}else{
					alert(rv);
					var orders = eval(rv);
					for(var i=0;i<orders;i++){
					
						orders[i].depAirportInfo.airPortName;
												
						orders[i].arrAirportInfo.airPortName;
						
						orders[i].flightNo;
						orders[i].flightClassName;
						orders[i].airlineInfo.airLineName;
						orders[i].airlineInfo.price;
						
						
					}	
				}
				
			}
		);
	}
	
	function loadPerson(){
		var persons = new Map();
		new PersonView(0,persons).laod();
		var count = 0;
		
		$("#addPerson").click(function() {
			var size = persons.size();
			if (size >= 9) {
				alert("最多只能添加9个乘客!");
				return;
			}
			++count;
			new PersonView(count, persons).laod();
		});
	}
	
	$("#add_btn").click(function() {
		var passenger_json="[";
		for ( var p in persons.keys()) {
			passenger_json+="{\"passengerName\":\""+persons.get(p).name+"\","
			+"\"birthday\":\""+persons.get(p).name+"\","
			+"\"cardTypeName\":\""+persons.get(p).perNoType+"\","
			+"\"cardTypeNumber\":\""+persons.get(p).perNo+"\","
			+"\"insurance\":\""+persons.get(p).insurancePrice+"\","
			+"\"price\":\""+persons.get(p).price+"\"},";
			
		}
		passenger_json=passenger_json.substring(0,passenger_json.lastIndexOf(","))+"]";
		
		var order_json="{";
		order_json+="\"departCityCode\":\""+document.getElementById("order_departCityCode").value+"\","
		+"\"arriveCityCode\":\""+document.getElementById("order_arriveCityCode").value+"\","
		+"\"departCityName\":\""+document.getElementById("order_departCityName").value+"\","
		+"\"arriveCityName\":\""+document.getElementById("order_arriveCityName").value+"\","
		+"\"takeOffTime\":\""+document.getElementById("order_takeOffTime").value+"\","
		+"\"arriveTime\":\""+document.getElementById("order_arriveTime").value+"\","
		+"\"craftType\":\""+document.getElementById("order_craftType").value+"\","
		+"\"airlineCode\":\""+document.getElementById("order_airlineCode").value+"\","
		+"\"airlineName\":\""+document.getElementById("order_airlineName").value+"\","
		+"\"price\":\""+document.getElementById("localPrice").innerHTML+"\","
		+"\"contactName\":\""+document.getElementById("order_contactName").value+"\","
		+"\"mobilePhone\":\""+document.getElementById("order_mobilePhone").value+"\","
		+"\"contactEmail\":\""+document.getElementById("order_contactEmail").value+"\"}";
		
		var invoices_json="{";
		invoices_json+="receiver\":\""+document.getElementById("invoices_receiver").value+"\","
		+"\"mobilePhone\":\""+document.getElementById("invoices_mobilePhone").value+"\","
		+"\"province\":\""+document.getElementById("invoices_province").value+"\","
		+"\"city\":\""+document.getElementById("invoices_city").value+"\","
		+"\"canton\":\""+document.getElementById("invoices_canton").value+"\","
		+"\"address\":\""+document.getElementById("invoices_address").value+"\","
		+"\"postCode\":\""+document.getElementById("invoices_postCode").value+"\"}";
		
		$.post("saveorder",{
			"passenger_json":passenger_json,
			"order_json":order_json,
			"invoices_json":invoices_json
		},function(data){
			alert(data);
		});			
	});
	
	

	getOrder();
	loadPerson();
	
})();

	function showinvoices_true(now) {
		if (now.checked) {
			document.getElementById("invoices").style.display="block";
		}
	};
	function showinvoices_false(now) {
		if (now.checked) {
			document.getElementById("invoices").style.display="none";
		}
	};
	function ispassenger(now) {
		if (now.checked) {
			document.getElementById("invoices_receiver").value=document.getElementById("order_contactName").value;
			document.getElementById("invoices_mobilePhone").value=document.getElementById("order_mobilePhone").value;
		}else{
			document.getElementById("invoices_receiver").value="";
			document.getElementById("invoices_mobilePhone").value="";
		}
	};
</script>
