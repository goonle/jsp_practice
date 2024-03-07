<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<title>
            Using numberFormat tag
		</title>
	</head>
	<body>
        <c:set var="price" value="10000"/>
        <fmt:formatNumber value="${price}" type="number" var="numberType"/>
        <br/>
        Currency: <fmt:formatNumber value="${price}" type="currency" currencySymbol="Won"/>
        <br/>
        Percentage: <fmt:formatNumber value="${price}" type="percent" groupingUsed="false"/>
        <br/>
        Number: ${numberType}
        <br/>
        Pattern: <fmt:formatNumber value="${price}" pattern="00000000.00"/>
	</body>
</html>