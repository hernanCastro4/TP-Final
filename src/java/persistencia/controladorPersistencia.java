package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Empleado;
import logica.Paquete;
import logica.Servicio;
import logica.Usuario;
import logica.Ventas;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Hernan
 */
public class controladorPersistencia {

    ClienteJpaController clienteJPA = new ClienteJpaController();
    EmpleadoJpaController empleadoJPA=new EmpleadoJpaController();
    UsuarioJpaController usuarioJPA=new UsuarioJpaController();
    ServicioJpaController servicioJPA=new ServicioJpaController();
    VentasJpaController ventaJPA=new VentasJpaController();
    PaqueteJpaController paqueteJPA=new PaqueteJpaController();
    public void crearCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }  
    
     public void crearEmpleado(Empleado empleado,Usuario usuario) throws Exception {
        
            Usuario u=usuarioJPA.create(usuario);
            empleado.setUsuario(u);
            
            empleadoJPA.create(empleado);
            
            
        

    }

    public void crearServicio(Servicio serv) throws Exception {
        servicioJPA.create(serv);
        
    }

    public List<Empleado> traerEmpleado() {
        return empleadoJPA.findEmpleadoEntities();
    }

    public List<Cliente> traerCliente() {
        return clienteJPA.findClienteEntities();
    }

    public List<Servicio> traerServicios() {
        return servicioJPA.findServicioEntities();
    }

    public void borrarServicio(int id) {
        try {
            servicioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Servicio buscarServicio(int id) {
        return servicioJPA.findServicio(id);
    }

    public void modificarServicio(Servicio serv) {
        try {
            servicioJPA.edit(serv);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarCliente(int id) {
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(int id) {
        return clienteJPA.findCliente(id);
    }

    public void modificarCliente(Cliente cli) {
        try {
            clienteJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarEmpleado(int id) {
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado buscarEmpleado(int id) {
        return empleadoJPA.findEmpleado(id);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuarioJPA.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(int idUsu) {
        return usuarioJPA.findUsuario(idUsu);
    }

    public void modificarUsuario(Usuario user) {
        try {
            usuarioJPA.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarEmpleado(Empleado emp) {
        try {
            empleadoJPA.edit(emp);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int crearVenta(Ventas venta) {
       Ventas vent=new Ventas();
       int aux=0;
        try {
            return  aux=ventaJPA.create(venta);
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
      return aux;  
    }

    public List<Ventas> traerVentas() {
        return ventaJPA.findVentasEntities();
    }

    public Ventas buscarVenta(int id) {
        return ventaJPA.findVentas(id);
    }

    public void crearPaqueteNuevo(Paquete paquete) {
        
        try {
            paqueteJPA.create(paquete);
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Paquete crearPaquete(Paquete paquete) {
        
        try {
            Paquete pa=paqueteJPA.create(paquete);
            return pa;
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void modificarPaquete(Paquete pa) {
        try {
            paqueteJPA.edit(pa);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Paquete> traerPaquetes() {
       return paqueteJPA.findPaqueteEntities();
    }

    public void borrarPaquete(int id) {
        try {
            paqueteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paquete buscarPaquete(int id) {
       return paqueteJPA.findPaquete(id);
    }

    public void borrarVenta(int id) {
        try {
            ventaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }
     
         
}
