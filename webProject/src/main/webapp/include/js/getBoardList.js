$("#writeForm").on("click", function() {
	//console.log("글쓰기 버튼 클릭");
	locationProcess("/board/insertForm.do");
})

$(".goDetail").on("click", function() {
	const $row = $(this).closest("tr");
	const num = $row.data("num");
	console.log("num = " + num);

	$("#num").val(num);
	actionProcess("#detailForm", "post", "/board/detailBoard.do");
});

$("#keyword").on("keydown", function(event) {
	if (event.key === "Enter") {
		event.preventDefault();
	}
});

$("#search").on("change", function() {
	debugger
	const selected = $(this).val();

	if (selected === "all") {
		$("#keyword").val("").attr("placeholder", "");
	} else {
		$("#keyword")
			.val("")
			.attr("placeholder", "검색어 입력")
	}
});

$("#searchData").on("click", () => {
	
	console.log("검색 버튼 활성화")
	const searchType = $("#search").val();

	if (searchType != "all") {
		if (!checkForm("#keyword", "검색어를")) return;
	} else {
		$("#keyword").val("");
		//전체 선택시 검색어 초기화
	}

	actionProcess("#f_search", "post", "/board/getBoardList.do");


});