
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Hernan
 */
@Entity
public class Paquete implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_paquete;
    @Basic
    private double costo;
    @ManyToMany
    private List<Servicio> servicios;
    @OneToMany
    private List<Ventas> ventas;

    public Paquete() {
    }

    public Paquete(int codigo_paquete, double costo, List<Servicio> servicios, List<Ventas> ventas) {
        this.codigo_paquete = codigo_paquete;
        this.costo = costo;
        this.servicios = servicios;
        this.ventas = ventas;
    }

    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    
    
}
