$("#submitBtn ").on("click", function(){
	if($("select[name='menuSelect'] > option:selected").index() < 0){
		alert("메뉴 선택하세요");
		return;
	}else{
		if($("select[name='menuSelect'] > option:selected").length < 2){
			alert("메뉴를 2가지 이상 선택하세요");
			return;
		}
	}
	
	$("#menu").attr({
		"method" : "post",
		"action" : "/servletExample/todatMenu"
	})
	
	$("#menu").submit();
})