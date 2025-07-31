
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- JSP는 기본적으로 HTML 태그와 JSP 표준 태그만 인식한다 
	그런데 JSTL 같은 커스텀 태그 라이브러리를 사용하려면,JSP에게 이 태그는 어디서 왔는지
	알려줘야함 그게 바로 <@ taglib... %> 태그다(태그라이브러리 지시자-->

<!-- 의미 prefix = JSTL 코어태그를 쓸 때 접두어로 c를 쓰겠다는 뜻
	ex c:if, c:forEach -->

<!-- uri="http://java.sun.com/jsp/jstl/core 
		이 URL은 JSTL코어 태그 라이브러리를 가리키는 고유 식별자다 -->

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />


</head>
<body>
	<h2>JSTL COre Tag: set</h2>
	<%
	pageContext.setAttribute("setStr", "set Tag 테스트 입니다");
	out.print(pageContext.getAttribute("setStr"));
	%>
	<!-- out.print(pageContext.getAttribute("setStr")); 
		호출시 내부에서 자동으로 toString()으로 변환하여 String 형으로 출력 -->

	<c:set var="setStr" value="set Tag 테스트입니다." scope="page"></c:set>
	\${pageScope.setStr } = ${setStr }
	<br>

	<c:set var="n"> 24 </c:set>
	\${n } = ${n }
	<br />

	<c:set var="d">
			31.54
		</c:set>
	\${d } = ${d } <br>
	\${n + d } = ${n + d } <br>
	
	<c:set var ="b" value="true"></c:set>
	\${b} = ${b} <br>
	
	<%-- session.setAttribute("str","Hello set Tag!!!")
		out.print(session.getAttribute("str));
	 --%>
	 <c:set var="str" value="Hello set Tag!!!" scope="session"></c:set>
	 \${str } = ${str } <br>
	 \${sessionScope.str } = ${sessionScope.str } <br>
	 
	 <c:remove var="str " scope="page"/>
	 \${str } = ${str } <br>
	 
	 <c:remove var="str" scope="session"/>
	 \${str} = ${str } <br>
</body>
</html>