
package model;

import javax.persistence.ManyToOne;


public class EstudianteAsignatura {

   
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Asignatura asignatura;
    public EstudianteAsignatura(){
        
    }
     
    public Estudiante getEstudiante() {
        return estudiante;
    }

    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    
    public Asignatura getAsignatura() {
        return asignatura;
    }

    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
