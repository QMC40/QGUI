import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryController {

    public InventoryController(HazMatInventory inventory, InventoryGUI GUI) {
        this.inventory = inventory;
        this.GUI = GUI;

        GUI.addItemActionPerformedListener(new addItemListener());
    }

    private HazMatInventory inventory;
    private InventoryGUI GUI;
    private HazMatInputGUI itemGUI;

    class addItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {

            try {
                itemGUI = new HazMatInputGUI(inventory);
                GUI.setVisible(false);
                itemGUI.setVisible(true);
            } catch (Exception e) {
                System.out.println("something wrong in addItemActionListener");
            }
        }
    }
}
