package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panel_jsp extends org.apache.jasper.runtime.HttpJspBase
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


 if(session.getAttribute("login")!="OK")
 {
    response.sendRedirect("login.jsp");
 }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Opciones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table cellespacing=\"6\" align=\"center\">\n");
      out.write("            <caption><h2 align=\"center\">Formularios</h2></caption>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"index_1.jsp\">Inscripción en curso</a></td>\n");
      out.write("\t\t</tr>\t\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td><a href=\"index_2.jsp\">Registro de usuarios</a></td>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("                 <tr>\n");
      out.write("                     \n");
      out.write("                    <td>  <a href=\"index_3.jsp\">Inscripcion en productos</a></td>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("                  <tr>\n");
      out.write("                    <td> <a href=\"index_4.jsp\">Registro de libros</a></td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                            \n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"center\"> <a href=\"LoginSession\">Salir</a>\n");
      out.write("                  </tr>\n");
      out.write("        </table>\n");
      out.write("     \n");
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
