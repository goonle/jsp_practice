<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
            forTokens tag
		</title>
	</head>
	<body>
        This uses comma and dot for a seperator : <br/>
        I set items as "red,orange.yellow.green,blue,navy,purple"<br/>
        And an attribute called delims is ",."<br/>
        I didn't know that i can set two seperator with linear characters<br/>

        <c:forTokens var="token" items="red,orange.yellow.green,blue,navy,purple" delims=",." varStatus="item">
            <div>${item.index} - ${token}</div>
        </c:forTokens>

	</body>
</html>