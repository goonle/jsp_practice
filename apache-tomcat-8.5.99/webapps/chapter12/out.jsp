<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
		</title>
	</head>
	<body>
        <c:out value="is it going to printed?<abcv>&'\"" escapeXml="true" default="기본값"></c:out>
        <br/>
        <c:out value="is it going to printed?<abcv>&'" escapeXml="false" default="기본값"></c:out>
        <p style="border: #af5faf 1px solid">
            so escapeXml is working even though it contains html tags
        </p>
	</body>
</html>