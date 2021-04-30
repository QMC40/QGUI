import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

import static java.lang.System.exit;


public class frontGUI extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee;
    private javax.swing.JButton Exit;
    private javax.swing.JButton HazMat;
    private javax.swing.JButton Help;
    private javax.swing.JButton MSDS;
    private javax.swing.JButton Manager;
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel Title;

    public frontGUI() {
        initComponents();
    }

    public static void callmyGui() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontGUI().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        MSDS = new javax.swing.JButton();
        Manager = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        HazMat = new javax.swing.JButton();
        Picture = new javax.swing.JLabel();
        Help = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        Title.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Title.setText("MSDS Management System");

        MSDS.setBackground(new java.awt.Color(153, 255, 102));
        MSDS.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        MSDS.setText("MSDS");
        MSDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSDSActionPerformed(evt);
            }
        });

        Manager.setBackground(new java.awt.Color(204, 255, 204));
        Manager.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Manager.setText("Manager");
        Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerActionPerformed(evt);
            }
        });

        Employee.setBackground(new java.awt.Color(204, 255, 204));
        Employee.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Employee.setText("Employee");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });

        HazMat.setBackground(new java.awt.Color(255, 204, 0));
        HazMat.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        HazMat.setText("HazMat");
        HazMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazMatActionPerformed(evt);
            }
        });

        File file = new File("msdsimage.jpg");
        Picture.setText("jLabel2");
        Picture.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
        Help.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(MSDS, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(HazMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Employee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Manager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Help)
                                                .addGap(60, 60, 60)
                                                .addComponent(Exit))
                                        .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MSDS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Manager)
                                                .addGap(13, 13, 13)
                                                .addComponent(Employee)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Help)
                                                                .addComponent(Exit))
                                                        .addComponent(HazMat)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MSDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSDSActionPerformed

        System.out.println("testing MSDS button click");
        File file = new File("MSDS_Data_CSV_File.csv");

        List<MSDSObject> msds = FileOperations.readINTOListMSDSFromCSV(file.getAbsolutePath());
        new DisplayMSDSTable(msds);
    }//GEN-LAST:event_MSDSActionPerformed

    private void HazMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HazMatActionPerformed
        System.out.println("testing HazMat button click");
//            new InventoryGUI().setVisible(true);
//            this.dispose();
    }//GEN-LAST:event_HazMatActionPerformed

    private void ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerActionPerformed

        System.out.println("testing Manager button click");
    }//GEN-LAST:event_ManagerActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        System.out.println("testing Employee button click");
    }//GEN-LAST:event_EmployeeActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        System.out.println("testing Help button click");
    }//GEN-LAST:event_HelpActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    // End of variables declaration//GEN-END:variables
}
