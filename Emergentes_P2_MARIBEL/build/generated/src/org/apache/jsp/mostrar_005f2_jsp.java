package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.emergentes.modelo.Reusuarios;

public final class mostrar_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
 
            Reusuarios cur =(Reusuarios)request.getAttribute("micur");
            boolean nuevo = true;
            if(cur.getId()>0)
            {
                nuevo = false;
            }
            
      out.write("\n");
      out.write("   \n");
      out.write("          <form action=\"usuarios\" method=\"post\">\n");
      out.write("          <table cellspacing=\"0\" align=\"center\" >\n");
      out.write("              <caption> <h3 align='center'>Datos del Registro</h3></caption>\n");
      out.write("              <tr>\n");
      out.write("                    <td align=\"right\">Id</td>\n");
      out.write("                    <th><input type=\"text\" name=\"id\" value=\"");
      out.print(cur.getId());
      out.write("\"/></th>\n");
      out.write("\t\t</tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Nombre</td>\n");
      out.write("                    <th><input type=\"text\" name=\"nombre\" value=\"");
      out.print(cur.getNombre());
      out.write("\"/></th>\n");
      out.write("\t\t</tr>\t\n");
      out.write("                \n");
      out.write("\t\t<tr>\n");
      out.write("                        <td align=\"right\">Apellido</td>\n");
      out.write("                    <th><input   type=\"text\" name=\"apellido\" value=\"");
      out.print(cur.getApellido());
      out.write("\"/></th>\n");
      out.write("\t\t</tr>\t\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"right\">Correo</td>\n");
      out.write("                    <th><input   type=\"email\" name=\"correo\" value=\"");
      out.print(cur.getCorreo());
      out.write("\"/></th>\n");
      out.write("\t\t</tr>\t\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"right\">Contraseña</td>\n");
      out.write("                    <th><input   type=\"password\" name=\"password\" value=\"");
      out.print(cur.getContraseña());
      out.write("\"/></th>\n");
      out.write("\t\t</tr>\t\n");
      out.write("                      \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"hidden\" name=\"op\"value=\"4\"</td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"nuevo\"value=\"");
      out.print(nuevo);
      out.write("\"></td>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td></td>\n");
      out.write("                      <td><input type=\"submit\" value=\"Enviar\"</td>\n");
      out.write("                      <td></td>\n");
      out.write("                </tr>\n");
      out.write("           \n");
      out.write("        </table>      \n");
      out.write("          </form>\n");
      out.write("   \n");
      out.write("             <a href=\"index_2.jsp\">Volver</a>\n");
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
