<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <fmt:setLocale value="ko" scope="request"></fmt:setLocale> -->
<!-- <fmt:requestEncoding value="utf-8"></fmt:requestEncoding> -->
<html>
	<head>
        <title>
        </title>
        <meta charset="UTF-8">
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
            <hr>
            <fmt:bundle basename="resource.message">
                <fmt:message key="GREETING" var="greeting"/>
                <p> I code fmt:bundle and fmt.message above for following instruction of this book but it doesn't show any messages</p>
                <p style="background:yellow"> is it working now? ${greeting}</p>
                <p>No it's not woring. I guess it is not reading the file</p>
            </fmt:bundle>
            <p style="background:green">
                The problem was library prefix set. <br>
                I just copy taglib and change core to fmt. so The tag name was c: but i code as fmt.
            </p>
            <p>
                Another problem is ascii code is breaking
            </p>
        </div>
	</body>
</html>