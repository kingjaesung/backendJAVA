<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/common/header.jsp"%>

<body>
	<div class="container">
		<div class="text-center">
			<h3>게시판 입력화면</h3>
		</div>




		<form id="f_writeForm">
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">작성자</span>
				<input type="text" id="author" name="author" class="form-control" placeholder="작성자 입력" maxlength="6">
			</div>



			<div class="mb-3">
				<label for="basic-url" class="form-label">제목작성</label>
				<div class="input-group">
					<span class="input-group-text" id="basic-addon3">글 제목</span>
					<input type="text" class="form-control" id="title" name="title" placeholder="글제목 입력">
				</div>
				<div class="form-text" id="basic-addon4">제목 작성 안하면 안돼</div>
			</div>




			<div class="input-group">
				<span class="input-group-text">글 내용</span>
				<textarea name="content" id="content" class="form-control" rows="8"></textarea>
			</div>

			<br>

			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon4">비밀번호</span>
				<input type="password" class="form-control" id="passwd" name="passwd" placeholder="비밀번호 입력">
			</div>

		</form>

		<div class="text-end mt-3">
			<button type="button" class="btn btn-primary" id="boardInsert">글저장</button>
			<button type="button" class="btn btn-primary" id="boardListBtn">글목록</button>
		</div>
	</div>



	<%@ include file="/WEB-INF/common/footer.jsp"%>
	<script src="/include/js/insertForm.js"></script>
	<!-- <script src=""></script> 파일 생성 주석 해제-->
	<script>
		let errorMsg ="${errorMsg}";
		if(errorMsg != ""){
			alert(errorMsg);
			errorMsg = "";
		}
	</script>

</body>
</html>