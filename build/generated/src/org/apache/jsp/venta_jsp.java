package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logica.Paquete;
import logica.Cliente;
import logica.Ventas;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.Controlador;
import java.util.List;
import logica.Servicio;

public final class venta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>Ventas</title>\n");
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
      out.write("                    <h1 class=\"text-titles\">Ventas</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" style=\"margin-bottom: 15px;\">\n");
      out.write("                            <li class=\"active\"><a href=\"#new\" data-toggle=\"tab\">Venta de servicio</a></li>\n");
      out.write("                         <!--   <li><a href=\"#paquetes\" data-toggle=\"tab\">Venta de Paquetes</a></li> -->\n");
      out.write("                            <li><a href=\"#list\" data-toggle=\"tab\">Mostrar ventas</a></li>       \n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane fade active in\" id=\"new\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-12 col-md-10 col-md-offset-1\">\n");
      out.write("                                            <form  action=\"svVenta\" method=\"POST\">\n");
      out.write("                                                <p>Medio de Pago</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">                                                  \n");
      out.write("                                                    <input class=\"form-control\" type=\"text\" name=\"medioPago\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <p>Fecha Venta</p>\n");
      out.write("                                                <div class=\"form-group label-floating\">\n");
      out.write("                                                    <label>DD/MM/YYYY</label>\n");
      out.write("                                                    <input class=\"form-control\" type=\"datetime\" name=\"fechaPago\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <h2 > Clientes</h2>\n");
      out.write("                                                <br>\n");
      out.write("\n");
      out.write("                                                <hr>\n");
      out.write("                                                <table class=\"table table-hover text-center\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th class=\"text-center\">Id</th>\n");
      out.write("                                                            <th class=\"text-center\">Nombre</th>\n");
      out.write("                                                            <th class=\"text-center\">Apellido</th>\n");
      out.write("                                                            <th class=\"text-center\">Dni</th>\n");
      out.write("                                                            <th class=\"text-center\">Direccion</th>\n");
      out.write("                                                            <th class=\"text-center\">Nacionalidad</th>\n");
      out.write("                                                            <th class=\"text-center\">Fecha de Nacimiento</th>\n");
      out.write("                                                            <th class=\"text-center\">Celular</th>\n");
      out.write("                                                            <th class=\"text-center\">Email</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");
 Controlador control = new Controlador();
                                                            List<Cliente> listaClientes = control.traerClientes();
                                                            for (Cliente clie : listaClientes) {

                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            ");
int idC = clie.getId();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(idC);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String nom = clie.getNombre();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(nom);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String ape = clie.getApellido();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(ape);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String dni = clie.getDni();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(dni);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String dir = clie.getDireccion();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(dir);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String nac = clie.getNacionalidad();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(nac);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
 Date fec = clie.getFecha_nacimiento();
                                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      out.write("\n");
      out.write("                                                            ");
 String fecha = sdf.format(fec);
      out.write("\n");
      out.write("\n");
      out.write("                                                            <td>");
      out.print(fecha);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String cel = clie.getCelular();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(cel);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            ");
String mail = clie.getEmail();
      out.write("\n");
      out.write("                                                            <td>");
      out.print(mail);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                            <td>\n");
      out.write("                                                                    <input type=\"hidden\" name=\"idClienteVenta\" value=\"");
      out.print(idC);
      out.write("\">\n");
      out.write("                                                                    <button type=\"submit\" class=\"btn-primary\" data-title=\"edit\">Seleccionar</button>\n");
      out.write("                                                                \n");
      out.write("                                                            </td>\n");
      out.write("\n");
      out.write("                                                        </tr>\n");
      out.write("<!--falta que elija el servicio-->\n");
      out.write("                                                    </tbody>\n");
      out.write("\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("          \n");
      out.write("                            <!--mostrar ventas-->\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"list\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    \n");
      out.write("                                    <table class=\"table table-hover text-center\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"text-center\">Codigo</th>\n");
      out.write("                                                <th class=\"text-center\">Medio de Pago</th>\n");
      out.write("                                                <th class=\"text-center\">Fecha</th>                                               \n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");

                                                
                                                List<Ventas> listaVent = control.traerVentas();
                                                for (Ventas venta : listaVent) {

                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                ");
int idVent = venta.getNum_ventas();
      out.write("\n");
      out.write("                                                <td>");
      out.print(idVent);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                ");
String nom = venta.getMedio_pago();
      out.write("\n");
      out.write("                                                <td>");
      out.print(nom);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                ");
 Date fech = venta.getFecha_ventas();
                                                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy/MM/dd");
      out.write("\n");
      out.write("                                                ");
 String fechas = sdff.format(fech);
      out.write("\n");
      out.write("                                                <td>");
      out.print(fechas);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                <td>\n");
      out.write("                                                    <form name=\"formBorrarVent\" action=\"svBorrarVent\" method=\"POST\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(idVent);
      out.write("\">\n");
      out.write("                                                        <button type=\"submit\" class=\"btn-danger\" data-title=\"delete\">Borrar</button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </td>\n");
      out.write("\n");
      out.write("                                                <td>\n");
      out.write("                                                    <form name=\"formModifVent\" action=\"svEditarVent\" method=\"post\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(idVent);
      out.write("\">\n");
      out.write("                                                        <button type=\"submit\" class=\"btn-primary\" data-title=\"edit\">Editar</button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </td>\n");
      out.write("\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </table>\n");
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
