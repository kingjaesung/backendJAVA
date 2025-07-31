<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>import 태그 이쿠죠</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />


<style type="text/css">
div.target {
	margin: 5px
}
</style>

</head>
<body>

	<h2>JSTL Core Tag: import</h2>
	<hr>
	<div class="target">
		<c:import url="forEach.jsp" />
		<hr>
	</div>

	<div class="target">
		<c:import url="/jstl/if.jsp">
			<c:param name="jumsu" value="88"></c:param>
		</c:import>
	</div>

	<div class="target">
		<c:import url="http://localhost:8080/servletExample/list" />
		<hr>
	</div>

	<%-- 	<c:import url="https://www.naver.com/" var ="naver" />
	<p> ${naver } </p> --%>

	<c:url var="urlHeader" value="header.jsp">
		<c:param name="id" value="wotjd6344"></c:param>
	</c:url>


	<h3>&lt;c:url&gt; 과 &lt;c:param&gt; 태그의 처리 결과 : ${urlHeader}</h3>
	
	<c:import url="${urlHeader }" var="head"></c:import>
	
	<div id ="one">
		${head }	
	</div>
	<!--  url에 var 로 출력하면 urlHeader?name=wotjd6344 출력 -->
	<!-- url로 불러온 주소값을 import에 넣고 var로 출력시 본문 출력 -->
	
</body>
</html>