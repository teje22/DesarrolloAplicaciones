/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author PabloTejedorRivadull
 */
public class Empresa {
    private String nombre;
    private String contacto;
    private String cif;
    private String numero_tlf;
    private String direccion;

    public Empresa(String nombre, String contacto, String cif, String numero_tlf, String direccion) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.cif = cif;
        this.numero_tlf = numero_tlf;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNumero_tlf() {
        return numero_tlf;
    }

    public void setNumero_tlf(String numero_tlf) {
        this.numero_tlf = numero_tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = contacto;
        s[2] = cif;
        s[3] = numero_tlf;
        s[4] = direccion;
        return s;
    }
    
    
}
