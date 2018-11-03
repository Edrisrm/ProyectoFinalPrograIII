
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
@Table (name="estudiante")
public class Estudiante implements Serializable {

     private static final long serialVersionID = 1L;
 @Id
 private String cedula;
 private String nombre;
 private String apellidos;

 
 @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="estudiante")
 private List<EstudianteAsignatura> cEstudianteAsignatura;
 
 public Estudiante(){
     this.cEstudianteAsignatura = new ArrayList<EstudianteAsignatura>();
 }
 
    
    public String getCedula() {
        return cedula;
    }

   
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellidos() {
        return apellidos;
    }

   
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

   
    public List<EstudianteAsignatura> getcAsignatura() {
        return cEstudianteAsignatura;
    }

   
    public void setcAsignatura(List<EstudianteAsignatura> cAsignatura) {
        this.cEstudianteAsignatura = cAsignatura;
    }
}
