<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="tf" tagdir="WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>
            sum 태그 사용
		</title>
	</head>
	<body>
        <tf:sum begin="1" end="10">
            1 - 10 까지의 합 : ${sum}
        </tf:sum>
    </body>
</html>