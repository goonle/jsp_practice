<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="ko" scope="request"></fmt:setLocale>
<html>
	<head>
		<title>
		</title>
	</head>
	<body>
        <div> This is the first jstl/fmt library</div>
        <div> fmt:requestEncoding value="utf-8"(in JSP tag) == request.setCharacterEncoding("utf-8") (in java)</div>
        <div>
            <p style="border:1px black solid"> 
                I used cmd "native2ascii message_ko.properties.src message_ko.properties"
            </p>
            <p style="background: #777777">
                then cmd shows that "java.lang.Exception: message_ko.properties.src could not be read."
            </p>
            <p>
                There was typo
            </p>
        </div>
	</body>
</html>