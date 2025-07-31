<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@ page import="example.Clock"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이클립스에서 JSP 춧 문서 작성하기</title>
 <link rel="icon" href="/image/star.png" >

</head>
<body>
	<%
	out.print("<h1>Hello~~JSP~~</h1>");
	%>
	
	<%
	Date nowDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
	String formatDate = dateFormat.format(nowDate);
	%>
	
	<p> 일반적인 JSP 페이지의 형태로 아래와 같이 현자 낼짜를 제공합니다.<br/>
		현재 날짜는 <%=formatDate %> 입니다.
	</p>
	<%
		//example 패키지의 Clock 클래스를 생성하여 오늘 날짜와 시간을 출력해 주세요
		Clock clock = new Clock();
		String data = clock.now();
		%>
</body>
</html>
