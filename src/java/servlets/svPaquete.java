package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controlador;
import logica.Servicio;
import logica.Ventas;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svPaquete", urlPatterns = {"/svPaquete"})
public class svPaquete extends HttpServlet {

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
        //traigo los servicios elegidos
        String serviciosElegidos[] = request.getParameterValues("servicio");
        double precio = 0;
        List<Servicio> servicios=new ArrayList<>();
        //agrego todos los servicios elegidos a un List de servicios y se lo paso a crear paquete junto con el precio
        if (serviciosElegidos != null) {
            for (int i = 0; i < serviciosElegidos.length; i++) {
                Servicio s = cont.buscarServicio(Integer.parseInt(serviciosElegidos[i]));
                precio = precio + s.getCosto_servicio();
                servicios.add(s);

            }  
            precio=precio-(precio*0.10);
            cont.crearPaqueteDeServicios(precio, servicios);
        }

        response.sendRedirect("paquete.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
