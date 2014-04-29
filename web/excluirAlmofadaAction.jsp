
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@include file="conn.jsp" %>


<%
String sql = "select * from 998_almofadas";
 %>

<%      
        int pedido = 0;
        pedido = Integer.parseInt(request.getParameter("pedido"));
        int ativo = 0;
        ativo = Integer.parseInt(request.getParameter("ativo"));

        sql = "update 998_almofadas  set ativo = ? where id_almofada = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, ativo);
        ps.setInt(2, pedido);

        ps.executeUpdate();
        response.sendRedirect("exibirAlmofadas.jsp");
%>

