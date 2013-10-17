function Person() {
	var name = "";
	var price = new Number();
	var perNoType = "";
	var perNo = "";
	var insurancePrice = new Number();
	var birthday = "";

	this.getBirthday = function() {
		return birthday;
	}

	this.setBirthday = function(_birthday) {
		birthday = _birthday;
	}
	
	this.getName = function() {
		return name;
	}

	this.setName = function(_name) {
		name = _name;
	}

	this.getPrice = function() {
		return price;
	}

	this.setPrice = function(_price) {
		price = _price;
	}
	this.getPerNoType = function() {
		return perNoType;
	}

	this.setPerNoType = function(_perNoType) {
		perNoType = _perNoType;
	}
	this.getPerNo = function() {
		return perNo;
	}

	this.setPerNo = function(_perNo) {
		perNo = _perNo;
	}
	this.getInsurancePrice = function() {
		return insurancePrice;
	}

	this.setInsurancePrice = function(_insurancePrice) {
		insurancePrice = _insurancePrice;
	}
}