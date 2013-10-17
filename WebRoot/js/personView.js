var order_json= [];

function PersonView(_id,persons,data) {
	
	//
	PersonView.countPrice = function() {
		var localPrice = 0;
		for ( var i = 0; i < persons.size(); i++) {
			localPrice = localPrice+ parseFloat(persons.elements[i].value.getPrice())+parseFloat(persons.elements[i].value.getInsurancePrice());
		}
		document.getElementById("localPrice").innerHTML = localPrice;
	}
	
	
	this.nameInput = document.createElement("input");
	this.nameInput.id = "name" + _id;
	this.nameInput.name = "orderPassengers.passengerName";
	//
	this.nameInput.onkeyup = function() {
		persons.get(_id).setName(this.value);
	}
	

	this.priceSelect = document.createElement("select");
	this.priceSelect.id = "price" + _id;
	this.priceSelect.name = "orderPassengers.birthday";
	this.priceSelect.add(new Option("成人(>12)",data[0]));
	this.priceSelect.add(new Option("儿童(6-12)",data[1]));
	this.priceSelect.add(new Option("婴儿(1-5)",data[2]));

	//
	this.priceSelect.onchange = function() {
		persons.get(_id).setPrice(this.value);
		PersonView.countPrice();
	}

	this.noTypeSelect = document.createElement("select");
	this.noTypeSelect.id = "perNoType" + _id;
	this.noTypeSelect.name = "orderPassengers.cardTypeName";
	this.noTypeSelect.add(new Option("身份证","身份证"));
	this.noTypeSelect.add(new Option("护照","护照"));
	this.noTypeSelect.add(new Option("港澳通行证","港澳通行证"));
	this.noTypeSelect.add(new Option("台胞证","台胞证"));
	this.noTypeSelect.add(new Option("军人证件","军人证件"));
	this.noTypeSelect.add(new Option("其他","其他"));
	
	//
	this.noTypeSelect.onchange = function() {
		persons.get(_id).setPerNoType(this.value);
	}

	this.perNo = document.createElement("input");
	this.perNo.id = "perNo" + _id;
	this.perNo.name = "orderPassengers.cardTypeNumber";
	//
	this.perNo.onkeyup = function() {
		persons.get(_id).setPerNo(this.value);
	}
	
	this.insurance = document.createElement("select");
	this.insurance.id = "insurance" + _id;
	this.insurance.name = "orderPassengers.insurance";
	this.insurance.add(new Option("1份",20));
	this.insurance.add(new Option("0份",0));

	//
	this.insurance.onchange = function() {
		persons.get(_id).setInsurancePrice(this.value);
		PersonView.countPrice();
	}
	
	this.del = document.createElement("a");
	this.del.className = "delete";
	this.del.href = "javascript:void(0);";
	this.del.innerHTML = "删除";
	
	//
	this.laod = function() {
		//
		var dv = document.createElement("div");
		dv.id = "person" + _id;
		dv.appendChild(this.nameInput);
		dv.appendChild(this.priceSelect);
		dv.appendChild(this.noTypeSelect);
		dv.appendChild(this.perNo);
		dv.appendChild(this.insurance);
		dv.appendChild(this.del);
		//
		var list_dv = document.getElementById("list_passenger");
		list_dv.appendChild(dv);
		//
		var person = new Person();
		person.setPrice(this.priceSelect.value);
		person.setInsurancePrice(this.insurance.value);
		persons.put(_id, person);
		PersonView.countPrice();

		//
		this.del.onclick = function() {
			if (confirm("确认删除?") == false) {
				return;
			}
			if (persons.size() <= 1) {
				return;
			}
			persons.removeByKey(_id);
			list_dv.removeChild(dv);
			PersonView.countPrice();
		}

	}
	

}