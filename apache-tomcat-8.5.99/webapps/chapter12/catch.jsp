<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
		</title>
	</head>
	<body>
        <p>
            I just code like this 'int abc= 1/0;'
        </p>
        <c:catch var="exception">
            <%
                int abc = 1/0;
            %>
        </c:catch>
        <p style="border:1px solid #abe105;">
                ${exception}
        </p>
	</body>
</html>