<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@page import="com.user.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link href="../image/star.png" rel="icon" type="image/x-icon" />



</head>
<body>
	<h2>JSTL core Tag: forEach</h2>

	<c:set var="score" value="<%=new int[] { 95, 88, 77, 45, 99 }%>" />

	<c:set var="sum" value="0" />
	점수 :
	<c:forEach var="point" items="${score}">
		<!-- items = 반복할 데이터 지정 (배열 , list, map)등 -->
		${point }
		<c:set var="sum" value="${sum+point}" />
	</c:forEach>
	<br> ${sum }

	<!-- 1~ 100의 합 -->
	<c:set var="sum" value="0" />
	<c:forEach var="i" begin="1" end="100" step="1">
		<c:set var="sum" value="${sum + i }"></c:set>
	</c:forEach>
	<br> 값 : ${sum}

	<h3>Map 타입</h3>

	<%
	HashMap<String, String> map = new HashMap<>();
	map.put("apple", "red");
	map.put("banana", "yellow");
	map.put("grape", "purple");
	pageContext.setAttribute("map", map);
	%>

	<c:forEach var="key" items="${map.keySet()}">
		${key } = ${map[i]} <br>
	</c:forEach>

	<h3>ArrayList 원소 반복</h3>

	<%
	ArrayList<User> userList = new ArrayList<User>();
	userList.add(new User("안재성", "wotjd6344", 18760));
	userList.add(new User("박찬호", "park242", 18500));
	userList.add(new User("이유진", "parklover22", 232));
	request.setAttribute("userList", userList);
	%>

	<c:forEach var="member" items="${userList }" varStatus="status">
		${status.count}. ${member.uname} / ${member.uid } / ${member.unum} <br>
	</c:forEach>

	<h3>2단부터 9단까지 출력</h3>



	<table>
		<c:forEach var="k1" begin="2" end="9" step="1">
			<tr>
				<c:forEach var="k2" begin="1" end="9" step="1">
					<td>${k1}*${k2}= ${k1*k2 }</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

	<h3>[Map(맵)]</h3>
	<c:set var="map" value="<%=new java.util.TreeMap<String, String>()%>" />
	<c:set target="${map }" property="안재성" value="28" />
	<!-- target이 Map 이면 property =  key -  value = 값 -->
	<!-- target이 인스턴스면 property = 필드명 - value = 필드 값 설정 -->
	<c:set target="${map }" property="박찬호" value="29" />
	<c:set target="${map }" property="송진성" value="26" />

	<c:forEach var="data" items="${map }">
		[${data.key } = ${data.value }] <br>
	</c:forEach>
		

	<h3>[값을 변화시키면서 반복 처리]</h3>
	<c:set var="sum" value="0" />
	<c:forEach var="i" begin="1" end="100" step="2">
		<c:set var="sum" value="${sum+i }" />
	</c:forEach>
	<h4>결과 = ${sum }</h4>
	
	<hr>

	<h4>구구단 4단</h4>

	<c:set var="i" value="4" />

	<c:forEach var="j" begin="1" end="9" step="1">
		 ${i} * ${j } = ${i*j } <br>
	</c:forEach>
	
	<hr>


	<!-- delim = 구분자 역할주기 -->
	<h2>JSTL COre Tag: forTokens</h2>
	<p>
		<c:forTokens var="token" items="소설/역사/인문/정치/미술/종료/여행/과학/만화/건강" delims="/">
		${token }
	</c:forTokens>

	</p>

	<hr>

	<p>
		콤마와 점을 구분자로 사용 <br>
		<c:forTokens var="token" items="빨간색,주황색,노란색.초록색.파란색.남색" delims=".,">
			<button type="button">${token }</button>
		</c:forTokens>
	</p>

	<hr>

	<p>
		<c:set var="fruits" value="사과, 파인애플, 바나나, 망고, 귤" />
		<c:forTokens var="token" items="${fruits }" delims=",">
			${token } <br>
		</c:forTokens>
	</p>
</body>
</html>