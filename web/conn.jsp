
<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.jdbc.Driver");

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/divulgando09",
            "divulgando09", "dsw1401");
%>


<%--
Class.forName("com.mysql.jdbc.Driver");

Connection conn = DriverManager.getConnection("jdbc:mysql://mysql.divulgando.com.br/divulgando09",
            "divulgando09", "dsw1401");
--%>
