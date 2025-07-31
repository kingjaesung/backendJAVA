<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSTL Core Tag if</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />


</head>
<body>

	

	<h3>JSTL Core Tag if</h3>

	<c:set var="num"> 95</c:set>

	<c:if test="${num >= 90 }">
		A클래스~ <br>
	</c:if>

	<c:set var="number" value="4"></c:set>
	숫자 ${number }은
	<c:if test="${number mod 2 == 0 }">
		짝수
	</c:if>
	<c:if test="${number mod 1 ==1 }">
		홀수
	</c:if>
	입니다.
	<br>

	<h3>JSTL Core Tag: choose</h3>

	<%-- <c:set var ="today" value="<%= new java.util.Date()%> --%>
	<jsp:useBean id="today" class="java.util.Date"></jsp:useBean>
	<c:choose>
		<c:when test="${today.hours < 12 }">
			굿모닝~
		</c:when>
		<c:when test="${today.hours <  18 }">
			굿 에프터눈~
		</c:when>
		<c:otherwise>
			굿 이븐이
		</c:otherwise>
	</c:choose>
	<hr>

	<c:set var="jumsu" value="${param.jumsu }"></c:set>
	점수 :
	<c:out value="${jumsu }" default="78" />
	점 / 학점:
	<c:choose>
		<c:when test="${jumsu >=90 }">
			A
		</c:when>
		<c:when test="${jumsu >= 80 }">
			B
		</c:when>
		<c:when test="${jumsu >= 70 }">
			C
		</c:when>
		<c:when test="${jumsu >= 60 }">
			D
		</c:when>
		<c:otherwise>
			F
		</c:otherwise>
	</c:choose>
	학점.
</body>
</html>