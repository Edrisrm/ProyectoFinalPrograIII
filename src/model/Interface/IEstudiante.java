
package model.Interface;

import java.util.ArrayList;
import model.Estudiante;


public interface IEstudiante {
    public boolean agregar(Estudiante e);
    public boolean eliminar(Estudiante e);
    public Estudiante existe(String id);
    
}
