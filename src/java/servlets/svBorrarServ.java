
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


//Borrar servicios se encarga de borrar un servicio
@WebServlet(name = "svBorrarServ", urlPatterns = {"/svBorrarServ"})
public class svBorrarServ extends HttpServlet {
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
        //obtengo el id de servicio y lo borro
        int id=Integer.parseInt(request.getParameter("id"));
        cont.borrarServicio(id);
        
        request.getSession().setAttribute("listaServicios", cont.traerServicios());
        response.sendRedirect("servicio.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
