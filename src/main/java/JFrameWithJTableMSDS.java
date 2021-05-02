
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor./
 */

/**
 * <h1>Final Project - JFrameWithJTableMSDS Class</h1>
 *
 * <b>Note: This class provides the ability to interact with
 * a table containing data on MSDS as well as buttons
 * to create new entry, remove, load and save.
 *
 *</b>
 * @author Team 2
 * @version 1.0
 * @since 2021-5-2
 */
public class JFrameWithJTableMSDS extends javax.swing.JFrame {

    /**
     * Creates new form JFrameWithJTableMSDS
     */
    private List<MSDSObject> msds;
    private DefaultTableModel tblModel;
    private Object tData[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
    private File file;
    private String userRole;

    /**
     * This method is used to initialize components also requests the type of
     * user logging in displaying the result and making different options available.
     * This method sets the width of columns aswell
     * @return none
     */

    public JFrameWithJTableMSDS(HazMatInventory subj) {
        initComponents();
        tblModel = (DefaultTableModel)jTable1.getModel();
         file = new File("MSDS_Data_CSV_File.csv");      
        String[] choices = { "Employee", "Issuer", "Cleaner", "Manager"};
        userRole = (String) JOptionPane.showInputDialog(null, "Enter Role",
                "User Credentials", JOptionPane.QUESTION_MESSAGE, null, // Use
                choices, "none");

        LabelCurrentLogIn.setText("Current Log In As [" + userRole + "]");

        if(userRole == "Employee" || userRole == "Cleaner" || userRole == null)
        {
            buttonWriteToFile.setVisible(false);
            ButtonRemoveSelected.setVisible(false);
            ButtonCreateNewEntry.setVisible(false);
        }

        for(int i = 0; i < 16; i++)
        {
         jTable1.getColumnModel().getColumn(i).setPreferredWidth(300);   
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

        LabelTitle = new javax.swing.JLabel();
        ButtonCreateNewEntry = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable1 = new JTable();
        ButtonRemoveSelected = new javax.swing.JButton();
        LabelCurrentLogIn = new javax.swing.JLabel();
        buttonSetTable = new javax.swing.JButton();
        buttonWriteToFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitle.setText("MSDS Table");

        ButtonCreateNewEntry.setText("Create New Entry");
        ButtonCreateNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateNewEntryActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S1 Identification", "S2 Hazards Identification", "S3 Composition Information Ingredients", "S4 First Aid Measures", "S5 Fire Fighting Measures", "S6 Accidental Release Measures", "S7 Handling and Storage", "S8 Exposure Controls Personal Protection", "S9 Physical and Chemical Properties", "S10 Stability and Reactivity", "S11 Toxicological Information", "S12 Ecological Information", "S13 Disposal Considerations", "S14 Transport Information", "S15 Regulatory Information", "S16 Other Information"
            }
        ));
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(50);
        jScrollPane.setViewportView(jTable1);

        ButtonRemoveSelected.setText("Remove Selected Entry");
        ButtonRemoveSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRemoveSelectedActionPerformed(evt);
            }
        });

        LabelCurrentLogIn.setText("Current Log In As [          ]");

        buttonSetTable.setText("Load Entries From File");
        buttonSetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetTableActionPerformed(evt);
            }
        });

        buttonWriteToFile.setText("Save Changes To File");
        buttonWriteToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWriteToFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTitle)
                        .addGap(493, 493, 493)
                        .addComponent(LabelCurrentLogIn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonCreateNewEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonRemoveSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonSetTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonWriteToFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCurrentLogIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCreateNewEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonRemoveSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSetTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonWriteToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is when Remove Button is clicked
     * It will remove the selected item from the list
     * as well as the table
     * @return none
     */
    private void ButtonRemoveSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoveSelectedActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1) {
               // remove selected row from the model
               int markedForRemoval = jTable1.getSelectedRow();
               tblModel.removeRow(markedForRemoval);
               msds.remove(markedForRemoval);
               
            }
    }//GEN-LAST:event_ButtonRemoveSelectedActionPerformed
    /**
     * This method is when Load Table is clicked
     * Loading the table from the CSV File
     * @return none
     */
    private void buttonSetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetTableActionPerformed
        // TODO add your handling code here:
        msds = FileOperations.readINTOListMSDSFromCSV(file.getAbsolutePath()); 

        
        
            // Remove Current Rows
            int rowCount = tblModel.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
        
        for(int i = 0; i < msds.size(); i++)
        {
            tData[0] = msds.get(i).getS1_Identification();
            tData[1] = msds.get(i).getS2_Hazards_Identification();
            tData[2] = msds.get(i).getS3_Composition_Information_Ingredients();
            tData[3] = msds.get(i).getS4_First_Aid_Measures();
            tData[4] = msds.get(i).getS5_Fire_Fighting_Measures();
            tData[5] = msds.get(i).getS6_Accidental_Release_Measures();
            tData[6] = msds.get(i).getS7_Handling_and_Storage();
            tData[7] = msds.get(i).getS8_Exposure_Controls_Personal_Protection();
            tData[8] = msds.get(i).getS9_Physical_and_Chemical_Properties();
            tData[9] = msds.get(i).getS10_Stability_and_Reactivity();
            tData[10] = msds.get(i).getS11_Toxicological_Information();
            tData[11] = msds.get(i).getS12_Ecological_Information();
            tData[12] = msds.get(i).getS13_Disposal_Considerations();
            tData[13] = msds.get(i).getS14_Transport_Information();
            tData[14] = msds.get(i).getS15_Regulatory_Information();
            tData[15] = msds.get(i).getS16_Other_Information();
            
            tblModel.addRow(tData);
        }
      
    }//GEN-LAST:event_buttonSetTableActionPerformed
    /**
     * This method is when Save Table is clicked
     * So that any changes will be written to the
     * CSV file
     * @return none
     */
    private void buttonWriteToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWriteToFileActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Svae Changes? Changes will overwrite previous data.");
        if(input >0){return;}
        file = new File("MSDS_Data_CSV_File.csv");
        try {
            FileOperations.writeFileToCSVMSDS(file.getAbsolutePath(), msds);
        } catch (IOException ex) {
            Logger.getLogger(JFrameWithJTableMSDS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonWriteToFileActionPerformed
    /**
     * This method is when Create new Entry is
     * clicked and adds to the list as well
     * as the table
     * @return none
     */
    private void ButtonCreateNewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateNewEntryActionPerformed
        // TODO add your handling code here:
        MSDSObject addObjMSDS = new MSDSObject();
        addObjMSDS.Ask_and_Set_All_Input();
        msds.add(addObjMSDS);
        
            tData[0] = addObjMSDS.getS1_Identification();
            tData[1] = addObjMSDS.getS2_Hazards_Identification();
            tData[2] = addObjMSDS.getS3_Composition_Information_Ingredients();
            tData[3] = addObjMSDS.getS4_First_Aid_Measures();
            tData[4] = addObjMSDS.getS5_Fire_Fighting_Measures();
            tData[5] = addObjMSDS.getS6_Accidental_Release_Measures();
            tData[6] = addObjMSDS.getS7_Handling_and_Storage();
            tData[7] = addObjMSDS.getS8_Exposure_Controls_Personal_Protection();
            tData[8] = addObjMSDS.getS9_Physical_and_Chemical_Properties();
            tData[9] = addObjMSDS.getS10_Stability_and_Reactivity();
            tData[10] = addObjMSDS.getS11_Toxicological_Information();
            tData[11] = addObjMSDS.getS12_Ecological_Information();
            tData[12] = addObjMSDS.getS13_Disposal_Considerations();
            tData[13] = addObjMSDS.getS14_Transport_Information();
            tData[14] = addObjMSDS.getS15_Regulatory_Information();
            tData[15] = addObjMSDS.getS16_Other_Information();
            
            tblModel.addRow(tData);
    }//GEN-LAST:event_ButtonCreateNewEntryActionPerformed

    /**
     * @param args the command line arguments
     * @param inventory
     */
    public static void main(String[] args, HazMatInventory inventory) {
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
            Logger.getLogger(JFrameWithJTableMSDS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JFrameWithJTableMSDS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JFrameWithJTableMSDS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFrameWithJTableMSDS.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameWithJTableMSDS(inventory).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCreateNewEntry;
    private javax.swing.JButton ButtonRemoveSelected;
    private javax.swing.JLabel LabelCurrentLogIn;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton buttonSetTable;
    private javax.swing.JButton buttonWriteToFile;
    private javax.swing.JScrollPane jScrollPane;
    private JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
