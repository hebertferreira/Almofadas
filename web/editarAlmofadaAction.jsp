
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@include file="conn.jsp" %>


<%
String sql = "select * from 998_almofadas"
        + " join 998_material on 998_almofadas.material = 998_material.id_material "
        + " join 998_tamanho on 998_almofadas.tamanho = 998_tamanho.id_tamanho";
%>

<%      
        int pedido = 0;
        pedido = Integer.parseInt(request.getParameter("pedido"));
        String estampa = request.getParameter("estampa");
        String formato = request.getParameter("formato");
        int tamanho=0;
        tamanho=Integer.parseInt(request.getParameter("tamanho"));
        int material=0;
        material=Integer.parseInt(request.getParameter("material"));
        String dataEntrega = request.getParameter("dataEntrega");
        double preco=0;        
        preco = Double.parseDouble(request.getParameter("preco"));
        int ativo = 0;
        ativo = Integer.parseInt(request.getParameter("ativo"));

        sql = "update 998_almofadas  set estampa = ?, formato = ?, tamanho = ?, material = ?, "
                + "dataEntrega = ?, preco = ?, ativo = ? where id_almofada = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, estampa);
        ps.setString(2, formato);
        ps.setInt(3, tamanho);
        ps.setInt(4, material);
        ps.setString(5, dataEntrega);
        ps.setDouble(6, preco);
        ps.setInt(7, ativo);
        ps.setInt(8, pedido);

        ps.executeUpdate();
        response.sendRedirect("exibirAlmofadas.jsp");
%>

