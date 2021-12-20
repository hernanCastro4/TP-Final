/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Hernan
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Cliente extends Persona implements Serializable{
    
    @OneToMany
    private List<Ventas> ventas;

    public Cliente() {
    }

    public Cliente(int id_persona, String nombre, String apellido, String dni, String direccion, String nacionalidad, Date fecha, String celular, String email) {
        super(id_persona, nombre, apellido, dni, direccion, nacionalidad, fecha, celular, email);
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

   
    
}
