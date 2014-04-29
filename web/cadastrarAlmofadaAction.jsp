
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@include file="conn.jsp" %>

<%
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

        String sql = "insert into 998_almofadas (estampa, formato, tamanho, material, dataEntrega, preco, ativo)"
        + " values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, estampa);
        ps.setString(2, formato);
        ps.setInt(3, tamanho);
        ps.setInt(4, material);
        ps.setString(5, dataEntrega);
        ps.setDouble(6, preco);
        ps.setInt(7, ativo);
        ps.executeUpdate();
        response.sendRedirect("exibirAlmofadas.jsp");
%>
