<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>테이블 예제 : subjectList.jsp</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>

	<%@ page import="java.util.List, com.subject.SubjectVO"%>
	<%
	@SuppressWarnings("unchecked")
	List<SubjectVO> list = (List<SubjectVO>) request.getAttribute("list");
	int counter = list.size();
	%>
	<div class="container">
		<h3>테이블 subject 학과 정보 조회</h3>
		<hr>
		<div id="subjectList">
			<table class="table table-striped">
				<thead>
					<tr class="text-center">
						<th>번호</th>
						<th>학과번호</th>
						<th>학과명</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
					<%
					if (counter > 0) {
						//for(SubjectVO subjectVO : list) {

						for (int i = 0; i < counter; i++) {
							SubjectVO subjectVO = list.get(i);
					%>
					<tr class="text-center" data-no="<%=subjectVO.getNo()%>">
						<td><%=subjectVO.getNo()%></td>
						<td><%=subjectVO.getSubjectNumber()%></td>
						<td><%=subjectVO.getSubjectName()%></td>
						<td>
							<button type="button" class="updateBtn btn btn-outline-success btn-sm">수정</button>
						</td>
						<td>
							<button type="button" class="deleteBtn btn btn-outline-success btn-sm">삭제</button>
						</td>

					</tr>
					<%
					}
					} else {
					%>

					<tr>
						<td colspan="5" class="text-center">조회된 학과 정보가 존재하지 않습니다.</td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
			<div>
				조회된 학과 수는 <span id="counter"> <%=counter%></span>입니다.
			</div>
		</div>

		<div id="subjectForm">
			<jsp:include page="subjectForm.jsp" />
		</div>




	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
	<script src="/servletExample/js/jquery-3.7.1.min.js"></script>
	<script src="/servletExample/js/common.js"></script>
	<script src="/servletExample/js/subjectList.js"></script>

</body>
</html>