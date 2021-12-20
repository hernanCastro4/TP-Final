
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controlador;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svUsuario", urlPatterns = {"/svUsuario"})
public class svUsuario extends HttpServlet {

    Controlador cont=new Controlador();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //obtengo los valores
        String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        //verifico que el user y pass sean correctos, de ser asi se envia a home, de lo contrario se envia al login nuevamente
        boolean autorizacion=cont.iniciarSesion(user,pass);
        if (autorizacion) {
            response.sendRedirect("home.jsp");
            
            
        }else{
            response.sendRedirect("index.jsp");
        }
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
