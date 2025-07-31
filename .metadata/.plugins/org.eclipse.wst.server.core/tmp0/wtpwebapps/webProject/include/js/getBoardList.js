$("#writeForm").on("click", function(){
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