package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- SideBar -->\n");
      out.write("\n");
      out.write("        <!-- Content page-->\n");
      out.write("       \n");
      out.write("\n");
      out.write("            <!-- Content page -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1 class=\"text-titles\">Empleados</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" style=\"margin-bottom: 15px;\">\n");
      out.write("                            <li class=\"active\"><a href=\"#new\" data-toggle=\"tab\">Nuevo</a></li>\n");
      out.write("                            <li><a href=\"#list\" data-toggle=\"tab\">List</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane fade active in\" id=\"new\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-12 col-md-10 col-md-offset-1\">\n");
      out.write("                                            <form action=\"SvEmpleado\" method=\"POST\">\n");
      out.write("                                                <p>Nombre</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">                                                  \n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"nombre\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Apellido</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"apellido\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Dni</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"dni\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Direccion</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"direccion\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Nacionalidad</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"nacionalidad\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Fecha de Nacimiento</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"date\" name=\"fechaNacimiento\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Celular</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"celular\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Email</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"email\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Cargo</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"cargo\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Sueldo</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"sueldo\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Usuario</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"usuario\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <p>Contrase??a</p>    \n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"pass\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <p class=\"text-center\">\n");
      out.write("                                                    <button href=\"#!\" class=\"btn btn-info btn-raised btn-sm\">Guardar</button>\n");
      out.write("                                                </p>\n");
      out.write("                                                <p class=\"text-center\">\n");
      out.write("                                                    <button href=\"home.jsp\" class=\"btn btn-info btn-raised btn-sm\">Regresar</button>\n");
      out.write("                                                </p>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"list\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-hover text-center\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"text-center\">Id</th>\n");
      out.write("                                                <th class=\"text-center\">Nombre</th>\n");
      out.write("                                                <th class=\"text-center\">Apellido</th>\n");
      out.write("                                                <th class=\"text-center\">Dni</th>\n");
      out.write("                                                <th class=\"text-center\">Direccion</th>\n");
      out.write("                                                <th class=\"text-center\">Nacionalidad</th>\n");
      out.write("                                                <th class=\"text-center\">Fecha de Nacimiento</th>\n");
      out.write("                                                <th class=\"text-center\">Celular</th>\n");
      out.write("                                                <th class=\"text-center\">Email</th>\n");
      out.write("                                                <th class=\"text-center\">Cargo</th>\n");
      out.write("                                                <th class=\"text-center\">Sueldo</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>1</td>\n");
      out.write("                                                <td>$70</td>\n");
      out.write("                                                <td>$40</td>\n");
      out.write("                                                <td>$30</td>\n");
      out.write("                                                <td>Carlos Alfaro</td>\n");
      out.write("                                                <td>Section</td>\n");
      out.write("                                                <td>2017</td>\n");
      out.write("                                                <td><a href=\"#!\" class=\"btn btn-success btn-raised btn-xs\"><i class=\"zmdi zmdi-refresh\"></i></a></td>\n");
      out.write("                                                <td><a href=\"#!\" class=\"btn btn-danger btn-raised btn-xs\"><i class=\"zmdi zmdi-delete\"></i></a></td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    \n");
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
