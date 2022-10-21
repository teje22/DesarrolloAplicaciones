package logica;

import java.util.List;
import java.util.ArrayList;
import dto.Alumno;
import java.util.Date;

/**
 *
 * @author PabloTejedorRivadull
 */
public class ListaAlumnos {
    
    public List<Alumno> listaUsuarios = new ArrayList<>();
    
    public ListaAlumnos(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Alumno("Pablo","Tejedor", new Date()));
        listaUsuarios.add(new Alumno("David","Campos",new Date()));
        listaUsuarios.add(new Alumno("Alfonso","Diaz", new Date()));
        listaUsuarios.add(new Alumno("Rocio","Ramos", new Date()));
    }
    
    public List<Alumno> getListaUsuarios(){
        return listaUsuarios;
    }
}
