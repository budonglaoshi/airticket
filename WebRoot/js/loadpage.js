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
					var flightClass= orders.flightClass;
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
					$("#pass_flightClass").val(flightClass);
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
							$("#invoices_receiver").val(null);
							$("#invoices_mobilePhone").val(null);
							$("#invoices_address").val(null);
							$("#invoices_postCode").val(null);
							
							$("#invoices_province").get(0).selectedIndex=0;
							$("#invoices_city").get(0).selectedIndex=0;
							$("#invoices_canton").get(0).selectedIndex=0;

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
							passenger_json+="{\"passengerName\":\""+persons.get(p).getName()+"\","
							+"\"passengerType\":\""+persons.get(p).getPassengerType()+"\","
							+"\"cardTypeName\":\""+persons.get(p).getPerNoType()+"\","
							+"\"cardTypeNumber\":\""+persons.get(p).getPerNo()+"\","
							+"\"insurance\":\""+persons.get(p).getInsurancePrice()+"\","
							+"\"flightClass\":\""+flightClass+"\","
							+"\"flightClassName\":\""+flightClassName+"\","
							+"\"price\":\""+persons.get(p).getPrice()+"\"},";
							
						}
						passenger_json=passenger_json.substring(0,passenger_json.lastIndexOf(","))+"]";
						
						var order_json="{";
						order_json+="\"departCityCode\":\""+$("#order_departCityCode").val()+"\","
						+"\"arriveCityCode\":\""+$("#order_arriveCityCode").val()+"\","
						+"\"departCityName\":\""+$("#order_departCityName").val()+"\","
						+"\"arriveCityName\":\""+$("#order_arriveCityName").val()+"\","
						+"\"takeOffTime\":\""+$("#order_takeOffTime").val()+"\","
						+"\"arriveTime\":\""+$("#order_arriveTime").val()+"\","
						+"\"craftType\":\""+$("#order_craftType").val()+"\","
						+"\"airlineCode\":\""+$("#order_airlineCode").val()+"\","
						+"\"airlineName\":\""+$("#order_airlineName").val()+"\","
						+"\"price\":\""+$("#localPrice").html()+"\","
						+"\"contactName\":\""+$("#order_contactName").val()+"\","
						+"\"mobilePhone\":\""+$("#order_mobilePhone").val()+"\","
						+"\"statusid\":\"0\","
						+"\"contactEmail\":\""+$("#order_contactEmail").val()+"\"}";
						
						if(null!=$("#invoices_receiver").val()){
							var invoices_json="{";
							invoices_json+="\"receiver\":\""+$("#invoices_receiver").val()+"\","
							+"\"mobilePhone\":\""+$("#invoices_mobilePhone").val()+"\","
							+"\"province\":\""+$("#invoices_province").val()+"\","
							+"\"city\":\""+$("#invoices_city").val()+"\","
							+"\"canton\":\""+$("#invoices_canton").val()+"\","
							+"\"address\":\""+$("#invoices_address").val()+"\","
							+"\"postCode\":\""+$("#invoices_postCode").val()+"\"}";
							
							$("#invoices_json").val(invoices_json);
						}
						
						$("#order_json").val(order_json);
						$("#passenger_json").val(passenger_json);
						
						$("#post_saveorder").submit();
						
					});
					
				}
				
			}
		);
	}