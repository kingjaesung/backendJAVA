$("#submitBtn").on("click", function(){
	if($("#name").val().replace(/\s/g,"")==""){
		alert("이름을 입력해 주세요");
		$("#name").val("");
		$("#name").focus();
		return;
	}
	if($("#address").val().replace(/\s/g,"")==""){
		alert("주소를 입력해 주세요");
		$("#address").val("");
		$("#address").focus();
		return;
	}
	
	$("#dataForm").attr({
		"method" : "post",
		"action" : "/servletExample/getData"
	});
	
	$("#dataForm").submit();
})