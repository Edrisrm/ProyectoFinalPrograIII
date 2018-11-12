
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="asistencia")
public class Asistencia implements Serializable {

    

    private Date fechaAsistencia;
    private String asignatura;
    private String estado;
    @ManyToOne
    private Estudiante estudiante;
    
    public Asistencia(){
        
    }
    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    
    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    
    public String getAsignatura() {
        return asignatura;
    }

    
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEstado() {
        return estado;
    }

  
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

   
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
