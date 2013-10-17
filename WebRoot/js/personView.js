var order_json= [];

function PersonView(_id,persons) {
	this.nameInput = document.createElement("input");
	this.nameInput.id = "name" + _id;
	this.nameInput.name = "orderPassengers.passengerName";
	this.nameInput.onkeyup = function() {
		persons.get(_id).name = this.value;
	}
	

	this.priceSelect = document.createElement("select");
	this.priceSelect.id = "price" + _id;
	this.priceSelect.name = "orderPassengers.birthday";
	this.priceSelect.innerHTML = "<option value='500' selected='selected'>成人(>12岁)</option><option value='300'>儿童(2~12岁)</option>";

	this.priceSelect.onchange = function() {
		persons.get(_id).price = this.value;
		PersonView.countPrice();
	}

	this.noTypeSelect = document.createElement("select");
	this.noTypeSelect.id = "perNoType" + _id;
	this.noTypeSelect.name = "orderPassengers.cardTypeName";
	this.noTypeSelect.innerHTML = "<option value='身份证' selected='selected'>身份证</option>"
			+ "<option value='护照'>护照</option>"
			+ "<option value='港澳通行证'>港澳通行证</option>"
			+ "<option value='台胞证'>台胞证</option>"
			+ "<option value='军人证件'>军人证件</option>" + "<option value='其他'>其他</option>";

	this.noTypeSelect.onchange = function() {
		persons.get(_id).perNoType = this.value;
	}

	this.perNo = document.createElement("input");
	this.perNo.id = "perNo" + _id;
	this.perNo.name = "orderPassengers.cardTypeNumber";
	this.perNo.onkeyup = function() {
		persons.get(_id).perNo = this.value;
	}
	
	this.insurance = document.createElement("select");
	this.insurance.id = "insurance" + _id;
	this.insurance.name = "orderPassengers.insurance";
	this.insurance.innerHTML = "<option value='20'>1份</option>"
			+ "<option value='0' selected='selected'>0份</option>";
	this.insurance.onchange = function() {
		persons.get(_id).insurancePrice = this.value;
		PersonView.countPrice();
	}
	
	this.del = document.createElement("a");
	this.del.className = "delete";
	this.del.href = "javascript:void(0);";
	this.del.innerHTML = "删除";

	PersonView.countPrice = function() {
		var localPrice = 0;
		for ( var i = 0; i < persons.size(); i++) {
			localPrice = localPrice+ parseFloat(persons.elements[i].value.getPrice())+parseFloat(persons.elements[i].value.getInsurancePrice());
		}
		document.getElementById("localPrice").innerHTML = localPrice;
	}
	
	this.laod = function() {
		var dv = document.createElement("div");
		dv.id = "person" + _id;
		dv.appendChild(this.nameInput);
		dv.appendChild(this.priceSelect);
		dv.appendChild(this.noTypeSelect);
		dv.appendChild(this.perNo);
		dv.appendChild(this.insurance);
		dv.appendChild(this.del);
		var list_dv = document.getElementById("list_passenger");
		list_dv.appendChild(dv);
		var person = new Person();
		person.setPrice(this.priceSelect.value);
		person.setInsurancePrice(this.insurance.value);
		persons.put(_id, person);
		PersonView.countPrice();


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