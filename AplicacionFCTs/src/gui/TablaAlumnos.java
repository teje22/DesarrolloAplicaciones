/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import dto.Alumno;
import gui.tablemodel.AlumnosTableModel;
import gui.MenuPrincipal;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.ListaAlumnos;

/**
 *
 * @author PabloTejedorRivadull
 */
public class TablaAlumnos extends javax.swing.JDialog {
    
    private PantallaPrincipal pantallaPrincipal;
    
    

    /**
     * Creates new form TablaUsuarios
     */
    public TablaAlumnos(java.awt.Dialog parent, boolean modal) {
        super(parent, true);
        initComponents();
        refrescarTabla();
        
    }
    
    private void refrescarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Apellidos", "DNI", "Fecha Inicio", "Fecha Fin", "Curso"});
        
        List<Alumno> listaAlumnos = ListaAlumnos.getListaAlumnos();
        for (Alumno alumno : listaAlumnos){
            dtm.addRow(alumno.toArrayString());
        }
        
        jTableUsuarios.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTableUsuarios = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jMenuBarInicio = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuEmpresa = new javax.swing.JMenu();
        jMenuItemTablaEmp = new javax.swing.JMenuItem();
        jMenuItemFormEmp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTableUsuarios.setViewportView(jTableUsuarios);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jMenuPrincipal.setText("Menú");

        jMenuInicio.setText("Inicio");

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemInicio);

        jMenuPrincipal.add(jMenuInicio);

        jMenuEmpresa.setText("Empresas");

        jMenuItemTablaEmp.setText("Tabla de Empresas");
        jMenuItemTablaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTablaEmpActionPerformed(evt);
            }
        });
        jMenuEmpresa.add(jMenuItemTablaEmp);

        jMenuItemFormEmp.setText("Formulario Empresas");
        jMenuItemFormEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormEmpActionPerformed(evt);
            }
        });
        jMenuEmpresa.add(jMenuItemFormEmp);

        jMenuPrincipal.add(jMenuEmpresa);

        jMenuBarInicio.add(jMenuPrincipal);

        setJMenuBar(jMenuBarInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(912, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneTableUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPaneTableUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        MenuPrincipal menu = new MenuPrincipal(pantallaPrincipal, false);
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jMenuItemTablaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTablaEmpActionPerformed
        TablaEmpresas tablaEmpresas = new TablaEmpresas(this, false);
        tablaEmpresas.setVisible(true);
    }//GEN-LAST:event_jMenuItemTablaEmpActionPerformed

    private void jMenuItemFormEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormEmpActionPerformed
        FormularioEmpresas formularioEmp = new FormularioEmpresas(pantallaPrincipal, false);
        formularioEmp.setVisible(true);
    }//GEN-LAST:event_jMenuItemFormEmpActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JMenuBar jMenuBarInicio;
    private javax.swing.JMenu jMenuEmpresa;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemFormEmp;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemTablaEmp;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JScrollPane jScrollPaneTableUsuarios;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
