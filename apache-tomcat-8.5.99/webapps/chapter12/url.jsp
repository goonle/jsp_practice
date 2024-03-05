<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
		</title>
	</head>
	<body>
        <c:url value="http://search.daum.net/search" var ="searchUrl">
            <c:param name="w" value="blog"></c:param>
            <c:param name="q" value="park"></c:param>
        </c:url>
        <ul>
            <li>${searchUrl}</li>
            <li><c:url value="/forTokens.jsp"></c:url></li>
            <li><c:url value="./forTokens.jsp"></c:url></li>
        </ul>
        <p style="border:1px solid #111111">
            Why does it show jsessionId?<br>
            It supposed to show only url accoring to the book "JSP 2.3 웹프로그래밍 기초부터 중급까지" <br>
            <br>
            It is not showing jsessionId anymore. What was happend?
            <br>
            Anyway, c:url tag is easy to use to make an url
        </p>
	</body>
</html>