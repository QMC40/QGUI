import javax.swing.*;
import java.util.ArrayList;

/**
 * class stores and operates on input hazardous material inventory data
 */
public class HazMatInventory {

    /**
     * ArrayList of items in the inventory
     */
    private ArrayList<HazMatItem> HazMatStock = new ArrayList<>();

    /**
     * constructor
     */
    public HazMatInventory() {
    }

    /**
     * returns reference to inventory ArrayList
     * @return ArrayList<HazMatItem> stored ArrayList of HazMatItems</HazMatItem>
     */
    public ArrayList<HazMatItem> getHazMatStock() {
        return HazMatStock;
    }

    /** UNIMPLEMENTED
     * intended to query inventory to determine if requested item was in stock
     * @param subj HazMatItem item being requested from inventory
     * @return boolean status of item being in the inventory
     */
    public boolean isInInventory(HazMatItem subj) {
        return (HazMatStock.contains(subj));
    }

    /** UNIMPLEMENTED
     * intended to take issue request and if available 'issue' the material and deduct the issued quantity
     * from the inventory
     * @param issue HazMatItem material to be issued to the user
     * @param quantity int quantity of the material requested
     */
    public void issueInventory(HazMatItem issue, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(issue)).quantityInStock -= quantity;
    }

    /** UNIMPLEMENTED
     * intended to add stock to an item already in the inventory
     * @param supply HazMatItem item being stocked into inventory
     * @param quantity int number of items to be added to the inventory
     */
    public void addToInventory(HazMatItem supply, int quantity) {
        HazMatStock.get(HazMatStock.indexOf(supply)).quantityInStock += quantity;
    }

    /**
     * adds a new item of HazMat into the inventory system
     * @param gain HazMatItem HazMat object to be added to inventory tracking
     */
    public void addHazMatItemToInventory(HazMatItem gain) {
        HazMatStock.add(gain);
    }

    /**
     * removed submitted HazMatItem object from the inventory tracker
     * @param loss HazMatItem item to be removed from tracking
     */
    public void removeHazMatItemFromInventory(HazMatItem loss) {
        HazMatStock.remove(loss);
        String message = String.format("%s Removed", loss.getName());
        JOptionPane.showMessageDialog(null, message);
        System.out.printf("Current inventory size: %d\n", getHazMatStock().size());
    }

    /**
     * searches inventory for item based on name and returns the object if found, null otherwise
     * @param findMe String search target
     * @return HazMatItem item found in inventory, null if not found
     */
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

    /**
     * searches inventory for item based on stock number and returns the object if found, null otherwise
     * @param findMe String search target
     * @return HazMatItem item found in inventory, null if not found
     */
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

    /**
     * overloaded toString to print contents of inventory
     * @return String formatted string of inventory contents
     */
    public String toString() {
        StringBuilder buffer = new StringBuilder("\n");
        for (HazMatItem subj : HazMatStock) {
            buffer.append(subj).append("\n\n");
        }
        buffer.append("\n");
        return buffer.toString();
    }

    /**
     * class of HazMat objects for tracking inventory in the system
      */
    protected static class HazMatItem {

        String name;
        String stockNumber;
        String hazMatCategory;
        String storageArea;
        String shelfLocation;
        int quantityInStock;
        boolean waste;

        /**
         * no args constructor
         */
        public HazMatItem() {
            this("", "", "", "", "", 0, false);
        }

        /**
         * args constructor
         * @param name String Common name of the material
         * @param stockNumber String stock number of the material
         * @param hazMatCategory String category of hazardous material
         * @param storageArea String storage requirements of the material
         * @param shelfLocation String specific location with it's storage containment
         * @param stock int quantity in stock of the item
         * @param waste boolean is the item HazMat Waste or new stock?
         */
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

        /**
         * utility constructor to accept attribute file read in operation in FileOperations
         * @param attributes String array of characteristics from file read in
         */
        public HazMatItem(String[] attributes) {
            this(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4],
                    Integer.parseInt(attributes[5]), Boolean.parseBoolean(attributes[6]));
        }

        /**
         * overridden toString method for printing out HazMatItem object fields
         * @return String formatted values of object fields
         */
        @Override
        public String toString() {
            return String.format("Name: %s%nStock number: %s%nHazardous Material Cat: %s%nStorage area: %s%n" +
                            "Shelf location: %s%nQuantity in stock: %d%nHazardous Waste? %s", getName(),
                    getStockNumber(), getHazMatCategory(), getStorageArea(), getShelfLocation(),
                    getQuantityInStock(), (isWaste() ? "Y" : "N"));
        }


        /**
         * overridden equals method
         * @param o Object for comparison
         * @return boolean evaluation of the equivalence of the two objects
         */
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

