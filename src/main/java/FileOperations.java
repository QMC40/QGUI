import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOperations
{
    public static void writeFileToCSVMSDS(String fileName, List<MSDSObject> listMSDS) throws IOException {
        FileWriter fw = new FileWriter(fileName,false); // Makes sure to Overwrite File
        for (MSDSObject listMSD : listMSDS) {
            fw.append(listMSD.getS1_Identification() + ",");
            fw.append(listMSD.getS2_Hazards_Identification() + ",");
            fw.append(listMSD.getS3_Composition_Information_Ingredients() + ",");
            fw.append(listMSD.getS4_First_Aid_Measures() + ",");
            fw.append(listMSD.getS5_Fire_Fighting_Measures() + ",");
            fw.append(listMSD.getS6_Accidental_Release_Measures() + ",");
            fw.append(listMSD.getS7_Handling_and_Storage() + ",");
            fw.append(listMSD.getS8_Exposure_Controls_Personal_Protection() + ",");
            fw.append(listMSD.getS9_Physical_and_Chemical_Properties() + ",");
            fw.append(listMSD.getS10_Stability_and_Reactivity() + ",");
            fw.append(listMSD.getS11_Toxicological_Information() + ",");
            fw.append(listMSD.getS12_Ecological_Information() + ",");
            fw.append(listMSD.getS13_Disposal_Considerations() + ",");
            fw.append(listMSD.getS14_Transport_Information() + ",");
            fw.append(listMSD.getS15_Regulatory_Information() + ",");
            fw.append(listMSD.getS16_Other_Information() + "\n");
        }
        fw.flush();
        fw.close();
    }

    public static List<MSDSObject> readINTOListMSDSFromCSV(String fileName) {

        List<MSDSObject> msdsAL = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");

                MSDSObject msds = createMSDSObject(attributes);

                msdsAL.add(msds);

                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return msdsAL;
    }

    private static MSDSObject createMSDSObject(String[] s) {
        return new MSDSObject(s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8],s[9],s[10],s[11],s[12],s[13],s[14],s[15]);
    }

    //HazMat Inventory Items
    public static void readINTOListHazMatInvItemsFromCSV(String fileName,
                                             ArrayList<HazMatInventory.HazMatItem> subj)
    {
//        List<HazMatInventory.HazMatItem> listHazMatInv = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                HazMatInventory.HazMatItem item = new HazMatInventory.HazMatItem(attributes);
                subj.add(item);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void writeFileToHazMatInvItemsFromCSV(String fileName, ArrayList<HazMatInventory.HazMatItem> listHazMatInv)
            throws IOException {
        FileWriter fw = new FileWriter(fileName,false); // Makes sure to Overwrite File
        for (HazMatInventory.HazMatItem hazMatItem : listHazMatInv) {
            fw.append(hazMatItem.getName() + ",");
            fw.append(hazMatItem.getStockNumber() + ",");
            fw.append(hazMatItem.getShelfLocation() + ",");
            fw.append(hazMatItem.getHazMatCategory() + ",");
            fw.append(hazMatItem.getStorageArea() + ",");
            fw.append(hazMatItem.getQuantityInStock() + ",");
            fw.append(hazMatItem.isWaste() + "\n");
        }
        fw.flush();
        fw.close();
    }

    // we don't need this I made a constructor to take your attributes list, easier
//    private static HazMatInventory.HazMatItem createHazMatInvItem(String[] s)
//    {
//        return new HazMatInventory.HazMatItem(s[0], s[1], s[2], s[3],
//                s[4], Integer.parseInt(s[5]));
//    }
}
