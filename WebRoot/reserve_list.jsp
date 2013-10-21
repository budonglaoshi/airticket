<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<title>去买呀-机票</title>
<script type="text/javascript"src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>

</head>

<body>
	<table>
		<tr>
			<td>机票信息</td>
			<td>
				<s:date name="#untreatedOrder.takeOffTime" format="yyyy-MM-dd"/><br />
				<s:date name="#untreatedOrder.takeOffTime" format="hh:mm:ss"/>-
				<s:date name="#untreatedOrder.arriveTime" format="hh:mm:ss"/><br />
				<s:property value="#untreatedOrder.departCityName"/>-
				<s:property value="#untreatedOrder.arriveCityName"/>
			</td>
		</tr>
		
		<tr>
			<td colspan="<s:property value="#orderPassengers.size"/>">乘机人</td>
			<s:iterator var="passenger" value="#orderPassengers">	
				<td>
					姓名&nbsp;<s:property value="#passenger.passengerName"/><br />
					证件信息&nbsp;<s:property value="#passenger.cardTypeName"/>&nbsp;<s:property value="#passenger.cardTypeNumber"/><br />
					机票单价&nbsp;<s:property value="#passenger.price"/>
				</td>
			</s:iterator>
		</tr>
		
		<tr>
			<td colspan="<s:property value="#orderPassengers.size"/>+1">保险</td>
			<td>航空意外险</td>
			<s:iterator var="passenger" value="#orderPassengers">	
				<td>
					姓名&nbsp;<s:property value="#passenger.passengerName"/>&nbsp;<s:if test="#passenger.insurance>0">1份</s:if><s:else>0份</s:else>
				</td>
			</s:iterator>
		</tr>
		
		<tr>
			<td>联系信息</td>
			<td>
				联系人&nbsp;<s:property value="#untreatedOrder.contactName"/><br />
				手机号&nbsp;<s:property value="#untreatedOrder.mobilePhone"/><br />
				
				<s:if test="null!=#untreatedOrder.contactEmail">
					Email&nbsp;<s:property value="#untreatedOrder.contactEmail"/>
				</s:if>
			</td>
		</tr>
	</table>
	
	<input type="button" value="支付">
</body>
</html>
