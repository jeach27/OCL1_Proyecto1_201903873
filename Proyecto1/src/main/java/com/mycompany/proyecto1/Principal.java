/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jeach
 */
public class Principal extends javax.swing.JFrame {
    
    public List<File> listaA = new ArrayList<>();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pestanias = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelGraficas = new javax.swing.JPanel();
        ButtonAnterior = new javax.swing.JButton();
        ButtonSiguiente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Consola = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ButtonNew = new javax.swing.JMenuItem();
        ButtonAbrir = new javax.swing.JMenuItem();
        ButtonSave = new javax.swing.JMenuItem();
        ButtonPestanias = new javax.swing.JMenu();
        ButtonGuardarP = new javax.swing.JMenuItem();
        ButtonEliminarP = new javax.swing.JMenuItem();
        ButtonEjecutar = new javax.swing.JMenu();
        Reportes = new javax.swing.JMenu();
        ReporteTokens = new javax.swing.JMenuItem();
        ReporteErrores = new javax.swing.JMenuItem();
        ReporteSimbolos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPI1");

        jLabel2.setText("ENTRADA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pestanias, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pestanias))
        );

        jLabel3.setText("GRAFICAS");

        javax.swing.GroupLayout PanelGraficasLayout = new javax.swing.GroupLayout(PanelGraficas);
        PanelGraficas.setLayout(PanelGraficasLayout);
        PanelGraficasLayout.setHorizontalGroup(
            PanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelGraficasLayout.setVerticalGroup(
            PanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        ButtonAnterior.setText("Anterior");
        ButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnteriorActionPerformed(evt);
            }
        });

        ButtonSiguiente.setText("Siguiente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(ButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(PanelGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAnterior)
                    .addComponent(ButtonSiguiente))
                .addContainerGap())
        );

        jLabel1.setText("CONSOLA");

        Consola.setEditable(false);
        Consola.setColumns(20);
        Consola.setRows(5);
        jScrollPane1.setViewportView(Consola);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        ButtonNew.setText("Nuevo Archivo");
        ButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNewActionPerformed(evt);
            }
        });
        jMenu1.add(ButtonNew);

        ButtonAbrir.setText("Abrir Archivo");
        ButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(ButtonAbrir);

        ButtonSave.setText("Guardar ");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });
        jMenu1.add(ButtonSave);

        jMenuBar1.add(jMenu1);

        ButtonPestanias.setText("Pestañas");
        ButtonPestanias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPestaniasActionPerformed(evt);
            }
        });

        ButtonGuardarP.setText("Guardar Como");
        ButtonGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarPActionPerformed(evt);
            }
        });
        ButtonPestanias.add(ButtonGuardarP);

        ButtonEliminarP.setText("Eliminar");
        ButtonPestanias.add(ButtonEliminarP);

        jMenuBar1.add(ButtonPestanias);

        ButtonEjecutar.setText("Ejecutar");
        jMenuBar1.add(ButtonEjecutar);

        Reportes.setText("Reporte");

        ReporteTokens.setText("Tokens");
        Reportes.add(ReporteTokens);

        ReporteErrores.setText("Errores");
        Reportes.add(ReporteErrores);

        ReporteSimbolos.setText("Tabla de Simbolos");
        Reportes.add(ReporteSimbolos);

        jMenuBar1.add(Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Boton para regresar en las graficas
    private void ButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnteriorActionPerformed
    
    }//GEN-LAST:event_ButtonAnteriorActionPerformed
    //Boton para agregar una nueva pestaña en el area de Entrada
    private void ButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewActionPerformed
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify file name and location");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int userSelection = fileChooser.showSaveDialog(this);
        
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToCreate = fileChooser.getSelectedFile();
            String path = fileToCreate.getAbsolutePath();
            if (!path.endsWith(".df")) {
                path += ".df";
            }
            try {
                if (!new File(path).createNewFile()) {
                    JOptionPane.showMessageDialog(this, "File could not be created", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "File created successfully: " + fileToCreate.getAbsolutePath(), "Success", JOptionPane.INFORMATION_MESSAGE);
                    Pestanias.addTab(fileToCreate.getName() , scrollPane);
                    listaA.add(fileToCreate);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonNewActionPerformed
    //Boton para abrir un archivo existente .df
    private void ButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("DF(.df)", "df");
        fileChooser.setFileFilter(filtroImagen);
        fileChooser.setDialogTitle("Specify a file");
        fileChooser.showSaveDialog(null);

        try {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            listaA.add(fileChooser.getSelectedFile());
            File f = fileChooser.getSelectedFile();
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String LineFile = bf.readLine();
            while (LineFile != null) {
                JTextArea textArea = new JTextArea();
                JScrollPane scrollPane = new JScrollPane(textArea);
                String name = f.getName();
                if (name.endsWith(".df")) {
                    name = name.substring(0, name.length()-3);
                }
                Pestanias.addTab(name, scrollPane);
                textArea.append(LineFile + "\n");
                LineFile = bf.readLine();   
            }
        } catch (IOException e) {
        }
        
    }//GEN-LAST:event_ButtonAbrirActionPerformed

    private void ButtonPestaniasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPestaniasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPestaniasActionPerformed
    //Boton para guardar como Pestanias 
    private void ButtonGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarPActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save file");
        fileChooser.setFileFilter(new FileNameExtensionFilter("df", "df"));

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String fileName = fileToSave.getAbsolutePath();

            if (!fileName.endsWith(".df")) {
                fileName += ".df";
            }

            try (FileWriter fileWriter = new FileWriter(fileName)) {
                Component aux = Pestanias.getSelectedComponent();
                if (aux instanceof JScrollPane) {
                    // Get the JTextArea inside the JScrollPane
                    JTextArea selectedTextArea = (JTextArea) ((JScrollPane) aux).getViewport().getView();
                    fileWriter.write(selectedTextArea.getText());
                    Pestanias.remove(aux);
                }
                JOptionPane.showMessageDialog(this, "File saved successfully: " + fileName, "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonGuardarPActionPerformed
    //Boton para guardar archivos ya existentes
    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
       
    }//GEN-LAST:event_ButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ButtonAbrir;
    private javax.swing.JButton ButtonAnterior;
    private javax.swing.JMenu ButtonEjecutar;
    private javax.swing.JMenuItem ButtonEliminarP;
    private javax.swing.JMenuItem ButtonGuardarP;
    private javax.swing.JMenuItem ButtonNew;
    private javax.swing.JMenu ButtonPestanias;
    private javax.swing.JMenuItem ButtonSave;
    private javax.swing.JButton ButtonSiguiente;
    private javax.swing.JTextArea Consola;
    private javax.swing.JPanel PanelGraficas;
    private javax.swing.JTabbedPane Pestanias;
    private javax.swing.JMenuItem ReporteErrores;
    private javax.swing.JMenuItem ReporteSimbolos;
    private javax.swing.JMenuItem ReporteTokens;
    private javax.swing.JMenu Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
