
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Hernan
 */
@Entity
public class Ventas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_ventas;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_ventas;   
    @Basic
    private String medio_pago;


    public Ventas() {
    }

    public Ventas(int num_ventas, Date fecha_ventas, String medio_pago) {
        this.num_ventas = num_ventas;
        this.fecha_ventas = fecha_ventas;
        this.medio_pago = medio_pago;
    }

    public int getNum_ventas() {
        return num_ventas;
    }

    public void setNum_ventas(int num_ventas) {
        this.num_ventas = num_ventas;
    }

    public Date getFecha_ventas() {
        return fecha_ventas;
    }

    public void setFecha_ventas(Date fecha_ventas) {
        this.fecha_ventas = fecha_ventas;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

   
    
    
}
