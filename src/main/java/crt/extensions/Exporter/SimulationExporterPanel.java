/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crt.extensions.Exporter;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import net.sf.openrocket.simulation.FlightDataType;

/**
 *
 * @author 160047412
 */
public class SimulationExporterPanel extends javax.swing.JPanel {

  private final SimulationExporterExtension simulationExporter;

  /**
   * Creates new form SimulationExporterPanel
   *
   * @param simulationExporter
   */
  public SimulationExporterPanel(SimulationExporterExtension simulationExporter) {
    this.simulationExporter = simulationExporter;
    initComponents();
  }

  private class FieldsListModel extends DefaultListModel<FlightDataType> {

    public FieldsListModel() {
      super();
      for (FlightDataType f : FlightDataType.ALL_TYPES) {
        this.addElement(f);
      }
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    mainPanel = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    fieldsList = new javax.swing.JList<>();
    titleLabel = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    descriptionLabel = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    fieldSeparatorBox = new javax.swing.JComboBox<>();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jCheckBox2 = new javax.swing.JCheckBox();
    jLabel3 = new javax.swing.JLabel();
    commentCharacterBox = new javax.swing.JComboBox<>();
    jCheckBox3 = new javax.swing.JCheckBox();
    jPanel2 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    fileChooserField = new javax.swing.JTextField();
    jButton3 = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    appendBox = new javax.swing.JComboBox<>();
    fileChosenInfo = new javax.swing.JLabel();
    fileChooserPanel = new javax.swing.JPanel();
    jFileChooser1 = new javax.swing.JFileChooser();

    setLayout(new java.awt.CardLayout());

    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

    fieldsList.setModel(new FieldsListModel());
    fieldsList.setSelectedIndices(this.simulationExporter.fieldSelection);
    fieldsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
      public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
        fieldsListValueChanged(evt);
      }
    });
    jScrollPane1.setViewportView(fieldsList);

    titleLabel.setText("Variables to export");

    jButton1.setText("Select all");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("Select none");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane1)
          .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(titleLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(descriptionLabel)
        .addGap(0, 0, 0))
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

    jLabel1.setText("Field separator string:");

    jLabel4.setText("Field Separator");

    fieldSeparatorBox.setEditable(true);
    fieldSeparatorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ",", ";", "SPACE", "TAB" }));
    fieldSeparatorBox.setSelectedItem(this.simulationExporter.fieldSeparator);
    fieldSeparatorBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fieldSeparatorBoxActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(fieldSeparatorBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(fieldSeparatorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

    jLabel2.setText("Comments");

    jCheckBox1.setSelected(this.simulationExporter.includeSimulationDescription);
    jCheckBox1.setText("Include simulation description");
    jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox1ActionPerformed(evt);
      }
    });

    jCheckBox2.setSelected(this.simulationExporter.includeFieldsDescription);
    jCheckBox2.setText("Include field descriptions");
    jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox2ActionPerformed(evt);
      }
    });

    jLabel3.setText("Comment character:");

    commentCharacterBox.setEditable(true);
    commentCharacterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "#", "%", ";" }));
    commentCharacterBox.setSelectedItem(this.simulationExporter.commentCharacter
    );
    commentCharacterBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        commentCharacterBoxActionPerformed(evt);
      }
    });

    jCheckBox3.setSelected(this.simulationExporter.includeFlightEvents);
    jCheckBox3.setText("Include flight events");
    jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jCheckBox3))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(commentCharacterBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(commentCharacterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

    jLabel5.setText("Exit file");

    fileChooserField.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        fileChooserFieldKeyReleased(evt);
      }
    });

    jButton3.setText("Search");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jLabel6.setText("Option:");

    appendBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Append", "Overwrite" }));
    appendBox.setSelectedIndex(this.simulationExporter.appendSelection
    );
    appendBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        appendBoxActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(fileChooserField)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(appendBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jButton3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(fileChosenInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(fileChooserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(appendBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(fileChosenInfo)
          .addComponent(jButton3))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    if(this.simulationExporter.outputFile!= null){
      fileChooserField.setText(this.simulationExporter.outputFile.getPath());
    }

    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    mainPanelLayout.setVerticalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(mainPanelLayout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    add(mainPanel, "mainPanelCard");

    jFileChooser1.setFileHidingEnabled(true);
    jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFileChooser1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout fileChooserPanelLayout = new javax.swing.GroupLayout(fileChooserPanel);
    fileChooserPanel.setLayout(fileChooserPanelLayout);
    fileChooserPanelLayout.setHorizontalGroup(
      fileChooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fileChooserPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        .addContainerGap())
    );
    fileChooserPanelLayout.setVerticalGroup(
      fileChooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fileChooserPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, Short.MAX_VALUE)
        .addContainerGap())
    );

    add(fileChooserPanel, "card4");
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      fieldsList.setSelectionInterval(0, fieldsList.getModel().getSize() - 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      fieldsList.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //CardLayout lo = (CardLayout) this.getLayout();
      //lo.next(this);
      int returnedValue = jFileChooser1.showOpenDialog(fileChooserPanel);
      if(returnedValue == JFileChooser.APPROVE_OPTION){
        File selectedFile = jFileChooser1.getSelectedFile();
        this.simulationExporter.setOutputFile(selectedFile);
        this.fileChooserField.setText(selectedFile.getPath());
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fieldsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fieldsListValueChanged
      this.simulationExporter.fieldSelection = fieldsList.getSelectedIndices();
    }//GEN-LAST:event_fieldsListValueChanged

    private void fieldSeparatorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSeparatorBoxActionPerformed
      this.simulationExporter.fieldSeparator = fieldSeparatorBox.getSelectedItem().toString();
    }//GEN-LAST:event_fieldSeparatorBoxActionPerformed

    private void appendBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appendBoxActionPerformed
      this.simulationExporter.appendSelection = appendBox.getSelectedIndex();
    }//GEN-LAST:event_appendBoxActionPerformed

  private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
    //CardLayout lo = (CardLayout) this.getLayout();
    //lo.show(this, "mainPanelCard");
  }//GEN-LAST:event_jFileChooser1ActionPerformed

  private void commentCharacterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentCharacterBoxActionPerformed
    this.simulationExporter.commentCharacter = commentCharacterBox.getSelectedItem().toString();
  }//GEN-LAST:event_commentCharacterBoxActionPerformed

  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    this.simulationExporter.includeFieldsDescription = jCheckBox2.isSelected();
  }//GEN-LAST:event_jCheckBox2ActionPerformed

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    this.simulationExporter.includeSimulationDescription = jCheckBox1.isSelected();
  }//GEN-LAST:event_jCheckBox1ActionPerformed

  private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
    this.simulationExporter.includeFlightEvents = jCheckBox3.isSelected();
  }//GEN-LAST:event_jCheckBox3ActionPerformed

  private void fileChooserFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fileChooserFieldKeyReleased
    File selectedFile = new File(fileChooserField.getText());
    this.simulationExporter.setOutputFile(selectedFile);
  }//GEN-LAST:event_fileChooserFieldKeyReleased


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> appendBox;
  private javax.swing.JComboBox<String> commentCharacterBox;
  private javax.swing.JLabel descriptionLabel;
  private javax.swing.JComboBox<String> fieldSeparatorBox;
  private javax.swing.JList<FlightDataType> fieldsList;
  private javax.swing.JTextField fileChooserField;
  private javax.swing.JPanel fileChooserPanel;
  private javax.swing.JLabel fileChosenInfo;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JFileChooser jFileChooser1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel mainPanel;
  private javax.swing.JLabel titleLabel;
  // End of variables declaration//GEN-END:variables
}
