import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import static java.lang.System.exit;

public class FrontGUI extends javax.swing.JFrame {

    private HazMatInventory inventory;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton hazMatButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton msdsButton;
    private javax.swing.JButton managerButton;
    private javax.swing.JLabel menuPicture;
    private javax.swing.JLabel menuTitle;

    public FrontGUI(HazMatInventory subj) {
        inventory = subj;
        initComponents(subj);
    }

    public static void callmyGui(HazMatInventory inventory) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontGUI(inventory).setVisible(true);
            }
        });
    }

    private void initComponents(HazMatInventory subj) {

        menuTitle = new javax.swing.JLabel();
        msdsButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();
        hazMatButton = new javax.swing.JButton();
        menuPicture = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);

        menuTitle.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        menuTitle.setText("MSDS Management System");

        msdsButton.setBackground(new java.awt.Color(153, 255, 102));
        msdsButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        msdsButton.setText("MSDS");
        msdsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msdsActionPerformed(evt);
            }
        });

        managerButton.setBackground(new java.awt.Color(204, 255, 204));
        managerButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        managerButton.setText("Manager");
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerActionPerformed(evt);
            }
        });

        employeeButton.setBackground(new java.awt.Color(204, 255, 204));
        employeeButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        employeeButton.setText("Employee");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });

        hazMatButton.setBackground(new java.awt.Color(255, 204, 0));
        hazMatButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        hazMatButton.setText("HazMat");
        hazMatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hazMatActionPerformed(evt, subj);
            }
        });

        File file = new File("msdsimage.jpg");
        menuPicture.setText("jLabel2");
        menuPicture.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
        helpButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
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
                                                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(msdsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(hazMatButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(employeeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(managerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(helpButton)
                                                .addGap(60, 60, 60)
                                                .addComponent(exitButton))
                                        .addComponent(menuPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(msdsButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(managerButton)
                                                .addGap(13, 13, 13)
                                                .addComponent(employeeButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(helpButton)
                                                                .addComponent(exitButton))
                                                        .addComponent(hazMatButton)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(menuPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void msdsActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("testing MSDS button click");
        this.dispose();
        new JFrameWithJTableMSDS(inventory).setVisible(true);
    }

    private void hazMatActionPerformed(ActionEvent evt, HazMatInventory subj) {
        System.out.println("testing HazMat button click");
        new InventoryGUI(subj).setVisible(true);
        dispose();
    }

    private void managerActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("testing Manager button click");
    }

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("testing Employee button click");
    }

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("testing Help button click");
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        exit(0);
    }

//    private void hazMatActionPerformedActionPerformedListener(ActionListener mal) {
//        hazMatButton.addActionListener(mal);
//    }
//
//    private void managerActionPerformedListener(ActionListener mal) {
//        managerButton.addActionListener(mal);
//    }
//
//    private void employeeActionPerformedListener(ActionListener mal) {
//        employeeButton.addActionListener(mal);
//    }
}