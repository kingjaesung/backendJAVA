<%@page import="java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>스크립트 확인 - time.jsp</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />


</head>
<body>
	<h2>첫 번쨰 JSP 테스트 예제</h2>
	오늘 날짜 :
	<%=LocalDate.now()%>

	<%
	LocalTime time = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	%>
	<br> 현재 시간 :
	<%=time.format(formatter)%>
	<br>


	<%
	String name = "안재성";
	out.print(name);
	%>

</body>
</html>