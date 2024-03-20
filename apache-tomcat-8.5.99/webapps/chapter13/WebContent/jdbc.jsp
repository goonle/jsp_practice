<%@ page contentType="text/html; charset=utf-8" %>
<html>
	<head>
        <title>
            clone coding 0
		</title>
	</head>
	<body>
        <form action="/chapter13/insert.jsp" method="post">
            <table border="1">
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="memberID" size="10"></td>
                    <td>password</td>
                    <td><input type="text" name="password" size="10"></td>
                </tr>
                <tr>
                    <td>name</td>
                    <td><input type="text" name="name" size="10"></td>
                    <td>email</td>
                    <td><input type="text" name="email" size="10"></td>
                </tr>
                <tr>
                    <td colspan="4"><input type="submit" value="insert"></td>
                </tr>
            </table>
        </form>
	</body>
</html>