<%@ tag body-content="empty" pageEncoding="utf-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag dynamic-attritubes="optionMap" %>
<%@ attribute name="name" require="true" %>
<%@ taglib prefix="c" uri="http://java.sum.com/jsp/jstl/core" %>
<select name="${name}">
    <c:forEach items="${optionMap}" var="option">
        <option value="${option.key}">${option.value}</option>
    </c:forEach>
</select>