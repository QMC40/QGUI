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
        for(int i = 0; i < listMSDS.size(); i++)
        {
            fw.append(listMSDS.get(i).getS1_Identification()+",");
            fw.append(listMSDS.get(i).getS2_Hazards_Identification()+",");
            fw.append(listMSDS.get(i).getS3_Composition_Information_Ingredients()+",");
            fw.append(listMSDS.get(i).getS4_First_Aid_Measures()+",");
            fw.append(listMSDS.get(i).getS5_Fire_Fighting_Measures()+",");
            fw.append(listMSDS.get(i).getS6_Accidental_Release_Measures()+",");
            fw.append(listMSDS.get(i).getS7_Handling_and_Storage()+",");
            fw.append(listMSDS.get(i).getS8_Exposure_Controls_Personal_Protection()+",");
            fw.append(listMSDS.get(i).getS9_Physical_and_Chemical_Properties()+",");
            fw.append(listMSDS.get(i).getS10_Stability_and_Reactivity()+",");
            fw.append(listMSDS.get(i).getS11_Toxicological_Information()+",");
            fw.append(listMSDS.get(i).getS12_Ecological_Information()+",");
            fw.append(listMSDS.get(i).getS13_Disposal_Considerations()+",");
            fw.append(listMSDS.get(i).getS14_Transport_Information()+",");
            fw.append(listMSDS.get(i).getS15_Regulatory_Information()+",");
            fw.append(listMSDS.get(i).getS16_Other_Information()+"\n");
        }
        fw.flush();
        fw.close();
    }

    public static List<MSDSObject> readINTOListMSDSFromCSV(String fileName)
    {
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

    private static MSDSObject createMSDSObject(String[] s)
    {
        return new MSDSObject(s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8],s[9],s[10],s[11],s[12],s[13],s[14],s[15]);
    }
}
