package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controlador;
import logica.Paquete;
import logica.Servicio;
import logica.Ventas;
import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEditarPaquete", urlPatterns = {"/svEditarPaquete"})
public class svEditarPaquete extends HttpServlet {

    Controlador cont = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //traigo el paquete
        int idPaquete=Integer.parseInt(request.getParameter("idPa"));
        Paquete paq=cont.buscarPaquete(idPaquete);
        
        //obtengo todos los checbox seleccionados
        String serviciosElegidos[]= request.getParameterValues("servicio");
        
        //sumo el 10% al precio del paquete que fue descontado al crearse para poder modificar de manera correcta el precio
        double precio=paq.getCosto();
        precio=precio+(precio*0.10);
        //verifico que los checkbox se hayan seleccionado
        if (serviciosElegidos !=null) {
            //recorro la lista y agrego los servicio al paquete
            for (int i = 0; i < serviciosElegidos.length; i++) {
               Servicio s = cont.buscarServicio(Integer.parseInt(serviciosElegidos[i])); 
               precio=precio+s.getCosto_servicio();
               paq.getServicios().add(s);

            }
            //vuelvo a realizar el descuento de 10% por paquete
            precio=precio-(precio*0.10);
            paq.setCosto(precio);
            //modifico el pquete
            cont.modificarPaquete(paq);
        }
        
        response.sendRedirect("ventaPaquete.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //obtengo el paquete para luego pasarlo con misession al jsp
        int idPaquete=Integer.parseInt(request.getParameter("idPaquete"));
        Paquete paq=cont.buscarPaquete(idPaquete);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("paquete", paq);
        response.sendRedirect("editPaquete.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
