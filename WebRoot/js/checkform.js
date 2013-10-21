String.prototype.trim = function() {
	return this.replace(/^\s+|\s+$/g,"");
}
String.prototype.ltrim = function() {
	return this.replace(/^\s+/,"");
}
String.prototype.rtrim = function() {
	return this.replace(/\s+$/,"");
}
	
// 输入不能为空
function notNull(elementId, label) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	if (document.getElementById(elementId).value == null
			|| document.getElementById(elementId).value == "") {
		alert(label + "不能为空！");
		document.getElementById(elementId).focus();
		return false;
	}
	return true;
}

function getLength(str){
	var byteLen=0,len=str.length;
	if(str){
		for(var i=0; i<len; i++){
			if(str.charCodeAt(i)>255){
				byteLen += 2;
			}else{
				byteLen++;
			}
		}
		return byteLen;
	}else{
		return 0;
	}
}

// 输入不能超长
function overLen(elementId, label, len) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	if (getLength(document.getElementById(elementId).value) > len) {
		alert(label + "长度不能超过" + len + "！");
		document.getElementById(elementId).focus();
		return false;
	}
	return true;
}

// 输入必须为整数
function notInt(elementId, label) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var obj = document.getElementById(elementId);
	var regu = /^-?\d+$/;
	if(!regu.test(obj.value)){
		alert(label+"必须为一个有效的整数");
		obj.value = "";
		obj.focus();
		return false;
	}
	return true;
}

// 输入必须为整数
function notNInt(elementId, label) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var obj = document.getElementById(elementId);
	var regu = /^-?\d+$/;
	if(!regu.test(obj.value)){
		alert(label+"必须为一个有效的整数");
		obj.value = "";
		obj.focus();
		return false;
	} else if (document.getElementById(elementId).value<=0){
		alert(label+"必须为一个大于零的整数");
		obj.value = "";
		obj.focus();
		return false;
	}
	return true;
}

// 输入必须为整数
function isInt(value) {
	var regu = /^-?\d+$/;
	if(!regu.test(value)){		
		return false;
	}
	return true;
}

// 输入必须为数字
function isNum(value) {
	var re = /^-?\d+\.\d+$/;
	var regu = /^-?\d+$/;
	if (!re.test(value) && !regu.test(value)) {
		return false;
	}
	return true;
}

// 输入必须为正整数
function isNInt(value) {
	var regu = /^-?\d+$/;
	if(!regu.test(value)){		
		return false;
	}
	if (value<=0)
		return false;
	return true;
}

// 输入必须为正数字
function isNNum(value) {
	var re = /^-?\d+\.\d+$/;
	var regu = /^-?\d+$/;
	if (!re.test(value) && !regu.test(value)) {
		return false;
	}
	if (value<=0)
		return false;
	return true;
}

// 输入必须为数字
function notNum(elementId, label) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var obj = document.getElementById(elementId);
	var re = /^-?\d+\.\d+$/;
	var regu = /^-?\d+$/;
	if (!re.test(obj.value) && !regu.test(obj.value)) {
		alert(label+"必须为一个有效的数字");
		obj.value = "";
		obj.focus();
		return false;
	}
	return true;
}

// 输入必须为大于0的数字
function notNNum(elementId, label) {
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var obj = document.getElementById(elementId);
	var re = /^-?\d+\.\d+$/;
	var regu = /^-?\d+$/;
	if (!re.test(obj.value) && !regu.test(obj.value)) {
		alert(label+"必须为一个有效的数字");
		obj.value = "";
		obj.focus();
		return false;
	} else if(document.getElementById(elementId).value<=0){
		alert(label+"必须为一个大于零的数字");
		obj.value = "";
		obj.focus();
		return false;
	}
	
	return true;
}

//输入必须为正确邮箱
function isEmail(elementId,label)
{
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var temp = document.getElementById(elementId);
	// 对电子邮件的验证
	var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	if(!myreg.test(temp.value))
	 {
		alert(label+'请输入有效的E_mail');
	 	myreg.focus();
	 	return false;
	 }
	return true;
}

//输入必须为正确手机号码
function isMobile(elementId,label)
{
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var temp = document.getElementById(elementId);
	// 对手机号码的验证
	var myreg =/^((13[0-9]{1})|159|153)+\d{8}$/;
	if(!myreg.test(temp.value))
	 {
		alert(label+'请输入有效的手机号码');
	 	myreg.focus();
	 	return false;
	 }
	return true;
}

//输入必须为正确邮政编码
function isPostCode(elementId,label)
{
	document.getElementById(elementId).value=document.getElementById(elementId).value.trim();
	var temp = document.getElementById(elementId);
	// 对手机号码的验证
	var myreg =/^[0-9]{6}$/; 
	if(!myreg.test(temp.value))
	 {
		alert(label+'请输入有效的邮政编码');
	 	myreg.focus();
	 	return false;
	 }
	return true;
}

//输入必须省市区信息
function isSSQ(elementId_A,elementId_B,elementId_C)
{
	var A=document.getElementById(elementId_A);
	var B=document.getElementById(elementId_B);
	var c=document.getElementById(elementId_C);
	
	if(A[0].selectedIndex==0||B[0].selectedIndex==0||C[0].selectedIndex==0){
		alert(label+'请输入有效省市区信息');
	 	A.focus();
		return false;
	}
	return true;
}

//输入必须省市区信息
function iscard(elementId_A,elementId_B,elementId_C)
{
	var A=document.getElementById(elementId_A);
	var B=document.getElementById(elementId_B);
	var c=document.getElementById(elementId_C);
	
	if(A[0].selectedIndex==0||B[0].selectedIndex==0||C[0].selectedIndex==0){
		alert(label+'请输入有效省市区信息');
	 	A.focus();
		return false;
	}
	return true;
}

