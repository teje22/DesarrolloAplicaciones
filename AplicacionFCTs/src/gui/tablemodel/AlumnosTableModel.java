/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodel;

import dto.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PabloTejedorRivadull
 */
public class AlumnosTableModel extends AbstractTableModel {
    
    private List<Alumno> listAlumno;
    private String[] columnas = {"Nombre", "Apellidos", "Fecha"};
    
    public AlumnosTableModel(List<Alumno> listAlumno){
        this.listAlumno = listAlumno;
    }
    
    
    @Override
    public int getRowCount() 
    {
        return listAlumno.size();
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
                return listAlumno.get(rowIndex).getNombre();
            case 1:
                return listAlumno.get(rowIndex).getRol();
            case 2:
                return listAlumno.get(rowIndex).getFecha();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) 
    {
        return columnas[column];
    }
    
    
    
}
