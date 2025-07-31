<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.member.User"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />

<%-- 원래는 ${requestScope.user.getUname} 인데 
				표현언어는 requestScope, get 생략하여 
				${user.uname}으로 표기--%>

<style type="text/css">
table , td ,th {
	border: 1px solid black; 
	text-align: center;
}
</style>

</head>
<body>


	<table>
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>회원번호</th>
			<th>주소</th>
			<th>우편번호</th>
		</tr>
		<tr>
			<td>${user.uname }</td>

			<td>${user.uid }</td>
			<td>${user.unum }</td>
			<td>${user.address.city}</td>
			<td>${user.address.zipcode }</td>
		</tr>

	</table>



</body>
</html>