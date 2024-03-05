<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
		</title>
	</head>
	<body>
        <c:redirect url="/url.jsp">
            <c:param name="isRedirected" value="true"></c:param>
        </c:redirect>
	</body>
</html>