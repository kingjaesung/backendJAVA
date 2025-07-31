<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/common/header.jsp"%>

<body>
	<div class="container">
		<div class="text-center">
			<h3>게시판 상세화면</h3>
		</div>

		<form id="f_updateform">
			<div class="text-center">
				<%-- 반ㄷ드시 수정할 글번호를 서버에 전달해 주어야 한다 --%>
				<input type="hidden" name="num" id="num" value="${updateDate.num }">
				<table class="table table-bordered">
					<tr>
						<td class="text-center">글번호</td>
						<td class="text=start">${updatedata.num }
							<span>( 조회수: ${updateData.readcnt })</span>
						</td>
						<td class="text=conter">작성일</td>
						<td class="text-start">${updateData.writeday}</td>
					</tr>
					<tr>
						<td class="text-center">작성자</td>
						<td colspan="3" class="text-start">${updateData.author}</td>
					</tr>
					<tr>
						<td class="text-center">글제목</td>
						<td colspan="3">
							<input type="text" name="titl" id="title" value="${updateDate.title }" class="form-nontrol">
						</td>
					</tr>
					<tr>
						<td class="text-center">글 내용</td>
						<td colspan="3">
							<textarea rows="8" name="content" id="content" class="form-control"></textarea>
						</td>
					</tr>
					<tr>
						<td class="text-center">글내용</td>
						<td colspan="3">
							<input type="password" name="passwd" id="passwd" class="form-control" placeholder="기존 비밀번호가 아닌 수정할 비밀번호를 입력해 주세요">
						</td>
					</tr>

				</table>
			</div>
		</form>

		<div class="text-end">
			<button type="button" id="boardUpdateBtn" class="btn btn-primary btn-sm">글 수정</button>
			<button type="button" id="boardListBtn" class="btn btn-primary btn-sm">글 목록</button>

		</div>
 
	</div>  
	<%@ include file="/WEB-INF/common/footer.jsp" %>
	<script src="/include/js/updateForm.js"></script>

</body>
</html>