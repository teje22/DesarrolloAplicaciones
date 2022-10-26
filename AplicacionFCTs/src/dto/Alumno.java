package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PabloTejedorRivadull
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private Date fechaIni;
    private Date fechaFin;
    private String curso;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Alumno(String nombre, String apellidos, String dni, Date fechaIni, Date fechaFin, String curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String[] toArrayString(){
        String[] s = new String[6];
        s[0] = nombre;
        s[1] = apellidos;
        s[2] = dni;
        s[3] = sdf.format(fechaIni);
        s[4] = sdf.format(fechaFin);
        s[5] = curso;
        return s;
    }
}