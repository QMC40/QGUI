import javax.swing.*;
import java.awt.*;

public class HazMatInputGUI extends javax.swing.JFrame {

    public HazMatInputGUI(HazMatInventory.HazMatItem temp) {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TItle = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        saveItem = new javax.swing.JButton();
        discardItem = new javax.swing.JButton();
        HazMatCat = new javax.swing.JComboBox<>();
        StorageArea = new javax.swing.JComboBox<>();
        itemStockNum = new javax.swing.JTextField();
        ShelfLocation = new javax.swing.JTextField();
        quantityInStock = new javax.swing.JTextField();
        backButtontton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TItle.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18)); // NOI18N
        TItle.setText("HazMat Inventory Menu");

        itemName.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        itemName.setText("name");
        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        saveItem.setText("Save");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });

        discardItem.setText("Discard");

        HazMatCat.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        HazMatCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOXIC", "FLAMMABLE", "EXPLOSIVE", "OXIDIZING", "CORROSIVE", "COMPRESSEDGAS", "REACTIVE", "SPECIAL", "HEALTHHAZARD", "ORGANICPEROXIDES" }));
        HazMatCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazMatCatActionPerformed(evt);
            }
        });

        StorageArea.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        StorageArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMMON AREA", "FLAMMABLE LOCKER", "GAS CYLINDER ENCLOSURE", "REACTIVE LOCKER", "SPECIAL LOCKER" }));

        itemStockNum.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        itemStockNum.setText("Stock number");

        ShelfLocation.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        ShelfLocation.setText("Shelf Location");

        quantityInStock.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        quantityInStock.setText("Quantity in stock");

        backButtontton1.setText("Back");
        backButtontton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemName)
                            .addComponent(itemStockNum)
                            .addComponent(ShelfLocation)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(TItle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StorageArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantityInStock)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discardItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButtontton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HazMatCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TItle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HazMatCat))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemStockNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StorageArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShelfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveItem)
                    .addComponent(discardItem)
                    .addComponent(backButtontton1))
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

    private void HazMatCatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("input save button pushed");
//        HazMatInventory.HazMatItem temp1 = new HazMatInventory.HazMatItem(
//                "test", "1",
//                HazMatInventory.HazMatItem.HazMatCategory.FLAMMABLE,
//                HazMatInventory.HazMatItem.StorageArea.FLAMMABLELOCKER,"top",10);
//        HazMatInventory temp = new HazMatInventory();
//        test.addHazMatItemToInventory(temp1);
//        System.out.println(temp1.toString());
//
    }

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("testing back button click");
//        new InventoryGUI().setVisible(true);
//        this.dispose();
    }

    public static void callmyGui(HazMatInventory.HazMatItem gain){
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
                new HazMatInputGUI(gain).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HazMatCat;
    private javax.swing.JTextField ShelfLocation;
    private javax.swing.JComboBox<String> StorageArea;
    private javax.swing.JLabel TItle;
    private javax.swing.JButton backButtontton1;
    private javax.swing.JButton discardItem;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemStockNum;
    private javax.swing.JTextField quantityInStock;
    private javax.swing.JButton saveItem;
    // End of variables declaration//GEN-END:variables

    public JTextField getItemName() {
        return itemName;
    }
    public JTextField getShelfLocation() {
        return ShelfLocation;
    }
}
