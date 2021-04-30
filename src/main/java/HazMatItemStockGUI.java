import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HazMatItemStockGUI extends javax.swing.JFrame {

    public HazMatItemStockGUI() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        StockNum = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18)); // NOI18N
        Title.setText("Add stock to inventory");

        itemName.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        itemName.setText("name");
        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jButton7.setText("Save");

        jButton8.setText("Discard");

        StockNum.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        StockNum.setText("Stock number");

        Quantity.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        Quantity.setText("Quantity in stock");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(itemName)
                            .addComponent(StockNum)
                            .addComponent(Quantity))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(StockNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        itemName.getAccessibleContext().setAccessibleName("name");
        itemName.getAccessibleContext().setAccessibleDescription("name");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("testing back button click");
//        new InventoryGUI().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void callmyGui(HazMatInventory.HazMatItem gain, HazMatInventory subj){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HazMatInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HazMatInputGUI(subj).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField StockNum;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getQuantity() {
        return Quantity;
    }

    public JTextField getStockNum() {
        return StockNum;
    }

}
