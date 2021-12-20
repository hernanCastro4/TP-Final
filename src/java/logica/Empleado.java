
package logica;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Hernan
 */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")

public class Empleado extends Persona implements Serializable{
    
    
    @Basic
    private String cargo;
    private double sueldo;
    private boolean activo;
    @OneToOne
    private Usuario usuario;
    @OneToMany
    private List<Ventas> ventas;

    public Empleado(String cargo, double sueldo, boolean activo, Usuario usuario, List<Ventas> ventas) {
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.usuario = usuario;
        this.ventas = ventas;
    }

    public Empleado(String cargo, double sueldo, boolean activo, Usuario usuario, List<Ventas> ventas, int id, String nombre, String apellido, String dni, String direccion, String nacionalidad, Date fecha, String celular, String email) {
        super(id, nombre, apellido, dni, direccion, nacionalidad, fecha, celular, email);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.usuario = usuario;
        this.ventas = ventas;
    }
    

   

    public Empleado() {
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

   
   

    
    
}
