import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class InventoryGUI extends javax.swing.JFrame {

    HazMatInventory inventory;
    private javax.swing.JButton addInventory;
    private javax.swing.JButton addItem;
    private javax.swing.JButton back;
    private javax.swing.JButton help;
    private javax.swing.JButton issueInventory;
    private javax.swing.JLabel picture;
    private javax.swing.JButton removeItem;
    private javax.swing.JLabel Title;

    // constructor for inventory GUI with passed inventory object
    public InventoryGUI(HazMatInventory subj) {
        this.inventory = subj;
        initComponents(subj);
    }

    // create inventory GUI page in new runnable
    public static void callmyGui(HazMatInventory subj) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryGUI(subj).setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(HazMatInventory subj) {

        Title = new javax.swing.JLabel();
        addItem = new javax.swing.JButton();
        removeItem = new javax.swing.JButton();
        addInventory = new javax.swing.JButton();
        issueInventory = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        help = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Title.setText("HazMat Inventory Menu");

        addItem.setBackground(new java.awt.Color(153, 255, 102));
        addItem.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt, subj);
            }
        });

        removeItem.setBackground(new java.awt.Color(204, 255, 204));
        removeItem.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        removeItem.setText("Remove Item");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveItemActionPerformed(evt);
            }
        });

        addInventory.setBackground(new java.awt.Color(204, 255, 204));
        addInventory.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        addInventory.setText("Add Inventory");
        addInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInventoryActionPerformed(evt);
            }
        });

        issueInventory.setBackground(new java.awt.Color(255, 204, 0));
        issueInventory.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        issueInventory.setText("Issue Inventory");
        issueInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueInventoryActionPerformed(evt);
            }
        });

        File file = new File("msdsimage.jpg");
        picture.setText("jLabel2");
        picture.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
        help.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(issueInventory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addInventory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(removeItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(help)
                                                .addGap(60, 60, 60)
                                                .addComponent(back))
                                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(addItem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(removeItem)
                                                .addGap(13, 13, 13)
                                                .addComponent(addInventory)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(help)
                                                                .addComponent(back))
                                                        .addComponent(issueInventory)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemActionPerformed(ActionEvent evt, HazMatInventory subj) {
        System.out.println("testing add item button click");
        dispose();
        new HazMatInputGUI(inventory).setVisible(true);

    }

    private void IssueInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueInventoryActionPerformed
        System.out.println("testing remove item button click");
    }

    private void RemoveItemActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("testing add stock button click");

    }

    private void AddInventoryActionPerformed(ActionEvent evt) {
        System.out.println("testing add inventory button click");
        dispose();
        new HazMatItemStockGUI(inventory).setVisible(true);
    }

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        System.out.println("testing Help button click");
    }

    private void BackActionPerformed(ActionEvent evt) {
        System.out.println("testing back button click");

        // call new front GUI instance up, make visable and dispose of inventory GUI
        new FrontGUI(inventory).setVisible(true);
        this.dispose();
    }

//    void addItemActionPerformedListener(ActionListener mal) {
//        addItem.addActionListener(mal);
//    }

//    void addInventoryActionPerformedListener(ActionListener mal) {
//        addInventory.addActionListener(mal);
//    }

//    void BackActionPerformed(ActionListener mal) {
//        back.addActionListener(mal);
//    }

}
