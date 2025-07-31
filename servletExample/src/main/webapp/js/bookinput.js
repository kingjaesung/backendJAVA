$("#inputBtn").on("click", function() {

	let isvalid = true;

	if ($("#title").val().trim() === "" ||
		$("#author").val().trim() === "" ||
		$("#publisher").val().trim() === "") {
		alert("책 제목, 작가, 출판사등 전부 입력해주세요");
		isvalid = false;
	};

	if (isvalid) {
		$("#bookForm").attr({
			"action": "/servletExample/bookInput",
			"method": "get"
		});
		$("#bookForm").submit();
	}
});