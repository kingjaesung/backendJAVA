<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>저장된 객체 추출:scopeEL.jsp</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />


</head>
<body>
	<h2>저장된 객체 추출</h2>
	<hr>
	<%
	pageContext.setAttribute("message1", "pageContext 객체에 저장된 문자열 객체 박찬호");

	request.setAttribute("message", "HttpServletRequest 객체에 저장된 문자열 객체 박찬호");
	session.setAttribute("message3", "HttpSession 객체에 저장된 문자열 객체");
	application.setAttribute("message", "ServletContext 객체에 저장된 문자열 객체");
	%>
	<!-- pageContext = 해당 페이지에서만 유효한 객체
    	request = 포워드로 넘겨준 페이지까지만 유효한 객체
    	session = 해당 세션이 종료될때 까지만 유효 
    	application = 해당 어플리케이션이 종료 될떄까지 유효
    -->

	pageScope 객체에서 추출 : : ${pageScope.message1}
	<br> requestScope 객체에서 추출 : ${requestScope.message }
	<br> sessionScope 객체에서 추출 : ${sessionScope.message3 }
	<br> applicationScope 객체에서 추출 : ${applicationScope.message }
	<br>
	<hr>
	message 추출 : ${message}

</body>
</html>