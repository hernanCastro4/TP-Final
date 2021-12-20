package servlets;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
@WebServlet(name = "svVentaPaquete", urlPatterns = {"/svVentaPaquete"})
public class svVentaPaquete extends HttpServlet {

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
        String medio = request.getParameter("medio");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(request.getParameter("fecha"));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        //creo una venta y obtengo el id
        int aux=0;
        try {
            aux = cont.crearVenta(medio, fecha);

        } catch (Exception e) {
        }
        //a la venta creada la relaciono con el paquete elegido
        Ventas venta=cont.buscarVenta(aux);
        String paquetesElegidos[]= request.getParameterValues("seleccionado");

        if (paquetesElegidos !=null) {
            for (int i = 0; i < paquetesElegidos.length; i++) {
              Paquete p = cont.buscarPaquete(Integer.parseInt(paquetesElegidos[i])); 
              p.getVentas().add(venta);
              cont.modificarPaquete(p);

            }
        }
        
        //a la venta creada la relaciono con el cliente
        int idCli = Integer.parseInt(request.getParameter("idCliente"));
        Cliente cli = cont.buscarCliente(idCli);
        cli.getVentas().add(venta);
        cont.modificarCliente(cli);

        //a la venta creada la relaciono con el empleado
        List<Empleado> empleados=cont.traerEmpleados();
        for (Empleado e : empleados) {
            if(e.isActivo()){
            e.getVentas().add(venta);
            cont.modificarEmpleado(e);
            }
        }
        
        HttpSession misession = request.getSession();
        misession.setAttribute("venta", venta);
        response.sendRedirect("ventaPaquete.jsp");

       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
