<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%
    request.setCharacterEncoding("utf-8");

    String memberID = request.getParameter("memberID");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try{
        String jdbcDriver = "jdbc:mysql://localhost:3306/chap14?useUnicode=true&characterEncoding=utf8";
        String dbUser = "jspexam";
        String dbPass= "jsppw";

        conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
        pstmt = conn.prepareStatement(
            "insert into MEMBER values(?, ?, ?, ?)"
        );
        pstmt.setString(1, memberID);
        pstmt.setString(2, password);
        pstmt.setString(3, name);
        pstmt.setString(4, email);
        
        pstmt.excuteUpdate();
    }finally{
        if(pstmt != null) try{ pstmt.close();} catch(SQLException ex){}
        if(conn != null) try{ conn.close();} catch(SQLException ex){}
    }

%>
<html>
	<head>
        <title>
            clone coding
		</title>
	</head>
	<body>
        Added a new record in Member Table
	</body>
</html>