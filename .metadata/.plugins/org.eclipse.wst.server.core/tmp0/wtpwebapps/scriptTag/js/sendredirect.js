$("#sendBtn").on("click", function(){
	
	alert("sendBtn 버튼 실행");
	
	const $form1 =	$("#form1");
	
	$form1.attr({
		"method" : "post",
		"action" : "../jsp/sendredirect.jsp"
	});
	
	$form1.submit();		

	
});