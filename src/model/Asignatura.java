
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table (name="asignatura")
public class Asignatura implements Serializable  {

    private static final long serialVersionID = 1L;
    
    @Id
    private String codigoAsignatura;
    private String nombreAsignatura;
    
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="asignatura")
    private List<EstudianteAsignatura> cEstudianteAsignatura;
    
    
    public Asignatura(){
        this.cEstudianteAsignatura = new ArrayList<EstudianteAsignatura>();
    }
   
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public List<EstudianteAsignatura> getcEstudianteAsignatura() {
        return cEstudianteAsignatura;
    }

    
    public void setcEstudianteAsignatura(List<EstudianteAsignatura> cEstudianteAsignatura) {
        this.cEstudianteAsignatura = cEstudianteAsignatura;
    }
    
    
}
