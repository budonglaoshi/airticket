<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script type="text/javascript" src="/airticket/js/map.js"></script>
<script type="text/javascript">
$(function(){
	
	$("#login").click(function(){
		
	});
	
	
})();
</script>
<body>
	<div id="loginpage" style="border: 1px solid #efefef;">
		电话号码：<input  name="" />
		<input id="login" type="button" value="登录" />
	</div>
	<div id="userinfo"></div>
	<div style="width:15%;height:100%;float: left;border: 1px solid #efefef;">
		<span></span>
		<ul>
			<li><a href="userOrders?order.mobilePhone=1234567">订单信息</a></li>
		</ul>
	</div>
	<div style="width: 85%;height:100%;float: left;border: 1px solid #efefef;">
		<table style="margin: 0xp;padding: 0px;">
			<tr>
				<th>订单号</th>
				<th>航班信息</th>
				<th>数量</th>
				<th>订单总价</th>
				<th>下单日期</th>
				<th>订单状态</th>
				<th>操作</th>
			</tr>
			<s:iterator var="order" value="#orders" >
				<tr style="border: 1px solid #adf;list-style: none;">
					<td><s:property value="#order.orderid" /></td>
					<td>
						<b><s:property value="#order.departCityName" /></b>-<b><s:property value="#order.arriveCityName" /></b><br />
						<s:date name="#order.takeOffTime" format="yyyy-MM-dd HH:mm:ss"/>-<s:date name="#order.arriveTime" format="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td>
						<s:property value="#order.orderPassengers.size" />
					</td>
					<td>
						￥<s:property value="#order.price" />
					</td>
					<td>
						<!--W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交  -->
						<s:date name="#order.orderDate" format="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td>
						<s:if test='%{#order.statusid=="W"}'>未处理</s:if>
						<s:if test='%{#order.statusid=="P"}'>处理中</s:if>
						<s:if test='%{#order.statusid=="S"}'>已成交</s:if>
						<s:if test='%{#order.statusid=="C"}'>已取消</s:if>
						<s:if test='%{#order.statusid=="R"}'>全部退票</s:if>
						<s:if test='%{#order.statusid=="T"}'>部分退票</s:if>
						<s:if test='%{#order.statusid=="U"}'>未提交</s:if>
					</td>
					<td>
						<a href="" >查看</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>