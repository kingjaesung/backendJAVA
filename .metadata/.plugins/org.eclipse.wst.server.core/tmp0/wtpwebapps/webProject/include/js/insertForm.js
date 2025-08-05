$("#boardInsert").on("click", ()=>{
	console.log("글 저장 버튼 활성화 확인");
	if(!chkData("#author","이름을")) return;
	else if(!chkData("#title","제목을")) return;
	else if(!chkData("#content","작성할 내용을")) return;
	else if(!chkData("#passwd","비밀번호를")) return;
	else {
		console.log("액션프로세스 ");
		actionProcess("#f_writeForm", "post", "/board/insertBoard.do")
	}
});

$("#boardListBtn").on("click", ()=> {
	locationProcess("/board/getBoardList.do");
});