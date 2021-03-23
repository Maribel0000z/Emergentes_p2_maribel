package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.emergentes.modelo.Reproductos;

public final class index_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Productos</title>\n");
      out.write("    </head>\n");
      out.write("          <body>   \n");
      out.write("         ");

            if (session.getAttribute("licur") == null) {
                ArrayList<Reproductos> listaux = new ArrayList<Reproductos>();
                session.setAttribute("licur", listaux);
            }
            ArrayList<Reproductos> cur = (ArrayList<Reproductos>) session.getAttribute("licur");

        
      out.write("\n");
      out.write("         <form action=\"productos\" method=\"post\">  \n");
      out.write("        <table border='1' cellspacing=\"0\" align=\"center\" >\n");
      out.write("             \n");
      out.write("            <caption><h2 align=\"center\">Registro de Productos</h2></caption>\n");
      out.write("           <a href=\"productos?op=1\">Nuevo</a>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Producto</th>\n");
      out.write("                <th>Categoria</th>\n");
      out.write("                <th>Existencia</th>\n");
      out.write("                <th>Precio</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("                 ");
           
                     if (cur != null) {
                    for (Reproductos item : cur) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\t\t <td>");
      out.print(item.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(item.getProducto());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(item.getCategorida());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(item.getExistencia());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(item.getPrecio());
      out.write("</td>\n");
      out.write("                <td><a href=\"productos?op=2&id=");
      out.print(item.getId());
      out.write("\">\n");
      out.write("                        Editar</a>\n");
      out.write("                </td>\n");
      out.write("                <td><a href=\"productos?op=3&id=");
      out.print(item.getId());
      out.write("\"\n");
      out.write("                       onclick='return confirm(\"Esta seguro de elimiar el registro ?\");\n");
      out.write("                       '>Eliminar</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("              ");

                    }
                }
            
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"login.jsp\">Salir de Registro Productos</a>\n");
      out.write("    </body>\n");
      out.write(" \n");
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
