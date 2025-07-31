<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
	String data = request.getParameter("scoreInput");
	int score = 0;
	if (data != null) {
		score = Integer.parseInt(data);
	};
	%>
	
	<%! char result = ' '; %>

	<%
		int switchScore = score / 10;
		switch(switchScore){
		case 10: case 9: 
			result = 'A';
			break;
		case 8:
			result = 'B';
			break;
		case 7:
			result = 'C';
			break;
		case 6:
			result = 'D';
			break;
		default :
			result = 'F';
		};
	%>
	
	<div>당신의 점수는 <%= score %> 입니다</div>
	<div>당신의 학점은 <%= result %> 입니다</div>
	<button type="button" onclick="history.back()">돌아가기</button>

</body>
</html>