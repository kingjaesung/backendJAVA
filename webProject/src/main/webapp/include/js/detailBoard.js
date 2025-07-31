$("#updateFormBtn").on("click", function() {
	console.log("수정 버튼 활성화")
	actionProcess("#dataForm", "get" , "/board/updateForm.do");
});

$("#insertFormBtn").on("click", function(){
	locationProcess("/board/insertForm.do");
});

$("#boardListBtn").on("click", function() {
	locationProcess("/board/getBoardList.do");
})