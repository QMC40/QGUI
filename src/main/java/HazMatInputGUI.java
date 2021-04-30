import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HazMatInputGUI extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemStockNum;
    private javax.swing.JTextField ShelfLocation;
    private javax.swing.JComboBox<String> HazMatCat;
    private javax.swing.JComboBox<String> StorageArea;
    private javax.swing.JTextField quantityInStock;
    private javax.swing.JButton saveItem;
    private javax.swing.JButton discardItem;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public HazMatInputGUI(HazMatInventory inventory) {
        initComponents(inventory);
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
            java.util.logging.Logger.getLogger(HazMatInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HazMatInputGUI(inventory).setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(HazMatInventory inventory) {

        Title = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        saveItem = new javax.swing.JButton();
        discardItem = new javax.swing.JButton();
        HazMatCat = new javax.swing.JComboBox<>();
        StorageArea = new javax.swing.JComboBox<>();
        itemStockNum = new javax.swing.JTextField();
        ShelfLocation = new javax.swing.JTextField();
        quantityInStock = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Title.setText("HazMat Inventory Menu");

        itemName.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        saveItem.setText("Save");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt, inventory);
            }
        });

        discardItem.setText("Discard");
        discardItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardItemActionPerformed(evt);
            }
        });

        HazMatCat.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        HazMatCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"TOXIC", "FLAMMABLE", "EXPLOSIVE", "OXIDIZING", "CORROSIVE", "COMPRESSEDGAS", "REACTIVE", "SPECIAL", "HEALTHHAZARD", "ORGANICPEROXIDES"}));
        HazMatCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazMatCatActionPerformed(evt);
            }
        });

        StorageArea.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        StorageArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"COMMON AREA", "FLAMMABLE LOCKER", "GAS CYLINDER ENCLOSURE", "REACTIVE LOCKER", "SPECIAL LOCKER"}));

        itemStockNum.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N

        ShelfLocation.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N

        quantityInStock.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Stock number");

        jLabel3.setText("Location");

        jLabel4.setText("Category");

        jLabel5.setText("Storage area");

        jLabel6.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(49, Short.MAX_VALUE)
                                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(itemName)
                                                        .addComponent(itemStockNum)
                                                        .addComponent(ShelfLocation)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel1))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(StorageArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(quantityInStock)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(saveItem)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(discardItem)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(HazMatCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HazMatCat))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemStockNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(StorageArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ShelfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantityInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveItem)
                                        .addComponent(discardItem)
                                        .addComponent(backButton))
                                .addContainerGap())
        );

        itemName.getAccessibleContext().setAccessibleName("name");
        itemName.getAccessibleContext().setAccessibleDescription("name");
        HazMatCat.getAccessibleContext().setAccessibleName("Category");
        HazMatCat.getAccessibleContext().setAccessibleDescription("Category");
        StorageArea.getAccessibleContext().setAccessibleName("Storage");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discardItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardItemActionPerformed
        itemName.setText("");
        itemStockNum.setText("");
        ShelfLocation.setText("");
        HazMatCat.setSelectedItem("Flammable");
        StorageArea.setSelectedItem("Common Area");
        quantityInStock.setText("");
    }//GEN-LAST:event_discardItemActionPerformed

    private void HazMatCatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void saveItemActionPerformed(ActionEvent evt, HazMatInventory inventory) {
        System.out.println("input save button pushed");
        HazMatInventory.HazMatItem temp;
        temp = new HazMatInventory.HazMatItem(this.getItemName(),
                this.getItemStockNum(),
                this.getHazMatCat(),
                this.getStorageArea(),
                this.getShelfLocation(),
                this.getQuantityInStock());

        inventory.addHazMatItemToInventory(temp);
        this.dispose();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("testing back button click");
    }
    // End of variables declaration//GEN-END:variables

    public String getItemName() {
        return itemName.getText();
    }

    public String getShelfLocation() {
        return ShelfLocation.getText();
    }

    public String getHazMatCat() {
        return (String) HazMatCat.getSelectedItem();
    }

    public String getStorageArea() {
        return (String) StorageArea.getSelectedItem();
    }

    public String getItemStockNum() {
        return itemStockNum.getText();
    }

    public int getQuantityInStock() {
        try {
            return Integer.parseInt(quantityInStock.getText());
        } catch (NumberFormatException e) {
            return 0;
    }

}

    void saveItemActionPerformedListener(ActionListener mal) {
        saveItem.addActionListener(mal);
    }

    void backActionPerformedListener(ActionListener mal) {
        backButton.addActionListener(mal);
    }
}
