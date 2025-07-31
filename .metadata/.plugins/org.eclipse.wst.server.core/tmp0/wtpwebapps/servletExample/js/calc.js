$("#calcBtn").on("click", function() {
	/*$("#calculator").attr({
		"method": "post",
		"action": "/servletExample/calc"
	});*/
	alert("calculator의 method, action 값 변경 완료");
	
	/*if($("#num"))

	$("#calculator").submit();*/
	
	
	
	
	
	
	
	
	
	
	
	
	$.ajax({
		url:"/servletExample/calcservlet2",
		method:"POST",
		data:{
			"num1" : $("#num1").val(),
			"oprator": $("#oprator").val(),
			"num2" : $("#num2").val()
		},
		dataType : "text"
	}).done(function(data){
		$("#result").val(data);
	}).fail(function(xhr, status){
		alert(status +"발생.\n상태:" + xhr.status);
	})
});

