package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controlador;
import persistencia.controladorPersistencia;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEmpleado", urlPatterns = {"/svEmpleado"})
public class svEmpleado extends HttpServlet {

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
        //traigo los valores
            String nom = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String dni = request.getParameter("dni");
            String dir = request.getParameter("direccion");
            String nacio = request.getParameter("nacionalidad");
            boolean activo=false;
          
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = null;
            try {
                fecha = formato.parse(request.getParameter("fechaNacimiento"));
            } catch (ParseException ex) {
                System.out.println(ex);
            }

            String cel = request.getParameter("celular");
            String email = request.getParameter("email");
            String cargo = request.getParameter("cargo");
            double sueldo = Double.parseDouble(request.getParameter("sueldo"));
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            //creo el empleado
        try {
            cont.crearEmpleado(nom, apellido, dni, dir, nacio, fecha, cel, email, cargo, sueldo, usuario, pass,activo);
        } catch (Exception ex) {
            Logger.getLogger(svEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            response.sendRedirect("home.jsp");
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
