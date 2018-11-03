
package model;

import java.util.ArrayList;


public interface IEstudiante {
    public boolean agregar(Estudiante e);
    public boolean modificar(Estudiante e);
    public boolean eliminar(Estudiante e);
    public Estudiante existe(String id);
    
}
