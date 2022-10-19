package logica;

import java.util.List;
import java.util.ArrayList;
import dto.Usuario;
import java.util.Date;

/**
 *
 * @author PabloTejedorRivadull
 */
public class ListaUsuarios {
    
    public List<Usuario> listaUsuarios = new ArrayList<>();
    
    public ListaUsuarios(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Pablo","Alumno", new Date()));
        listaUsuarios.add(new Usuario("David","Alumno",new Date()));
        listaUsuarios.add(new Usuario("Alfonso","Profesor", new Date()));
        listaUsuarios.add(new Usuario("Rocio","Profesor", new Date()));
    }
    
    public List<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }
}
