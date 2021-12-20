package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Controlador;
import logica.Empleado;
import logica.Paquete;
import logica.Servicio;
import logica.Ventas;

/**
 *
 * @author Hernan
 */
//borrar venta se encarga de borrar una venta de un servicio o de un paquete
@WebServlet(name = "svBorrarVenta", urlPatterns = {"/svBorrarVenta"})
public class svBorrarVenta extends HttpServlet {

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
        //obtengo el id de la venta a borrar
        int id = Integer.parseInt(request.getParameter("idVenta"));
        //busco la venta
        Ventas venta = cont.buscarVenta(id);

        //creo una lista de todas las clases que se relacionan con la venta
        List<Cliente> listaC = new ArrayList<>();
        List<Servicio> listaS = new ArrayList<>();
        List<Paquete> listaP = new ArrayList<>();
        List<Empleado> listaE = new ArrayList<>();

        listaC = cont.traerClientes();
        listaS = cont.traerServicios();
        listaP = cont.traerPaquetes();
        listaE = cont.traerEmpleados();
        //recorro las listas y quito la venta 

        //recorrer Empleado
        Iterator<Empleado> recorrerE = listaE.iterator();

        while (recorrerE.hasNext()) {
            Empleado em = recorrerE.next();
            Iterator<Ventas> recorrerV = em.getVentas().iterator();
            while (recorrerV.hasNext()) {
                Ventas ven = recorrerV.next();
                if (ven.getNum_ventas() == venta.getNum_ventas()) {
                    recorrerV.remove();
                    cont.modificarEmpleado(em);
                }

            }
        }

        //recorrer cliente
        Iterator<Cliente> recorrerC = listaC.iterator();

        while (recorrerC.hasNext()) {
            Cliente cl = recorrerC.next();
            Iterator<Ventas> recorrerV = cl.getVentas().iterator();
            while (recorrerV.hasNext()) {
                Ventas ven = recorrerV.next();
                if (ven.getNum_ventas() == venta.getNum_ventas()) {
                    recorrerV.remove();
                    cont.modificarCliente(cl);
                }

            }
        }

        //recorrer servicios
        Iterator<Servicio> recorrerS = listaS.iterator();

        while (recorrerS.hasNext()) {
            Servicio ser = recorrerS.next();
            Iterator<Ventas> recorrerV = ser.getVentas().iterator();
            while (recorrerV.hasNext()) {
                Ventas ven = recorrerV.next();
                if (ven.getNum_ventas() == venta.getNum_ventas()) {
                    recorrerV.remove();
                    cont.modificarServicio(ser);
                }

            }
        }

        //reorrer paquete
        Iterator<Paquete> recorrerP = listaP.iterator();

        while (recorrerP.hasNext()) {
            Paquete pa = recorrerP.next();

            Iterator<Ventas> recorrerV = pa.getVentas().iterator();
            while (recorrerV.hasNext()) {
                Ventas ven = recorrerV.next();
                if (ven.getNum_ventas() == venta.getNum_ventas()) {
                    recorrerV.remove();
                    cont.modificarPaquete(pa);
                }

            }

        }
        //borro la venta
        cont.borrarVenta(id);

        request.getSession().setAttribute("listaVentas", cont.traerVentas());
        response.sendRedirect("venta.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
