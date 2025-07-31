const actionProcess = function(form, method, action) {
	$(form).attr({
		"method" : method,
		"action" : action
	}).submit();
}

const locationProcess = function(url){
	console.log("로케이션")
	location.href = url;
}

function chkData(item, msg) {
	if($(item).val().replace(/\s/g,"")=="") {
		alert(msg + "입력해주세요");
		$(item).val("");
		$(item).focus();
		return false;
	}
	return true;
}