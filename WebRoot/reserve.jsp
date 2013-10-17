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
	
	function init(){
		setup();
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
					alert("已存在该订单!");
				}else{
					var orders = $.parseJSON(rv);
					var data = new Array();
					var DairPortName = orders.depAirportInfo.airPortName;
					var AairPortName= orders.arrAirportInfo.airPortName;
					
					
					
					var DCityName = orders.depAirportInfo.cityName;
					var ACityName= orders.arrAirportInfo.cityName;
					
					var DCityCode = orders.depCityDetail.cityCode;
					var ACityCode= orders.arrCityDetail.cityCode;
					
					var takeOffTime = orders.takeOffTime;
					var arriveTime= orders.arriveTime;
											
					var flightNo= orders.flightNo;
					var flightClassName= orders.flightClassName;
					var airLineName = orders.airlineInfo.airLineName;
					var airlineCode = orders.airlineInfo.airLine;
					var price = orders.price;
					
					var craftTypeName = orders.craftInfo.craftTypeName;
					
					$("#orderInfo").append("<span>路线："+DCityName+"-"+ACityName+"</span><br />");
					$("#orderInfo").append("<span>机场："+DairPortName+"-"+AairPortName+"</span><br />");
					$("#orderInfo").append("<span>航班号:"+flightNo+"</span><br />");
					$("#orderInfo").append("<span>机舱类型:"+flightClassName+"</span><br />");
					$("#orderInfo").append("<span>航空公司:"+airLineName+"</span><br />");
					$("#orderInfo").append("<span>价格:"+price+"</span><br />");
					
					$("#order_departCityCode").val(DCityCode);
					$("#order_arriveCityCode").val(ACityCode);
					$("#order_departCityName").val(DCityName);
					$("#order_arriveCityName").val(ACityName);
					$("#order_takeOffTime").val(takeOffTime);
					$("#order_arriveTime").val(arriveTime);
					$("#order_craftType").val(craftTypeName);
					$("#order_airlineCode").val(airlineCode);
					$("#order_airlineName").val(airLineName);
					//
					
					//
					data[0] = price;
					data[1] = orders.childStandardPrice;
					data[2] = orders.babyStandardPrice;
									
					var persons = new Map();
					new PersonView(0,persons,data).laod();
					var count = 0;
						
						
					$("#addPerson").click(function() {
						var size = persons.size();
						if (size >= 9) {
							alert("最多只能添加9个乘客!");
							return;
						}
						++count;
						new PersonView(count, persons,data).laod();
					});
					
					
					$("input[name='isa']").click(function(){
						if($("#p_email").is(":checked")){
							$("#invoices").show();
						}else{
							$("#invoices").hide();	
						}						
												
					});
					
					$("#samePassenger").click(function(){
						if($(this).is(":checked")){
							$("#invoices_receiver").val($("#order_contactName").val());
							$("#invoices_mobilePhone").val($("#order_mobilePhone").val());
						}else{
							$("#invoices_receiver").val("");
							$("#invoices_mobilePhone").val("");
						}
					
					});
					
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
						+"\"statusid\":\"0\","
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
							//alert(data);
						});			
					});
					
				}
				
			}
		);
	}
	
	init();
	
})();
</script>
</head>
<body>
	
	<div id="orderInfo" style="border: 1px solid #ededed;overflow: auto;display: block;"></div>&nbsp; 
	<div id="list_passenger" style="border: 1px solid #ededed;overflow: auto;display: block;"></div>&nbsp; 
	 
	<input id="addPerson" type="button" value="＋添加乘机人">
	
	<div>
			<input id="order_departCityCode" value="" type="hidden"/>
			<input id="order_arriveCityCode" value="" type="hidden"/>
			<input id="order_departCityName" value="" type="hidden" />
			<input id="order_arriveCityName" value="" type="hidden"/>
			<input id="order_takeOffTime" value="" type="hidden"/>
			<input id="order_arriveTime" value="" type="hidden"/>
			<input id="order_craftType" value="" type="hidden"/>
			<input id="order_airlineCode" value="" type="hidden"/>
			<input id="order_airlineName" value="" type="hidden"/>
	</div>

	<br />
		<div>
			<label>总价：￥</label><span id="localPrice"><s:property value="#reserveViews.get(0).price" /></span>
			<input type="hidden" id="order_price">
		</div>
		<hr />
		<h2>联系人信息</h2>
		姓名*<input id="order_contactName" name="order.contactName">&nbsp;&nbsp;&nbsp; 
		手机*<input id="order_mobilePhone" name="order.mobilePhone">&nbsp;&nbsp;&nbsp; 
		电子邮箱<input id="order_contactEmail" name="order.contactEmail">&nbsp;&nbsp;&nbsp;
		<hr />

		<h2>报销信息</h2>
		<input type="radio" name="isa" value="0" checked="checked" />自取行程单<br /> 
		<input type="radio" id="p_email" name="isa" />邮件行程单
		
		<br />
		<div id="invoices" style="display: none;">
			填写邮寄地址 收件人*<input id="invoices_receiver" name="orderTravelInvoices.receiver" >&nbsp;<input id="samePassenger" type="checkbox">同联系人<br />
			
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
</body>
</html>
