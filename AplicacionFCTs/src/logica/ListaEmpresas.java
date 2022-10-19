/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PabloTejedorRivadull
 */
public class ListaEmpresas {
    
    public List<Empresa> listaEmpresa = new ArrayList<>();
    
    public ListaEmpresas(){
        listaEmpresa = new ArrayList<>();
        listaEmpresa.add(new Empresa("Iberia","Alfredo", 912256458));
        listaEmpresa.add(new Empresa("Amazon","Alfonso", 912256743));
        listaEmpresa.add(new Empresa("Indra","Daniel", 912256741));
        listaEmpresa.add(new Empresa("Mercadona","Manolo", 912259658));
    }
    
    public List<Empresa> getListaEmpresas(){
        return listaEmpresa;
    }
}
