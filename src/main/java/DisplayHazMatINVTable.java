import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
/**
 * <h1>Final Project - DisplayHazMatInvTable Class</h1>
 *
 * <b>Note: This class provides the to
 * Display CSV file in a table.
 *
 *</b>
 * @author Team 2
 * @version 1.0
 * @since 2021-5-2
 */
public class DisplayHazMatINVTable
{
    /**
     * This method is used to
     * Display HazMat Data on a table
     * @param ArrayList<HazMatInventory.HazMatItem> hazMatItemList
     * @return none
     */
    public DisplayHazMatINVTable(ArrayList<HazMatInventory.HazMatItem> hazMatItemList)
    {
        Object[][] rows = new Object[hazMatItemList.size()][7];

        Object[] cols = {"Name", "Stock Number", "Location",
                "Category","Storage Area", "Quantity"};
        for (int i = 0; i < hazMatItemList.size(); i++)
        {
            rows[i][0] = hazMatItemList.get(i).getName();
            rows[i][1] = hazMatItemList.get(i).getStockNumber();
            rows[i][2] = hazMatItemList.get(i).getShelfLocation(); // Issue Not Finding Regular Location
            rows[i][3] = hazMatItemList.get(i).getHazMatCategory();
            rows[i][4] = hazMatItemList.get(i).getStorageArea();
            rows[i][5] = hazMatItemList.get(i).getQuantityInStock();
        }

        JTable table = new JTable(rows, cols);
        table.setDefaultEditor(Object.class, null); // Make cells non editable
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  // Make Scrollable
        int widthMin = 300;
        table.getColumnModel().getColumn(0).setMinWidth(widthMin);
        table.getColumnModel().getColumn(1).setMinWidth(widthMin);
        table.getColumnModel().getColumn(2).setMinWidth(widthMin);
        table.getColumnModel().getColumn(3).setMinWidth(widthMin);
        table.getColumnModel().getColumn(4).setMinWidth(widthMin);
        table.getColumnModel().getColumn(5).setMinWidth(widthMin);

        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
}
