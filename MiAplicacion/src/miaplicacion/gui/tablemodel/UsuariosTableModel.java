/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaplicacion.gui.tablemodel;

import miaplicacion.dto.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PabloTejedorRivadull
 */
public class UsuariosTableModel extends AbstractTableModel {
    
    private List<Usuario> listUsuario;
    private String[] columnas = {"Nombre", "Rol"};
    
    public UsuariosTableModel(List<Usuario> listUsuario){
        this.listUsuario = listUsuario;
    }
    
    
    @Override
    public int getRowCount() 
    {
        return listUsuario.size();
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
                return listUsuario.get(rowIndex).getNombre();
            case 1:
                return listUsuario.get(rowIndex).getRol();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) 
    {
        return columnas[column];
    }
    
    
    
}
