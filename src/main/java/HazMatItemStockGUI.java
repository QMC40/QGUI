import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HazMatItemStockGUI extends javax.swing.JFrame {
    HazMatInventory inventory;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField StockNum;
    private javax.swing.JButton save;
    private javax.swing.JButton discard;
    private javax.swing.JButton back;

    public HazMatItemStockGUI(HazMatInventory subj) {
        inventory = subj;
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

        Title = new JLabel();
        itemName = new JTextField();
        save = new JButton();
        discard = new JButton();
        StockNum = new JTextField();
        Quantity = new JTextField();
        back = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new Font("Monospaced", Font.BOLD, 18)); // NOI18N
        Title.setText("Add stock to inventory");

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

        StockNum.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        StockNum.setText("Stock number");

        Quantity.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        Quantity.setText("Quantity in stock");

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
                                                .addComponent(Title, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
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
                                                        .addComponent(StockNum)
                                                        .addComponent(Quantity))))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Title, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itemName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(StockNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Quantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
    }

    private void discardActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("discard button click");
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getQuantity() {
        return Quantity;
    }

    public JTextField getStockNum() {
        return StockNum;
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
}
