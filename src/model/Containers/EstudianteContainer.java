
package model.Containers;

import java.util.ArrayList;
import model.Estudiante;
import model.Interface.IEstudiante;


public class EstudianteContainer implements IEstudiante{
private ArrayList<Estudiante> estudiante;
public EstudianteContainer(){
    
}
    
    @Override
    public boolean agregar(Estudiante e) {
     estudiante.add(e);
    return true;
    }

    @Override
    public boolean eliminar(Estudiante e) {
        estudiante.remove(e);
        return true;
    }

    @Override
    public Estudiante existe(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
