<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<html>
	<head>
		<title>
            out
		</title>
	</head>
	<body>
        <tf:out>
            <jsp:body>
                <u>현재 시간</u>은 <b>${dateEl}</b> 입니다.
            </jsp:body>
        </tf:out>
    </body>
</html>