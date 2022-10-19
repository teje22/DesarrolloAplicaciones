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
    private long numero_tlf;

    public Empresa(String nombre, String contacto, long numero_tlf) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.numero_tlf = numero_tlf;
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

    public long getNumero_tlf() {
        return numero_tlf;
    }

    public void setNumero_tlf(long numero_tlf) {
        this.numero_tlf = numero_tlf;
    }
    
    
    
}
