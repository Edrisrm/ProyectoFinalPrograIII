
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="horario")
public class Horario implements Serializable {
    private static final long serialVersionID = 1L;
    
    
    
    private Date Dia;
    private Date HoraInicio;
    private Date HoraFin;
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="horario")
    private List<Asignatura>cAsignatura;
    
    public Horario(){
        this.cAsignatura = new ArrayList<Asignatura>();
    }

    
    public Date getDia() {
        return Dia;
    }

   
    public void setDia(Date Dia) {
        this.Dia = Dia;
    }

   
    public Date getHoraInicio() {
        return HoraInicio;
    }

    
    public void setHoraInicio(Date HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

  
    public Date getHoraFin() {
        return HoraFin;
    }

    
    public void setHoraFin(Date HoraFin) {
        this.HoraFin = HoraFin;
    }

   
    public List<Asignatura> getcAsignatura() {
        return cAsignatura;
    }

   
    public void setcAsignatura(List<Asignatura> cAsignatura) {
        this.cAsignatura = cAsignatura;
    }
    
}
