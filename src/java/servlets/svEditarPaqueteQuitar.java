package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controlador;
import logica.Paquete;
import logica.Servicio;
import logica.Ventas;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEditarPaqueteQuitar", urlPatterns = {"/svEditarPaqueteQuitar"})
public class svEditarPaqueteQuitar extends HttpServlet {

    Controlador cont = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //obtengo el paquete
        int idPaquete = Integer.parseInt(request.getParameter("idPa"));
        Paquete paq = cont.buscarPaquete(idPaquete);

        //obtengo los servicios
        String serviciosElegidos[] = request.getParameterValues("servicio");

        //realizo el mismo procedimiento que para agregar un servicio al paquete pero esta vez quito el servicio elegido
        double precio = paq.getCosto();
        precio = precio + (precio * 0.10);
        if (serviciosElegidos != null) {
            for (int i = 0; i < serviciosElegidos.length; i++) {
                Servicio s = cont.buscarServicio(Integer.parseInt(serviciosElegidos[i]));
                precio = precio - s.getCosto_servicio();
                System.out.println("precio del paquete quitando el servicio :" + precio);

                Iterator<Servicio> recorrerS = paq.getServicios().iterator();

                while (recorrerS.hasNext()) {
                    Servicio ser = recorrerS.next();

                    if (s.getCodigo_servicio() == ser.getCodigo_servicio()) {
                        recorrerS.remove();
                        precio = precio - (precio * 0.10);
                        System.out.println("precio del paquete con el 10% de desc:" + precio);
                        paq.setCosto(precio);
                        cont.modificarPaquete(paq);
                    }

                }

            }

            response.sendRedirect("paquete.jsp");

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idPaquete = Integer.parseInt(request.getParameter("idPaquete"));
        Paquete paq = cont.buscarPaquete(idPaquete);

        HttpSession misession = request.getSession();
        misession.setAttribute("paquete", paq);
        response.sendRedirect("editarPaqueteQuitarServicio.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
