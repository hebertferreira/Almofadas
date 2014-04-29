package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

public final class editarAlmofadaSelecionada_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("   \n");
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

String sql = "select * from 998_almofadas"
        + " join 998_material on 998_almofadas.material = 998_material.id_material "
        + " join 998_tamanho on 998_almofadas.tamanho = 998_tamanho.id_tamanho"
        + " order by id_almofada ";        
Statement ps = conn.createStatement();
ResultSet rs = ps.executeQuery(sql);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <title>Almofadas</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"li-menu\"><a href=\"cadastrarAlmofada.jsp\">Cadastrar almofada</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"exibirAlmofadas.jsp\">Exibir Almofadas</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"editarAlmofadas.jsp\">Editar Almofadas</a></li>\n");
      out.write("                <li class=\"li-menu\"><a href=\"excluirAlmofadas.jsp\">Excluir Almofadas</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h1>Lista de Pedidos</h1>\n");
      out.write("\n");
      out.write("        ");

        while(rs.next()){
        
      out.write("\n");
      out.write("        \n");
      out.write("        <ul id=\"lista-almofadas\">\n");
      out.write("            <form method=\"get\" action=\"cadastrarAlmofadaAction.jsp\" >\n");
      out.write("\n");
      out.write("                <li><label>Pedido: </label>");
      out.print(rs.getString("id_almofada"));
      out.write("</li>\n");
      out.write("                <li><label>Estampa</label>\n");
      out.write("                    <input type=\"text\" name=\"estampa\" placeholder=\"");
      out.print(rs.getString("estampa"));
      out.write("\"</li>\n");
      out.write("                <li><label>Formato</label>\n");
      out.write("                    <input type=\"text\" name=\"estampa\" placeholder=\"");
      out.print(rs.getString("formato"));
      out.write("\"</li>\n");
      out.write("                <li><label>Pedido </label>");
      out.print(rs.getString("998_tamanho.tamanho"));
      out.write("</li>\n");
      out.write("                <li><label>Pedido </label>");
      out.print(rs.getString("998_material.material"));
      out.write("</li>\n");
      out.write("                <li><label>Pedido </label>");
      out.print(rs.getString("dataEntrega"));
      out.write("</li>\n");
      out.write("                <input class=\"botao-excluir\" type=\"submit\" name=\"excluir\" value=\"Editar\">\n");
      out.write("            </form>\n");
      out.write("        </ul>\n");
      out.write("        ");

        }
         
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");

rs.close();
conn.close();

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
