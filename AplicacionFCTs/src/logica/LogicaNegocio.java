package logica;

import java.util.List;
import java.util.ArrayList;
import dto.Usuario;

/**
 *
 * @author PabloTejedorRivadull
 */
public class LogicaNegocio {
    
    public List<Usuario> listaUsuarios = new ArrayList<>();
    
    public LogicaNegocio(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Pablo","Alumno"));
        listaUsuarios.add(new Usuario("David","Alumno"));
        listaUsuarios.add(new Usuario("Alfonso","Profesor"));
        listaUsuarios.add(new Usuario("Rocio","Profesor"));
    }
    
    public List<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }
}
