<%-- 
    Document   : cadastrarAlmofada
    Created on : Apr 9, 2014, 10:54:07 PM
    Author     : hebert
--%>
<%@include file="conn.jsp" %>

<%
String sql = "Select * from 998_material";
Statement stMaterial = conn.createStatement();
ResultSet rsMaterial = stMaterial.executeQuery(sql);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almofadas</title>
        <link rel="stylesheet" type="text/css" href="style.css">
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
        <h1>Cadastro de fabricação de uma nova almofada</h1>
        <br>
        <div id="div-dados">
            
            <form method="get" action="cadastrarAlmofadaAction.jsp" >
                <ul>
                    <li class="li-atributos">
                        <label>Estampa</label><input type="text" name="estampa"></li>
                    <li class="li-atributos">Formato
                        <input type="text" name="formato">
                    </li>
                    <li class="li-atributos">
                        <label>Tamanho</label><select name="tamanho">
                            <option value="1">Pequeno</option>
                            <option value="2">Média</option>
                            <option value="3">Grande</option>
                            <option value="4">Extra Grande</option> 
                            <option value="5">Maximus Ultra</option>
                        </select></li>
                        <li class="li-atributos">
                            <label>Material</label><select name="material">
                                <% 
while(rsMaterial.next()){ 
%>
<option value="<%=rsMaterial.getInt("id_material")%>"><%=rsMaterial.getString("material")%></option>
                            <%
                            }
                             %>
                            </select></li>
                    <li class="li-atributos">
                        <label>Data para Entrega</label>
                        <input type="text" name="dataEntrega">
                    </li>
                    <li class="li-atributos">
                        <label>Preço</label>
                        <input type="text" name="preco">
                    </li>
                    <li class="li-atributos">
                        <input id="radio-confirmacao" type="radio" name="ativo" value="1" checked>
                    </li>
                    
                    <li style="margin-left: 23%;">
                        <input type="submit" name="fabricar" value="salvar" >
                        <input type="reset" name="limpar" value="limpar">
                    </li>
                        
            </form>
        </div>
        
    </body>
</html>
