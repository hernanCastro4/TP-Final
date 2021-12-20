package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.Controlador;
import java.util.List;
import logica.Servicio;

public final class editServicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- SideBar -->\n");
      out.write("        <section class=\"full-box cover dashboard-sideBar\">\n");
      out.write("            <div class=\"full-box dashboard-sideBar-bg btn-menu-dashboard\"></div>\n");
      out.write("            <div class=\"full-box dashboard-sideBar-ct\">\n");
      out.write("                <!--SideBar Title -->\n");
      out.write("                <div class=\"full-box text-uppercase text-center text-titles dashboard-sideBar-title\">\n");
      out.write("                    Empresa de Turismo <i class=\"zmdi zmdi-close btn-menu-dashboard visible-xs\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- SideBar Menu -->\n");
      out.write("                <ul class=\"list-unstyled full-box dashboard-sideBar-Menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"home.jsp\">\n");
      out.write("                            Regresar\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Content page-->\n");
      out.write("        <section class=\"full-box dashboard-contentPage\">\n");
      out.write("\n");
      out.write("            <!-- Content page -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1 class=\"text-titles\">Modificar Servicios</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" style=\"margin-bottom: 15px;\">\n");
      out.write("                            <li class=\"active\"><a data-toggle=\"tab\"></a></li>\n");
      out.write("                            <li><a data-toggle=\"tab\"></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane fade active in\" id=\"new\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-12 col-md-10 col-md-offset-1\">\n");
      out.write("                                            <form action=\"svEditarServ\" method=\"get\">\n");
      out.write("                                                ");
 HttpSession misession = request.getSession();
                                                    Servicio serv = (Servicio) misession.getAttribute("servicio");
                                                    {
      out.write(" \n");
      out.write("                                                <p>Nombre</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">                                                  \n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"nombre\" value=\"");
      out.print(serv.getNombre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Descripción</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"descripcion\" value=\"");
      out.print(serv.getDescripcion_breve());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Destino</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"destino\" value=\"");
      out.print(serv.getDestino_servicio());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Fecha Servicio</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <label>DD/MM/YYYY</label>\n");
      out.write("                                                    <input class=\"form-control\" type=\"datetime\" name=\"fechaServicio\" value=\"");
      out.print(serv.getFecha_servicio());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Costo</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"costo\" value=\"");
      out.print(serv.getCosto_servicio());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(serv.getCodigo_servicio());
      out.write("\"\n");
      out.write("                                                <p class=\"text-center\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-info btn-raised btn-sm\">Modificar</button>\n");
      out.write("                                                </p>\n");
      out.write("                                                  ");
}
      out.write("\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"list\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <p>Buscar</p>\n");
      out.write("                                    <div class=\"form-group label-floating\">\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"busquedaServicio\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"text-right\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-info btn-raised btn-sm\">Buscar</button>\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--====== Scripts -->\n");
      out.write("<script src=\"./js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"./js/sweetalert2.min.js\"></script>\n");
      out.write("<script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"./js/material.min.js\"></script>\n");
      out.write("<script src=\"./js/ripples.min.js\"></script>\n");
      out.write("<script src=\"./js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("<script src=\"./js/main.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $.material.init();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
