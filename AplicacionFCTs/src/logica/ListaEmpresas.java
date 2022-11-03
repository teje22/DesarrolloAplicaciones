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
    
    public static List<Empresa> listaEmpresa = new ArrayList<>();
    
    public ListaEmpresas(){
        listaEmpresa = new ArrayList<>();
        cargaEmpresas();
        
    }
    
    public void cargaEmpresas(){
        listaEmpresa.add(new Empresa("Iberia","Alfredo", "CIF1" , "912256458", ""));
        listaEmpresa.add(new Empresa("Amazon","Alfonso", "CIF2" ,"912256743", ""));
        listaEmpresa.add(new Empresa("Indra","Daniel", "CIF3" , "912256741", ""));
        listaEmpresa.add(new Empresa("Mercadona","Manolo", "CIF4" , "912259658", ""));
    }
    
    public List<Empresa> getListaEmpresas(){
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }
    
    public static void aniadirEmpresa(Empresa empresa) {
        listaEmpresa.add(empresa);
    }

}
