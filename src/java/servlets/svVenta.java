package servlets;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
@WebServlet(name = "svVenta", urlPatterns = {"/svVenta"})
public class svVenta extends HttpServlet {

    Controlador cont = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //obtengo los valores
        String medio = request.getParameter("medioPago");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(request.getParameter("fechaPago"));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        Ventas venta=new Ventas();
        int aux=0;
        try {
            aux = cont.crearVenta(medio, fecha);

        } catch (Exception e) {
        }
       //busco la venta y el cliente 
        venta=cont.buscarVenta(aux);
        int idCli = Integer.parseInt(request.getParameter("idClienteVenta"));
        Cliente cli = cont.buscarCliente(idCli);
        //agrego la venta al cliente
        cli.getVentas().add(venta);
        cont.modificarCliente(cli);
        
        //busco al empleado que esta activo en el sistema y le asigno la venta
        List<Empleado> empleados=cont.traerEmpleados();
        for (Empleado e : empleados) {
            if(e.isActivo()){
            e.getVentas().add(venta);
            cont.modificarEmpleado(e);
            }
        }

        HttpSession misession = request.getSession();
        misession.setAttribute("venta", venta);
        response.sendRedirect("ventaServicio.jsp");

 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
