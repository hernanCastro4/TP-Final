
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
@WebServlet(name = "svBorrarCliente", urlPatterns = {"/svBorrarCliente"})
public class svBorrarCliente extends HttpServlet {

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
        //obtengo el cliente con el id y lo borro
        int id=Integer.parseInt(request.getParameter("id"));
        cont.borrarCliente(id);
        
        //envia la lista de clientes actualizada
        request.getSession().setAttribute("listaClientes", cont.traerClientes());
        response.sendRedirect("cliente.jsp");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
