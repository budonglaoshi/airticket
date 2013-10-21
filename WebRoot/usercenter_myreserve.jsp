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
<script type="text/javascript" src="/airticket/js/loadpage.js"></script>
<body onload="">
	 <h2>我的订单</h2>

	
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
			<input id="pass_flightClass" value="" type="hidden"/>
	</div>

	<br />
		<form id="post_saveorder" action="saveorder" method="post">
			<input type="hidden" id="passenger_json" name="passenger_json"/>		
			<input type="hidden" id="order_json" name="order_json"/>		
			<input type="hidden" id="invoices_json" name="invoices_json"/>		
		</form>
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