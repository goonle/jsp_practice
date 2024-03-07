<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:setBundle var="message" basename="resource.message" />

<fmt:message bundle="${message}" key="TITLE" var="title" />
<html>
	<head>
		<title>
				${title}
		</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<fmt:message bundle="${message}" key="TITLEE"/>
		<br>
		<c:if test="${!empty param.id}">
			<fmt:message bundle="${message}" key="VISITOR">
				<fmt:param value="${param.id}"/>
			</fmt:message>
		</c:if>
		I couldn't fix this problems. NEXT!
		<div></div>
	</body>
</html>