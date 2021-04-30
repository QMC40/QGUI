import javax.swing.*;
import java.util.List;

public class DisplayMSDSTable
{
    public DisplayMSDSTable(List<MSDSObject> msds)
    {
        Object[][] rows = new Object[msds.size()][16];
        Object[] cols = {"S1_Identification", "S2 Hazards Identification", "S3 Composition Information Ingredients",
                "S4 First Aid Measures", "S5 Fire Fighting Measures", "S6 Accidental Release Measures",
                "S7 Handling and Storage", "S8 Exposure Controls Personal Protection", "S9 Physical and Chemical Properties",
                "S10 Stability and Reactivity", "S11 Toxicological Information", "S12 Ecological Information",
                "S13 Disposal Considerations", "S14 Transport Information", "S15 Regulatory Information",
                "S16 Other Information"};
        for (int i = 0; i < msds.size(); i++)
        {
            rows[i][0] = msds.get(i).getS1_Identification();
            rows[i][1] = msds.get(i).getS2_Hazards_Identification();
            rows[i][2] = msds.get(i).getS3_Composition_Information_Ingredients();
            rows[i][3] = msds.get(i).getS4_First_Aid_Measures();
            rows[i][4] = msds.get(i).getS5_Fire_Fighting_Measures();
            rows[i][5] = msds.get(i).getS6_Accidental_Release_Measures();
            rows[i][6] = msds.get(i).getS7_Handling_and_Storage();
            rows[i][7] = msds.get(i).getS8_Exposure_Controls_Personal_Protection();
            rows[i][8] = msds.get(i).getS9_Physical_and_Chemical_Properties();
            rows[i][9] = msds.get(i).getS10_Stability_and_Reactivity();
            rows[i][10] = msds.get(i).getS11_Toxicological_Information();
            rows[i][11] = msds.get(i).getS12_Ecological_Information();
            rows[i][12] = msds.get(i).getS13_Disposal_Considerations();
            rows[i][13] = msds.get(i).getS14_Transport_Information();
            rows[i][14] = msds.get(i).getS15_Regulatory_Information();
            rows[i][15] = msds.get(i).getS16_Other_Information();
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
        table.getColumnModel().getColumn(6).setMinWidth(widthMin);
        table.getColumnModel().getColumn(7).setMinWidth(widthMin);
        table.getColumnModel().getColumn(8).setMinWidth(widthMin);
        table.getColumnModel().getColumn(9).setMinWidth(widthMin);
        table.getColumnModel().getColumn(10).setMinWidth(widthMin);
        table.getColumnModel().getColumn(11).setMinWidth(widthMin);
        table.getColumnModel().getColumn(12).setMinWidth(widthMin);
        table.getColumnModel().getColumn(13).setMinWidth(widthMin);
        table.getColumnModel().getColumn(14).setMinWidth(widthMin);
        table.getColumnModel().getColumn(15).setMinWidth(widthMin);

        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
}
