

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@include file="conn.jsp" %>
<%
String sql = "select * from 998_almofadas"
        + " join 998_material on 998_almofadas.material = 998_material.id_material "
        + " join 998_tamanho on 998_almofadas.tamanho = 998_tamanho.id_tamanho"
       // + " where ativo = 1"
        + " order by id_almofada ";        
Statement ps = conn.createStatement();
ResultSet rs = ps.executeQuery(sql);

sql = "Select * from 998_material";
Statement stMaterial = conn.createStatement();
ResultSet rsMaterial = stMaterial.executeQuery(sql);

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
        <h1>Excluir Pedidos</h1><div id="div-dados">
            
            <form method="get" action="excluirAlmofadaAction.jsp" >
                <ul>
                    <li class="li-atributos">
                        <label>Selecione o Pedido</label><select name="pedido">
                            <% 
                    while(rs.next()){ 
                            %>
                                <option value="<%=rs.getInt("id_almofada")%>"><%=rs.getInt("id_almofada")%></option>
                            <%
                            }
                             %>
                        </select>
                    <li class="li-atributos">
                        <input id="radio-confirmacao" type="radio" name="ativo" value="0" checked>
                    </li>
                    <li class="li-atributos">
                        <blockquote>
                            <h4>Atenção</h4>
                            <p>O pedido, ao ser excluído, será inativado, para que não se gere incosistência no banco de dados. Então não será exibido em qualquer lista.
                        </blockquote>
                    </li>                       
                    <li style="margin-left: 19%;">
                        <input class="botao-padrao" type="submit" name="fabricar" value="Excluir" >
                    </li>                        
            </form>
        </ul>
                    
    </body>
</html>
