import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HazMatItemStockGUI extends javax.swing.JFrame {

    HazMatInventory inventory;
    boolean isWaste;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frameTitle;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField stockNum;
    private javax.swing.JButton save;
    private javax.swing.JButton discard;
    private javax.swing.JButton back;
    // End of variables declaration//GEN-END:variables

    /**
     * GUI for entering items into inventory, waste objects have 'waste' tag set to true
     * @param subj  HazMatInventory object used throughout system
     * @param waste boolean flag to indicate if this item is waste or new inventory
     */
    public HazMatItemStockGUI(HazMatInventory subj,boolean waste) {
        inventory = subj;
        isWaste = waste;
        initComponents();
    }

    public static void callmyGui(HazMatInventory.HazMatItem gain, HazMatInventory subj) {
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

    private void initComponents() {

        frameTitle = new JLabel();
        itemName = new JTextField();
        save = new JButton();
        discard = new JButton();
        stockNum = new JTextField();
        quantity = new JTextField();
        back = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frameTitle.setFont(new Font("Monospaced", Font.BOLD, 18)); // NOI18N
        frameTitle.setText((isWaste) ? "Add waste for disposal" : "Add stock to inventory");

        itemName.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        itemName.setText("name");

        save.setText("Save");
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        discard.setText("Discard");
        discard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                discardActionPerformed(evt);
            }
        });

        stockNum.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        stockNum.setText("Stock number");

        quantity.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        quantity.setText("Quantity in stock");

        back.setText("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(frameTitle, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(save)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(discard)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(back, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(itemName)
                                                        .addComponent(stockNum)
                                                        .addComponent(quantity))))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(frameTitle, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itemName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(stockNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(save)
                                        .addComponent(discard)
                                        .addComponent(back))
                                .addContainerGap())
        );

        itemName.getAccessibleContext().setAccessibleName("name");
        itemName.getAccessibleContext().setAccessibleDescription("name");

        pack();
        setLocationRelativeTo(null);
    }

    private void backButtonActionPerformed(ActionEvent evt) {
        System.out.println("testing back button click");
        new InventoryGUI(inventory).setVisible(true);
        this.dispose();
    }

    private void discardActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("discard button click");
        itemName.setText("");
        stockNum.setText("");
        quantity.setText("");
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {
        HazMatInventory.HazMatItem temp = null;
        try {
            // pull fields out of search GUI to reduce repeated calls
            String name = getItemName();
            String stockNumber = getStockNum();

            // determine if both of the search fields are empty
            if (!name.isEmpty() || !stockNumber.isEmpty()) {
                // check if both populated and if so does name match stock number
                if (!name.isEmpty() && !stockNumber.isEmpty()) {
                    if (inventory.nameFinder(name).equals(inventory.stockNumberFinder(stockNumber))) {
                        temp = inventory.nameFinder(name);
                    } else {
                        JOptionPane.showMessageDialog(null, "Named item " +
                                "doesn't match stock number", "Search Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (!name.isEmpty()) {
                    temp = inventory.nameFinder(name);
                } else {
                    temp = inventory.stockNumberFinder(stockNumber);                }
            } else {
                JOptionPane.showMessageDialog(null, "Search fields are empty",
                        "Search Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Search fields empty",
                    "Search Error", JOptionPane.ERROR_MESSAGE);
        }
        if(temp != null) {
            temp.setQuantityInStock(getQuantity());
            new InventoryGUI(inventory).setVisible(true);
            this.dispose();
        }
    }

    private void AddItemActionPerformed(ActionEvent evt) {

        System.out.println("testing add item button click");
//            HazMatInputGUI input = new HazMatInputGUI();
//            new HazMatInputGUI().setVisible(true);
//            this.dispose();
    }

    private void IssueInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueInventoryActionPerformed
        System.out.println("testing remove item button click");
    }

    private void RemoveItemActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("testing add stock button click");

    }

    private void AddInventoryActionPerformed(ActionEvent evt) {
        System.out.println("testing add inventory button click");
    }

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        System.out.println("testing Help button click");
    }

    private void BackActionPerformed(ActionEvent evt) {
        System.out.println("testing  HMI Stock back button click");
        new InventoryGUI(inventory).setVisible(true);
        this.dispose();
    }

    // getters
    public String getItemName() {
        return itemName.getText().trim();
    }

    public int getQuantity() {
        return Integer.parseInt(quantity.getText().trim());
    }

    public String getStockNum() {
        return stockNum.getText().trim();
    }

    public boolean isWaste() {
        return isWaste;
    }

}
