
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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Hernan
 */
@Entity
public class Servicio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_servicio;
    
    @Basic
    private String nombre;
    private String descripcion_breve;
    private String destino_servicio;
    private double costo_servicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_servicio;
    
    @ManyToMany
    private List<Paquete> paquetes;
    @OneToMany
    private List<Ventas> ventas;

    public Servicio() {
    }

    public Servicio(int codigo_servicio, String nombre, String descripcion_breve, String destino_servicio, double costo_servicio, Date fecha_servicio, List<Paquete> paquetes, List<Ventas> ventas) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.fecha_servicio = fecha_servicio;
        this.paquetes = paquetes;
        this.ventas = ventas;
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion_breve() {
        return descripcion_breve;
    }

    public void setDescripcion_breve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

   
    
    
}
