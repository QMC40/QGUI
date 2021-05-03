import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HazMatInventory {

    /**
     * ArrayList of items in the inventory
     */
    private ArrayList<HazMatItem> HazMatStock = new ArrayList<>();

    //NOT THREAD SAFE / NOT SELF-SYNCHRONIZING!!!
    // another possible interface opportunity?
    // public interface HazMatInventoryAccess {}

    /**
     * constructor
     */
    public HazMatInventory() {
    }

    public ArrayList<HazMatItem> getHazMatStock() {
        return HazMatStock;
    }

    public boolean isInInventory(HazMatItem subj) {
        return (HazMatStock.contains(subj));
    }

    //refactor to implement exception handling for bad entry / boolean return
    //for entry confirmation?

    public void issueInventory(HazMatItem issue, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(issue)).quantityInStock -= quantity;
    }

    public void addToInventory(HazMatItem supply, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(supply)).quantityInStock += quantity;
    }

    public void addHazMatItemToInventory(HazMatItem gain) {
        HazMatStock.add(gain);
    }

    public void removeHazMatItemFromInventory(HazMatItem loss) {
        HazMatStock.remove(loss);
        String message = String.format("%s Removed", loss.getName());
        JOptionPane.showMessageDialog(null, message);
        System.out.printf("Current inventory size: %d\n", getHazMatStock().size());
    }

    public HazMatItem nameFinder(String findMe) {
        try {
            for (HazMatItem e : HazMatStock) {
                if (e.getName().equals(findMe)) {
                    return e;
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "HazMatStock is empty");
        }
        return null;
    } // finder for HazMatInventory names

    public HazMatItem stockNumberFinder(String findMe) {
        if (findMe != null) {
            try {
                for (HazMatItem e : HazMatStock) {
                    if (e.getStockNumber().equals(findMe)) {
                        return e;
                    }
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "HazMatStock is empty");
                return null;
            }
        }
        return null;
    } // finder for HazMatInventory Stock numbers

    //testing method to see what's in the inventory
    public String toString() {
        StringBuilder buffer = new StringBuilder("\n");
        for (HazMatItem subj : HazMatStock) {
            buffer.append(subj).append("\n\n");
        }
        buffer.append("\n");
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
        boolean waste;

        public HazMatItem() {
            this("", "", "", "", "", 0, false);
        }

        public HazMatItem(String name, String stockNumber, String hazMatCategory, String storageArea,
                          String shelfLocation, int stock, boolean waste) {
            this.name = name;
            this.stockNumber = stockNumber;
            this.hazMatCategory = hazMatCategory;
            this.storageArea = storageArea;
            this.shelfLocation = shelfLocation;
            this.quantityInStock = stock;
            this.waste = waste;
        }

        public HazMatItem(String[] attributes) {
            this(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4],
                    Integer.parseInt(attributes[5]), Boolean.parseBoolean(attributes[6]));
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
                    shelfLocation, stock, false);
        }

        public String toString() {
            return String.format("Name: %s%nStock number: %s%nHazardous Material Cat: %s%nStorage area: %s%n" +
                            "Shelf location: %s%nQuantity in stock: %d%nHazardous Waste? %s", getName(),
                    getStockNumber(),
                    getHazMatCategory(),
                    getStorageArea(), getShelfLocation(), getQuantityInStock(), (isWaste() ? "Y" : "N"));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HazMatItem)) return false;
            HazMatItem that = (HazMatItem) o;
            return getQuantityInStock() == that.getQuantityInStock() && isWaste() == that.isWaste() && getName().equals(that.getName()) && getStockNumber().equals(that.getStockNumber()) && getHazMatCategory().equals(that.getHazMatCategory()) && getStorageArea().equals(that.getStorageArea()) && getShelfLocation().equals(that.getShelfLocation());
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
            this.quantityInStock += quantityInStock;
        }

        public boolean isWaste() {
            return waste;
        }

        public void setWaste(boolean waste) {
            this.waste = waste;
        }

    }

}

