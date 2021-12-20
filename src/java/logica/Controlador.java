
package logica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import persistencia.controladorPersistencia;

/**
 *
 * @author Hernan
 */
public class Controlador {

    controladorPersistencia contPer =new controladorPersistencia();
    List<Ventas> ventas=new ArrayList<>();
    
    public Controlador() {
        
    }
    
    
    public void crearEmpleado(String nom,String apellido,String dni,String direccion,String nacionalidad,Date fecha,String celular,String email, String cargo,double sueldo, String usuario,String contrasenia,boolean activo) throws Exception{
        
        Empleado emp=new Empleado();
        Usuario usu=new Usuario();
        
        usu.setUser(usuario);
        usu.setPass(contrasenia);
        
        emp.setNombre(nom);
        emp.setApellido(apellido);
        emp.setDni(dni);
        emp.setDireccion(direccion);
        emp.setNacionalidad(nacionalidad);
        emp.setFecha_nacimiento(fecha);
        emp.setCelular(celular);
        emp.setEmail(email);
        emp.setCargo(cargo);
        emp.setSueldo(sueldo);      
        emp.setActivo(activo);
        
        
        contPer.crearEmpleado(emp,usu);
        
    }
    
    public List<Empleado> traerEmpleados(){
        
        return contPer.traerEmpleado();
    }
    
    
    public void crearCliente(String nom,String apellido,String dni,String direccion,String nacionalidad,Date fecha,String celular,String email) {
        List<Ventas> ventas=new ArrayList<>();
        Cliente cliente=new Cliente();
        
        cliente.setNombre(nom);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setDireccion(direccion);
        cliente.setFecha_nacimiento(fecha);
        cliente.setNacionalidad(nacionalidad);
        cliente.setCelular(celular);
        cliente.setEmail(email);
        cliente.setVentas(ventas);
        
        contPer.crearCliente(cliente);
        
    }
    
    public List<Cliente> traerClientes(){
        
        return contPer.traerCliente();
    }
    public void crearServicio(String nombre, String descripcion_breve, String destino_servicio, Date fecha_servicio,double costo) throws Exception{
        Servicio serv=new Servicio();
        
        serv.setNombre(nombre);
        serv.setDescripcion_breve(descripcion_breve);
        serv.setDestino_servicio(destino_servicio);
        serv.setFecha_servicio(fecha_servicio);
        serv.setCosto_servicio(costo);
        
        contPer.crearServicio(serv);
        
        
    }
    
    public List<Servicio> traerServicios(){
        
        return contPer.traerServicios();
    }

    public void borrarServicio(int id) {
        contPer.borrarServicio(id);
    }

    public Servicio buscarServicio(int id) {
        return contPer.buscarServicio(id);
         
    }

    public void modificarServicio(Servicio serv) {
       contPer.modificarServicio(serv);
    }

    public void borrarCliente(int id) {
        contPer.borrarCliente(id);
    }

    public Cliente buscarCliente(int id) {
        return contPer.buscarCliente(id);
    }

    public void modificarCliente(Cliente cli) {
        contPer.modificarCliente(cli);
    }

    public void borrarEmpleado(int id) {
        contPer.borrarEmpleado(id);
    }

    public Empleado buscarEmpleado(int id) {
        return contPer.buscarEmpleado(id);
    }

    public void borrarUsuario(int id_usuario) {
        contPer.borrarUsuario(id_usuario);
    }

    public Usuario buscarUsuario(int idUsu) {
        return contPer.buscarUsuario(idUsu);
    }

    public void modificarUsuario(Usuario user) {
        contPer.modificarUsuario(user);
    }

    public void modificarEmpleado(Empleado emp) {
        contPer.modificarEmpleado(emp);
    }
    
    public List<Ventas> traerVentas(){
        return contPer.traerVentas();
    }
    public int crearVenta(String medio, Date fecha) {
        Ventas venta=new Ventas();
        venta.setFecha_ventas(fecha);
        venta.setMedio_pago(medio);
        return contPer.crearVenta(venta);
        
    }
    
    
    public void asignarVenta(int idCliente,int idServ, Ventas venta){
        Cliente cli=buscarCliente(idCliente);
        
        cli.getVentas().add(venta);
        modificarCliente(cli);
    }

    public Ventas buscarVenta(int id) {
        return contPer.buscarVenta(id);
    }

    public void crearPaquete(double precio, List<Servicio> servicios,Ventas venta) {
        Paquete paquete=new Paquete();
        precio=precio-(precio*0.10);
        paquete.setCosto(precio);
        paquete.setServicios(servicios);
       
        paquete.setVentas(ventas);
            
        Paquete pa=contPer.crearPaquete(paquete);
        pa.getVentas().add(venta);
        contPer.modificarPaquete(pa);
        
    }
    public List<Paquete> traerPaquetes(){
        return contPer.traerPaquetes();
    }

    public void borrarPaquete(int id) {
        contPer.borrarPaquete(id);
    }

    public Paquete buscarPaquete(int id) {
     return contPer.buscarPaquete(id);   
    }

    public void modificarPaquete(Paquete paquete) {
        contPer.modificarPaquete(paquete);
    }

    public void crearPaqueteDeServicios(double precio, List<Servicio> servicios) {
        Paquete p=new Paquete();
        p.setCosto(precio);
        p.setServicios(servicios);
        contPer.crearPaqueteNuevo(p);
    }

    public void borrarVenta(int id) {
       contPer.borrarVenta(id);
    }

    public Boolean iniciarSesion(String user, String pass) {
      /*  List<Usuario> usuarios=traerUsuarios();
        boolean b=false;
        for (Usuario u : usuarios) {
            if (u.getUser().equals(user)) {
                if(u.getPass().equals(pass)){
                   b=true;
                   return b;
                }
                
            }
            
        }*/
        List<Empleado> empleados=traerEmpleados();
        boolean b=false;
        for (Empleado e : empleados) {
            if (e.getUsuario().getUser().equals(user)) {
                if(e.getUsuario().getPass().equals(pass)){
                   b=true;
                   e.setActivo(b);
                   contPer.modificarEmpleado(e);
                   return b;
                }
                
            }
            
        }
        return b;
    }

    private List<Usuario> traerUsuarios() {
        return contPer.traerUsuarios();
    }
}
