package logica;

import java.util.List;
import java.util.ArrayList;
import dto.Alumno;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PabloTejedorRivadull
 */
public class ListaAlumnos {
    
    public List<Alumno> listaUsuarios = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date ini = new Date("22/10/2022");
    Date fin = new Date("25/10/2022");
    
    
    
    
    public ListaAlumnos(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Alumno("Pablo","Tejedor", "123456789M" ,ini,fin, "2ºDAM-B"  ));
        listaUsuarios.add(new Alumno("David","Campos", "987456321J" ,ini, fin, "2ºDAM-B"));
        listaUsuarios.add(new Alumno("Alfonso","Diaz", "564789321P", ini, fin, "2ºDAM-A"));
        listaUsuarios.add(new Alumno("Rocio","Ramos", "123658974R", ini, fin, "2ºDAW-A"));
    }
    
    public List<Alumno> getListaUsuarios(){
        return listaUsuarios;
    }
}
