
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="profesor")
public class Profesor implements Serializable {
    
    private static final long serialVersionID = 1L;
    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    
    private String correo;
   @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="profesor")
   private List<Asignatura>cAsignatura; 
    
    
    public Profesor(){
        this.cAsignatura = new ArrayList<Asignatura>();
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellido() {
        return apellido;
    }

   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    public String getCedula() {
        return cedula;
    }

    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
    public String getCorreo() {
        return correo;
    }

   
    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    public List<Asignatura> getcAsignatura() {
        return cAsignatura;
    }

    public void setcAsignatura(List<Asignatura> cAsignatura) {
        this.cAsignatura = cAsignatura;
    }
}
