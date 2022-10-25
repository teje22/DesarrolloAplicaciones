/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodel;

import dto.Empresa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PabloTejedorRivadull
 */
public class EmpresaTableModel extends AbstractTableModel {
    private List<Empresa> listEmpresa;
    private String[] columnas = {"Empresa", "Nombre de contacto", "CIF", "Télefono", "Dirección"};

    public EmpresaTableModel(List<Empresa> listEmpresa) {
        this.listEmpresa = listEmpresa;
    }

    @Override
    public int getRowCount() 
    {
        return listEmpresa.size();
    }

    @Override
    public int getColumnCount() 
    {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        switch (columnIndex)
        {
            case 0: 
                return listEmpresa.get(rowIndex).getNombre();
            case 1:
                return listEmpresa.get(rowIndex).getContacto();
            case 2:
                return listEmpresa.get(rowIndex).getCif();
            case 3:
                return listEmpresa.get(rowIndex).getNumero_tlf();
            case 4:
                return listEmpresa.get(rowIndex).getDireccion();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) 
    {
        return columnas[column];
    }
    
    
}
