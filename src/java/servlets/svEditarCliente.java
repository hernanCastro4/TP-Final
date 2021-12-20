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
import logica.Servicio;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEditarCliente", urlPatterns = {"/svEditarCliente"})
public class svEditarCliente extends HttpServlet {

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
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String dir = request.getParameter("direccion");
        String nacio = request.getParameter("nacionalidad");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(request.getParameter("fechaNacimiento"));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        String cel = request.getParameter("celular");
        String email = request.getParameter("email");
        
        //traigo mi cliente y sobreescribo sus valores
        Cliente cli = cont.buscarCliente(id);

        cli.setNombre(nom);
        cli.setApellido(apellido);
        cli.setDni(dni);
        cli.setDireccion(dir);
        cli.setNacionalidad(nacio);
        cli.setFecha_nacimiento(fecha);
        cli.setCelular(cel);
        cli.setEmail(email);

        cont.modificarCliente(cli);
        
        //actualiza mi lista de clientes
        request.getSession().setAttribute("listaClientes", cont.traerClientes());
        response.sendRedirect("cliente.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //traigo el id
        int id = Integer.parseInt(request.getParameter("id"));
        //busco al cliente
        Cliente cli = cont.buscarCliente(id);

        HttpSession misession = request.getSession();
        misession.setAttribute("cliente", cli);
        response.sendRedirect("editCliente.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
