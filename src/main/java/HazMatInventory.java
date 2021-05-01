import java.util.ArrayList;
import java.util.Scanner;

public class HazMatInventory {

    public ArrayList<HazMatItem> getHazMatStock() {
        return HazMatStock;
    }

    //NOT THREAD SAFE / NOT SELF-SYNCHRONIZING!!!
    private ArrayList<HazMatItem> HazMatStock = new ArrayList<>();

    //another possible interface opportunity?
    //public interface HazMatInventoryAccess {}
    private ArrayList<HazMatItem> WasteInventory = new ArrayList<>();

    public HazMatInventory() {
    }

    //won't work, need to find name inside DT
//    public int indexOfItem(String name) {
//        return HazMatStock.indexOf(name);
//    }

    public boolean isInStock(HazMatItem subj) {
        return (HazMatStock.contains(subj));
    }
    //refactor to implement exception handling for bad entry / boolean return
    //for entry confirmation?
    public void disposeOfWaste(HazMatItem wasteOut, int quantity) {
        WasteInventory.get(WasteInventory.indexOf(wasteOut)).quantityInStock -= quantity;
    }

    public void storeWaste(HazMatItem wasteIn, int quantity) {
        WasteInventory.get(WasteInventory.indexOf(wasteIn)).quantityInStock += quantity;
    }

    public void addHazMatItemToWasteInventory() {
        HazMatItem gain = HazMatItem.createHazMatItem();
        WasteInventory.add(gain);
    }

    public void removeHazMatItemFromWasteInventory(HazMatItem loss) {
        WasteInventory.remove(loss);
    }

    public void issueInventory(HazMatItem issue, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(issue)).quantityInStock -= quantity;
    }

    public void addToInventory(HazMatItem supply, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(supply)).quantityInStock += quantity;
    }

    public void addHazMatItemToInventory(HazMatItem gain) {
        HazMatStock.add(gain);
        System.out.println(gain.toString());
    }

    public void removeHazMatItemFromInventory(HazMatItem loss) {
        HazMatStock.remove(loss);
    }

    //testing method to see what's in the inventory
    public String ToString() {
        StringBuilder buffer = new StringBuilder();
        for (HazMatItem subj : HazMatStock) {
            System.out.println(subj.toString());
            buffer.append(subj.toString());
        }
        for (HazMatItem subj : WasteInventory) {
            System.out.println(subj.toString());
            buffer.append(subj.toString());
        }
        return buffer.toString();
    }

    //Item of Haz Mat to be inventoried
    protected static class HazMatItem {

        String name;
        String stockNumber;
        String hazMatCategory;
        String storageArea;
        String shelfLocation;
        int quantityInStock;

        public HazMatItem() {
            this("","","","","",0);
        }

        public HazMatItem(String name, String stockNumber, String hazMatCategory, String storageArea,
                          String shelfLocation, int stock) {
            this.name = name;
            this.stockNumber = stockNumber;
            this.hazMatCategory = hazMatCategory;
            this.storageArea = storageArea;
            this.shelfLocation = shelfLocation;
            this.quantityInStock = stock;
        }

        public HazMatItem(String[] attributes) {
            this(attributes[0],attributes[1],attributes[2],attributes[3],attributes[4],
                    Integer.parseInt(attributes[5]));
        }

        public static HazMatItem createHazMatItem() {
            System.out.println("Enter data for HazMat Item to be added:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Stock Number: ");
            String stockNumber = scanner.nextLine();
            System.out.print("HazMat Category: ");
            String hazMatCategory = "FLAMMABLE";
            System.out.print("\nStorage Area: ");
            String storageArea = "COMMON";
            System.out.print("\nShelf Location: ");
            String shelfLocation = scanner.nextLine();
            //add invalid input exception test
            System.out.print("Quantity in stock: ");
            int stock = scanner.nextInt();
            return new HazMatItem(name, stockNumber, hazMatCategory, storageArea,
                    shelfLocation, stock);
        }

        public String toString() {
            System.out.println("test\n");
            return String.format("Name: %s%nStock number: %s%nHazardous Material Cat: %s%nStorage area: %s%n" +
                            "Shelf location: %s%nQuantity in stock: %d", getName(), getStockNumber(), getHazMatCategory(),
                    getStorageArea(), getShelfLocation(), getQuantityInStock());
        }

        //setters and getters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStockNumber() {
            return stockNumber;
        }

        public void setStockNumber(String stockNumber) {
            this.stockNumber = stockNumber;
        }

        public String getHazMatCategory() {
            return hazMatCategory;
        }

        public void setHazMatCategory(String hazMatCategory) {
            this.hazMatCategory = hazMatCategory;
        }

        public String getStorageArea() {
            return storageArea;
        }

        public void setStorageArea(String storageArea) {
            this.storageArea = storageArea;
        }

        public String getShelfLocation() {
            return shelfLocation;
        }

        public void setShelfLocation(String shelfLocation) {
            this.shelfLocation = shelfLocation;
        }

        public int getQuantityInStock() {
            return quantityInStock;
        }

        public void setQuantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }

        public enum HazMatCategory {
            TOXIC("Toxic"), FLAMMABLE("Flammable"), EXPLOSIVE("Explosive"), OXIDIZING("Oxidizing"),
            CORROSIVE("Corrosive"),COMPRESSEDGAS("Compressed Gas"),REACTIVE("Reactive"), SPECIAL("Special"),
            HEALTHHAZARD("Health Hazard"), ORGANICPEROXIDES("Organic Peroxides");
            private final String display;
            HazMatCategory(String s) {
                display = s;
            }
            public String toString() {
                return display;
            }
        }

        public enum StorageArea {
            COMMON("Common Area"), FLAMMABLELOCKER("Flam Locker"), GASCYLINDERENCLOSURE("Cylinder Enclosure"),
            REACTIVELOCKER("Reactive Locker"), SPECIALLOCKER("Special Locker");
            private final String display;
            StorageArea(String s) {
                display = s;
            }
            public String toString() {
                return display;
            }
        }

    }

}

