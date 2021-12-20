package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Controlador;
import logica.Servicio;
import logica.Ventas;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svVentaServicio", urlPatterns = {"/svVentaServicio"})
public class svVentaServicio extends HttpServlet {

    Controlador cont = new Controlador();

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
        
        //obtengo ventas y servicio y los relaciono
        int idServ = Integer.parseInt(request.getParameter("idServ"));
        int idVenta = Integer.parseInt(request.getParameter("idVent"));

        Ventas v = cont.buscarVenta(idVenta);
        Servicio s = cont.buscarServicio(idServ);

        s.getVentas().add(v);

        cont.modificarServicio(s);

        response.sendRedirect("home.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
