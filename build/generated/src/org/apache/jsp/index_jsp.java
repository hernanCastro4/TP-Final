package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t<title>LogIn</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/main.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"cover\" style=\"background: #2e2e30;\">\n");
      out.write("\t<form action=\"home.jsp\" method=\"\" autocomplete=\"off\" class=\"full-box logInForm\">\n");
      out.write("\t\t<p class=\"text-center text-muted\"><i class=\"zmdi zmdi-account-circle zmdi-hc-5x\"></i></p>\n");
      out.write("\t\t<p class=\"text-center text-muted text-uppercase\">Iniciar sesión</p>\n");
      out.write("\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t  <label class=\"control-label\" for=\"User\">Usuario</label>\n");
      out.write("                  <input class=\"form-control\" id=\"User\" type=\"text\">\n");
      out.write("\t\t  \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t  <label class=\"control-label\" for=\"Pass\">Contraseña</label>\n");
      out.write("\t\t  <input class=\"form-control\" id=\"Pass\" type=\"text\">\n");
      out.write("\t\t  \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group text-center\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Iniciar sesión\" class=\"btn btn-raised btn-danger\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<!--====== Scripts -->\n");
      out.write("\t<script src=\"./js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"./js/material.min.js\"></script>\n");
      out.write("\t<script src=\"./js/ripples.min.js\"></script>\n");
      out.write("\t<script src=\"./js/sweetalert2.min.js\"></script>\n");
      out.write("\t<script src=\"./js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\t<script src=\"./js/main.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$.material.init();\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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
