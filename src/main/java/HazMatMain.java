/*
This is a NETBEANS project
Recommend cloning it to desktop then open as new project in NETBEANS

 Some testing code in main is commented out, check

  INCLUDE AT YOUR OWN PERIL
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class HazMatMain extends javax.swing.JFrame {

    public static void main(String[] args) {

        System.out.println("main page is running..");

        // inventory object with inventory arraylist
        HazMatInventory inventory = new HazMatInventory();

        //trial of loading HM sample file into inventory object and saving the same to new file
        System.out.printf("arraylist size before: %d\n",inventory.getHazMatStock().size());
        File file = new File("HazMatInv_Data_CSV_File.csv");
        FileOperations.readINTOListHazMatInvItemsFromCSV(file.getAbsolutePath(),inventory.getHazMatStock());
        System.out.printf("arraylist size after: %d\n",inventory.getHazMatStock().size());
        try {
            FileOperations.writeFileToHazMatInvItemsFromCSV("test.csv",inventory.getHazMatStock());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(inventory);

    //load front GUI
        FrontGUI frontGUI = new FrontGUI(inventory);
        frontGUI.setVisible(true);

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrontGUI(inventory).setVisible(true);
//            }
//        });
//    }

//    private void initComponents() {
//
//        frameTitle = new javax.swing.JLabel();
//        msdsButton = new javax.swing.JButton();
//        managerButton = new javax.swing.JButton();
//        employeeButton = new javax.swing.JButton();
//        hazMatButton = new javax.swing.JButton();
//        picture = new javax.swing.JLabel();
//        helpButton = new javax.swing.JButton();
//        exitButton = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        frameTitle.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        frameTitle.setText("msdsButton Management System");
//
//        msdsButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        msdsButton.setText("msdsButton");
//        /*msdsButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                msdsButtonActionPerformed(evt);
//            }
//        }); */
//
//        managerButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        managerButton.setText("Manager");
//
//        employeeButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        employeeButton.setText("Employee");
//
//        hazMatButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        hazMatButton.setText("HazMat");
//
//        File file = new File("msdsimage.jpg");
//        picture.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath())); // NOI18N
//        picture.setText("picture");
//
//        helpButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        helpButton.setText("Help");
//
//        exitButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
//        exitButton.setText("Exit");
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addComponent(frameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(24, 24, 24)
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                        .addComponent(msdsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                                                                .addComponent(hazMatButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                                .addComponent(employeeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                                .addComponent(managerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(helpButton)
//                                                .addGap(50, 50, 50)
//                                                .addComponent(exitButton))
//                                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(4, 4, 4)
//                                                .addComponent(frameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(msdsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                                .addComponent(managerButton)
//                                                .addGap(13, 13, 13)
//                                                .addComponent(employeeButton))
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addContainerGap()
//                                                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addComponent(hazMatButton)
//                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                                .addComponent(helpButton)
//                                                .addComponent(exitButton)))
//                                .addContainerGap(19, Short.MAX_VALUE))
//        );
//        pack();
//    }
    }
//    class hazMatButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent a) {
//
//            try {
////                InventoryGUI invenGUI = new InventoryGUI();
////                invenGUI.setVisible(true);
////                InventoryController iController = new InventoryController(inventory,invenGUI);
////                dispose();
////                stockGUI.saveItemActionPerformedListener(new saveItemListener());
////                stockGUI.backActionPerformedListener(new backListener());
//            } catch (Exception e) {
//                System.out.println("something wrong in addItemActionListener");
//            }
//        }
//    }
}
