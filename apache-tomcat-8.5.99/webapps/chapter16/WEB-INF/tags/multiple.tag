<%@ tag body-content="tagdependent: pageEncoding="utf-8" %>
<%@ tag trimDirectiveWhiteSpaces="true" %>
<%@ attribute name="count" required="true" type="java.lang.Integer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach begin="${1}" end="${count}" >
    <jsp:doBody />
</c:forEach>
