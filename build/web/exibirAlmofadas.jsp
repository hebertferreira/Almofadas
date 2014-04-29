<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>   
<%@include file="conn.jsp" %>

<%
String sql = "select * from 998_almofadas"
        + " join 998_material on 998_almofadas.material = 998_material.id_material "
        + " join 998_tamanho on 998_almofadas.tamanho = 998_tamanho.id_tamanho"
        + " where ativo = 1"
        + " order by id_almofada ";        
Statement ps = conn.createStatement();
ResultSet rs = ps.executeQuery(sql);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Almofadas</title>
        
    </head>
    <body>
        <nav>
            <ul>
                <li class="li-menu"><a href="cadastrarAlmofada.jsp">Cadastrar almofada</a></li>
                <li class="li-menu"><a href="exibirAlmofadas.jsp">Exibir Almofadas</a></li>
                <li class="li-menu"><a href="editarAlmofadas.jsp">Editar Almofadas</a></li>
                <li class="li-menu"><a href="excluirAlmofadas.jsp">Excluir Almofadas</a></li>
            </ul>
        </nav>
        <br>
        <br>
        <h1>Lista de Pedidos</h1>

        <%
        while(rs.next()){
        %>
        
        <ul id="lista-almofadas">
                <li>Pedido: <%=rs.getInt("id_almofada")%></li>
                <li><%=rs.getString("estampa")%></li>
                <li><%=rs.getString("formato")%></li>
                <li><%=rs.getString("998_tamanho.tamanho")%></li>
                <li><%=rs.getString("998_material.material")%></li>
                <li><%=rs.getString("dataEntrega")%></li>
        </ul>
        <%
        }
         %>            
    </body>
</html>
<%
rs.close();
conn.close();
%>