
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controlador;
import logica.Empleado;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svBorrarEmpleado", urlPatterns = {"/svBorrarEmpleado"})
public class svBorrarEmpleado extends HttpServlet {
    
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
        //obtengo y borro el empleado y su usuario
        int id=Integer.parseInt(request.getParameter("id"));
        int idUsu=Integer.parseInt(request.getParameter("idUsu"));
           
        cont.borrarEmpleado(id);
        cont.borrarUsuario(idUsu);
        
        request.getSession().setAttribute("listaEmpleados", cont.traerEmpleados());
        response.sendRedirect("empleado.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
