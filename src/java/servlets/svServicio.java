package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "svServicio", urlPatterns = {"/svServicio"})
public class svServicio extends HttpServlet {
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
        String nom = request.getParameter("nombre");
        String desc = request.getParameter("descripcion");
        String dest = request.getParameter("destino");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(request.getParameter("fechaServicio"));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        double costo = Double.parseDouble(request.getParameter("costo"));
        //creo el servicio
        try {
            cont.crearServicio(nom, desc, dest, fecha,costo);
        } catch (Exception ex) {
            Logger.getLogger(svServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("home.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
