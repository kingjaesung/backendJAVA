(function autoSubjectNumber() {
	// 자동으로 학번 구하기
	$.ajax({
		url:"/servletExample/subjectNumber",
		method:"post",
		dataType:"text"
	}).done(function(data){
		$("#subjectNumber").val(data);
	}).fail(function(xhr, textStatus){
		alert(textStatus + "발생.\n상태:" + xhr.status);
	})
}) ();

const submitSubjectForm = function(actionUrl) {
	$("#subject").attr({
		"method" : "post",
		"action" : actionUrl
	})
	.submit();
}

$(document).on("click", "#insertBtn", ()=>{
	if(!chkData("#subjectName", "학과명을")) return;
	
	const isNew = $("#no").val() ==="0";
	const actionUrl = isNew ? "/servletExample/insert" : "/servletExample/update";
	submitSubjectForm(actionUrl);
});

//"다시쓰기" 버튼 제어

$("#resetBtn").on("click", () => {
	$("#subjectName").val("");
})

//"수정" 버튼 제어

$(document).on("click",".updateBtn", function(){
	$(".upResetBtn").remove();
	
	const $row = $(this).closest("tr");
	const no = $row.data("no");
	const subjectNumber = $row.children().eq(1).text().trim();
	const subjectName = $row.children().eq(2).text().trim();
	
	$("#no").val(no);
	$("#subjectNumber").val(subjectNumber);
	$("#subjectName").val(subjectName);
	
	
	// 입력완료 > 수정완료
	$("#insertBtn").text("수정완료");
	
	//"수정 취소" 버튼 추가 (중복 방지)
	if(!$(".upResetBtn").length) {
		const $cancelBtn = $("<button>", {
			type : "button",
			class : "upResetBtn btn btn-secondary ms-2",
			text : "수정취시"
			
		});
		$("#insertBtn").after($cancelBtn);
	}
});

