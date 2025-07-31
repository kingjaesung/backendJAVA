<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="../image/star.png" rel="icon" type="image/x-icon" />
    
    
</head>
<body>

<% 
	String grade =	(String)request.getAttribute("grade");
	int score = Integer.parseInt(request.getParameter("scoreInput"));
%>

<div>학생의 점수는 <%= score %> 입니다아앙</div>
<div>학생의 학점은 <%= grade %> 입니다</div>
    
</body>
</html>