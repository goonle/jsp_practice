<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tf" tagdir="WEB-INF/tags" %>
<html>
	<head>
		<title>
            removeHTMLVar
		</title>
	</head>
	<body>
        <c:set var="dateEL" value="<%= new Date() %>"/>
		<tf:removeHtml trim="true">
			<h1 > 현재 <b>시간</b>은 ${dateEL} 입니다.</h1>
		</tf:removeHtml>
		<br>
		<tf:removeHtml length="15" var="removed" trim="true">
			<u>현재 시간</u>은 <b>${dateEL}</b> 입니다.
			trail 은 어미에 붙는 것
		</tf:removeHtml>
		<br>
		<tf:removeHtml length="15" >
			<jsp:body><u>현재 시간</u>은 <b>${dateEL}</b> 입니다.</jsp:body>
		</tf:removeHtml>
	</body>
</html>