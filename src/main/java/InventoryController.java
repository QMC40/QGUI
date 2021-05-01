import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryController {

    public InventoryController(HazMatInventory inventory, InventoryGUI invenGUI) {
        this.inventory = inventory;
        this.invenGUI = invenGUI;

        invenGUI.addItemActionPerformedListener(new addItemListener());
        invenGUI.addInventoryActionPerformedListener(new addInventoryListener());
        invenGUI.BackActionPerformed(new backListener());

    }

    private HazMatInventory inventory;
    private InventoryGUI invenGUI;
    private HazMatInputGUI itemGUI;
    private HazMatItemStockGUI stockGUI;

    class addItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {

            try {
                itemGUI = new HazMatInputGUI(inventory);
                invenGUI.dispose();
                itemGUI.setVisible(true);
                itemGUI.saveItemActionPerformedListener(new saveItemListener());
//                itemGUI.inputBackActionPerformedListener(new inputBackListener());
            } catch (Exception e) {
                System.out.println("something wrong in addItemActionListener");
            }
        }
    }
    class saveItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
            try {
                invenGUI.setVisible(true);
            } catch (Exception e) {
                System.out.println("something wrong in addItemActionListener");
            }
        }
    }
    class addInventoryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {

            try {
                stockGUI = new HazMatItemStockGUI(inventory);
                invenGUI.setVisible(false);
                stockGUI.setVisible(true);
//                stockGUI.saveItemActionPerformedListener(new saveItemListener());
//                stockGUI.backActionPerformedListener(new backListener());
            } catch (Exception e) {
                System.out.println("something wrong in addItemActionListener");
            }
        }
    }
//    class inputBackListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent a) {
////
////            try {
//////                invenGUI.setVisible(true);
////            } catch (Exception e) {
////                System.out.println("something wrong in addItemActionListener");
////            }
//        }
//    }
    class backListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {

            try {
                System.out.println("chickfoot\n");
                FrontGUI frontGUI = new FrontGUI(inventory);
                frontGUI.setVisible(true);
                invenGUI.dispose();
            } catch (Exception e) {
                System.out.println("something wrong in addItemActionListener");
            }
        }
    }
}
