$("#boardUpdateBtn").on("click", function() {
	if (!chkData("#title", "제목을")) return;
	else if(!chkData("#content", "내용을")) return;
	actionProcess("#f_updateform", "post", "/board/updateBoard.do");
});

$("#boardListBtn").on("click", function(){
	locationProcess("/board/getBoardList.do");
})