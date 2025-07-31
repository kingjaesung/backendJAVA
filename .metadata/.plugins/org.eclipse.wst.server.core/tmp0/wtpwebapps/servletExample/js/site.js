$("#btn").on("click", function(){
	if(!$("input[name='site']").is(":checked")){
		alert("사이트를 체크 해주세요");
		return;
	}
	
	$("#siteForm").attr({
		"action" : "/servletExample/portalSite",
		"method" : "get"
	});
	$("#siteForm").submit();
	
});