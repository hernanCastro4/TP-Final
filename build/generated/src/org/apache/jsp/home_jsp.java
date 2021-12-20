package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <section class=\"full-box cover dashboard-sideBar\">\n");
      out.write("            <div class=\"full-box dashboard-sideBar-bg btn-menu-dashboard\"></div>\n");
      out.write("            <div class=\"full-box dashboard-sideBar-ct\">\n");
      out.write("                <!--SideBar Title -->\n");
      out.write("                <div class=\"full-box text-uppercase text-center text-titles dashboard-sideBar-title\">\n");
      out.write("                    Empresa de Turismo <i class=\"zmdi zmdi-close btn-menu-dashboard visible-xs\"></i>\n");
      out.write("                </div>\n");
      out.write("                <!-- SideBar User info -->\n");
      out.write("                <div class=\"full-box dashboard-sideBar-UserInfo\">\n");
      out.write("                    <figure class=\"full-box\">\n");
      out.write("                        <img src=\"./assets/img/avatar.jpg\" alt=\"UserIcon\">\n");
      out.write("                        <figcaption class=\"text-center text-titles\">User Name</figcaption>\n");
      out.write("                    </figure>\n");
      out.write("                    <ul class=\"full-box list-unstyled text-center\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#!\">\n");
      out.write("                                <i class=\"zmdi zmdi-settings\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#!\" class=\"btn-exit-system\">\n");
      out.write("                                <i class=\"zmdi zmdi-power\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- SideBar Menu -->\n");
      out.write("                <ul class=\"list-unstyled full-box dashboard-sideBar-Menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"home.html\">\n");
      out.write("                            <i class=\"zmdi zmdi-view-dashboard zmdi-hc-fw\"></i> Dashboard\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                            <i class=\"zmdi zmdi-case zmdi-hc-fw\"></i> Administration <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"period.html\"><i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Period</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"subject.html\"><i class=\"zmdi zmdi-book zmdi-hc-fw\"></i> Subject</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"section.html\"><i class=\"zmdi zmdi-graduation-cap zmdi-hc-fw\"></i> Section</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"salon.html\"><i class=\"zmdi zmdi-font zmdi-hc-fw\"></i> Salon</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                            <i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i> Users <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"admin.html\"><i class=\"zmdi zmdi-account zmdi-hc-fw\"></i> Admin</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"teacher.html\"><i class=\"zmdi zmdi-male-alt zmdi-hc-fw\"></i> Teacher</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"student.html\"><i class=\"zmdi zmdi-face zmdi-hc-fw\"></i> Student</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"representative.html\"><i class=\"zmdi zmdi-male-female zmdi-hc-fw\"></i> Representative</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                            <i class=\"zmdi zmdi-card zmdi-hc-fw\"></i> Payments <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"registration.html\"><i class=\"zmdi zmdi-money-box zmdi-hc-fw\"></i> Registration</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"payments.html\"><i class=\"zmdi zmdi-money zmdi-hc-fw\"></i> Payments</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                             Settings School <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"school.html\"><i class=\"zmdi zmdi-balance zmdi-hc-fw\"></i> School Data</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Content page-->\n");
      out.write("        \n");
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
