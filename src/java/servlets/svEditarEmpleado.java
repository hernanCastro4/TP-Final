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
import logica.Empleado;
import logica.Usuario;

/**
 *
 * @author Hernan
 */
@WebServlet(name = "svEditarEmpleado", urlPatterns = {"/svEditarEmpleado"})
public class svEditarEmpleado extends HttpServlet {

    Controlador cont = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //traigo el id de empleado 
        int id = Integer.parseInt(request.getParameter("id"));
        //int idUsu = Integer.parseInt(request.getParameter("idUsu"));

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

        String cargo = request.getParameter("cargo");
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));
        String usua = request.getParameter("user");
        String pass = request.getParameter("pass");

        //traigo mi empleado 
        Empleado emp = cont.buscarEmpleado(id);
        //modifico el usuario del empleado
        Usuario user=new Usuario();
        user.setId_usuario(emp.getUsuario().getId_usuario());
        user.setPass(pass);
        user.setUser(usua);
        
        //asigno los nuevos valores
        emp.setNombre(nom);
        emp.setApellido(apellido);
        emp.setDni(dni);
        emp.setDireccion(dir);
        emp.setNacionalidad(nacio);
        emp.setFecha_nacimiento(fecha);
        emp.setCelular(cel);
        emp.setEmail(email);
        emp.setCargo(cargo);
        emp.setSueldo(sueldo);
        emp.setUsuario(user);
        
        cont.modificarEmpleado(emp);
        cont.modificarUsuario(user);

        //actualiza mi lista de empleados
        request.getSession().setAttribute("listaEmpleados", cont.traerEmpleados());
        response.sendRedirect("empleado.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //traigo el id
        int id = Integer.parseInt(request.getParameter("id"));
        //int idUsu = Integer.parseInt(request.getParameter("idUsu"));
        //busco al empleado
        Empleado emp = cont.buscarEmpleado(id);
        //Usuario usu= cont.buscarUsuario(idUsu);

        HttpSession misession = request.getSession();
        misession.setAttribute("empleado", emp);
        //misession.setAttribute("usuario", usu);
        response.sendRedirect("editEmpleado.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
