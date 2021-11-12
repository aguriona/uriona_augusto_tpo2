
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
     private Long id;
    
    @Basic
     private String nombrePerro;
     private String raza;
     private String color; 
     private boolean alergico;
     private boolean atencionEspecial;
     private String nombreDuenio;
     private Integer celularDuenio;
     private String observaciones;

    public Cliente(String nombrePerro, String raza, String color, boolean atencionEspecial, boolean alergico, String nombreDuenio, Integer celularDuenio, String observaciones) {
        
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.atencionEspecial = atencionEspecial;
        this.alergico = alergico;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observaciones = observaciones;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAtencionEspecial() {
        return atencionEspecial;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(boolean atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }
    
    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public Integer getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(Integer celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", color=" + color + ", atencionEspecial=" + atencionEspecial + ", nombreDuenio=" + nombreDuenio + ", celularDuenio=" + celularDuenio + ", observaciones=" + observaciones + '}';
    }
    
    
    
}
