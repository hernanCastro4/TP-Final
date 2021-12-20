
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "svCerrarSesion", urlPatterns = {"/svCerrarSesion"})
public class svCerrarSesion extends HttpServlet {

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
        //recorro la lista de empleados y cuando encuentra el empleado de la sesion activa, cambia su valor a falso
        List<Empleado> empleados=cont.traerEmpleados();
        for (Empleado e : empleados) {
            if(e.isActivo()){
            e.setActivo(false);
            cont.modificarEmpleado(e);
            }
        }
        response.sendRedirect("index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
