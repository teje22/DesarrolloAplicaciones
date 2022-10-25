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
    
    public static List<Alumno> listaAlumnos = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date ini = new Date("22/10/2022");
    Date fin = new Date("25/10/2022");
    
    
    public ListaAlumnos(){
        listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pablo","Tejedor", "123456789M" ,ini,fin, "2ºDAM-B"  ));
        listaAlumnos.add(new Alumno("David","Campos", "987456321J" ,ini, fin, "2ºDAM-B"));
        listaAlumnos.add(new Alumno("Alfonso","Diaz", "564789321P", ini, fin, "2ºDAM-A"));
        listaAlumnos.add(new Alumno("Rocio","Ramos", "123658974R", ini, fin, "2ºDAW-A"));
    }
    
    public List<Alumno> getListaAlumnos(){
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaUsuarios) {
        this.listaAlumnos = listaUsuarios;
    }
    
    public static void aniadirAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }
}
