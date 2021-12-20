package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controlador;
import logica.Servicio;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEditarServ", urlPatterns = {"/svEditarServ"})
public class svEditarServ extends HttpServlet {

    Controlador cont = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //traigo el id
        int id = Integer.parseInt(request.getParameter("id"));
        //obtengo los datos
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
        //traigo mi servicio y sobreescribo sus valores
        Servicio serv = cont.buscarServicio(id);

        serv.setNombre(nom);
        serv.setDescripcion_breve(desc);
        serv.setDestino_servicio(dest);
        serv.setFecha_servicio(fecha);
        serv.setCosto_servicio(costo);

        cont.modificarServicio(serv);
        //actualiza mi lista de servicios
        request.getSession().setAttribute("listaServicios", cont.traerServicios());
        response.sendRedirect("servicio.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Servicio serv = cont.buscarServicio(id);

        HttpSession misession = request.getSession();
        misession.setAttribute("servicio", serv);
        response.sendRedirect("editServicio.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
