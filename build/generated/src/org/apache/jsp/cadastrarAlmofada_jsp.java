package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cadastrarAlmofada_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conn.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

Class.forName("com.mysql.jdbc.Driver");

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/divulgando09",
            "divulgando09", "dsw1401");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');

String sql = "Select * from 998_material";
Statement stMaterial = conn.createStatement();
ResultSet rsMaterial = stMaterial.executeQuery(sql);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Almofadas</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"li-menu\"><a href=\"cadastrarAlmofada.jsp\">Cadastrar almofada</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"exibirAlmofadas.jsp\">Exibir Almofadas</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"editarAlmofadas.jsp\">Editar Almofadas</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"excluirAlmofadas.jsp\">Excluir Almofadas</a></li>\n");
      out.write("            \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <h1>Cadastro de fabricação de uma nova almofada</h1>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"div-dados\">\n");
      out.write("            \n");
      out.write("            <form method=\"get\" action=\"cadastrarAlmofadaAction.jsp\" >\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"li-atributos\">\n");
      out.write("                        <label>Estampa</label><input type=\"text\" name=\"estampa\"></li>\n");
      out.write("                    <li class=\"li-atributos\">Formato\n");
      out.write("                        <input type=\"text\" name=\"formato\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"li-atributos\">\n");
      out.write("                        <label>Tamanho</label><select name=\"tamanho\">\n");
      out.write("                            <option value=\"1\">Pequeno</option>\n");
      out.write("                            <option value=\"2\">Média</option>\n");
      out.write("                            <option value=\"3\">Grande</option>\n");
      out.write("                            <option value=\"4\">Extra Grande</option> \n");
      out.write("                            <option value=\"5\">Maximus Ultra</option>\n");
      out.write("                        </select></li>\n");
      out.write("                        <li class=\"li-atributos\">\n");
      out.write("                            <label>Material</label><select name=\"material\">\n");
      out.write("                                ");
 
while(rsMaterial.next()){ 

      out.write("\n");
      out.write("<option value=\"");
      out.print(rsMaterial.getInt("id_material"));
      out.write('"');
      out.write('>');
      out.print(rsMaterial.getString("material"));
      out.write("</option>\n");
      out.write("                            ");

                            }
                             
      out.write("\n");
      out.write("                            </select></li>\n");
      out.write("                    <li class=\"li-atributos\">\n");
      out.write("                        <label>Data para Entrega</label>\n");
      out.write("                        <input type=\"text\" name=\"dataEntrega\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"li-atributos\">\n");
      out.write("                        <label>Preço</label>\n");
      out.write("                        <input type=\"text\" name=\"preco\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"li-atributos\">\n");
      out.write("                        <input id=\"radio-confirmacao\" type=\"radio\" name=\"ativo\" value=\"1\" checked>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li style=\"margin-left: 23%;\">\n");
      out.write("                        <input type=\"submit\" name=\"fabricar\" value=\"salvar\" >\n");
      out.write("                        <input type=\"reset\" name=\"limpar\" value=\"limpar\">\n");
      out.write("                    </li>\n");
      out.write("                        \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
