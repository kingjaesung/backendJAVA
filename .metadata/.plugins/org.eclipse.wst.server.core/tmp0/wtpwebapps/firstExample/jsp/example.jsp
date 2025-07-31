<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> [파일명은example.jsp입니다]</h1>
	<%
	int i = 3;
	int j = 42;
	int num = 1;
	
	if (i> j){
		if(i>num){
			 out.print(i);
		}
	} else if(j>i){
		if(j>num){
			out.print(j);
		}
	}else{
		out.print(num);
	}
	%>
	<h3>배열의 값 (12,26,68,98,76,64,8,6,4) 중 최대값과 최소값 구하기</h3>
	
	<% 
	int [] nums = {12,26,68,76,64,8,6,4};
	
	for (int a = 1; a <= nums.length; a++ ){
	
	}
	
	%>
	
	
	
</body>
</html>