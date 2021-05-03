
// Name: Patrick Carroll, Aaron Fortner and James Montis
// Class: COSC 3324 SP21
// Instructor: Dr Alihan Hadimlioglu
// OOP Team Project
// Date: Sun May 02, 2021
// Program description: Hazardous Materials inventory and documentation system demonstration

import java.io.File;
import java.io.IOException;
/**
 * <h1>Final Project - Hazardous Material inventory system</h1>
 * <br/>
 * <b>
 * If we think about the steps you should be dealing with, you have the requirements phase in which you should be writing a description of the project you are working on. The requirements document is not a technical definition of the project; it is an overview of the application. This document should be understandable by anyone. You should be describing the application the way that we discussed in the class; a document well enough so that we can analyze the uses of the system.
 * Second phase is the design phase in which you actually design your system by using UML diagrams, such as use case diagrams and class diagrams (these two are required, others like activity diagrams will earn you some bonus points). To draw these, you can use ArgoUML, Microsoft Visio, Omni Graffle, etc. When you are preparing your design document you can use Word or PDF and it should be formal and detailed enough. The requirements document should be included as well. This document serves as a documentation, so any details on how the application is used should be included.
 * Last phase is the actual implementation of the project. It is a good idea to divide these tasks between yourselves and try to deal with different parts of the system.
 * Once the teams are certain, you will be added to Trello groups to collaborate. I will be tracking your contribution to the project and will grade you individually accordingly. Make sure to show how you contribute, post as much as possible (actual content as you design & implement).
 * <br/><br/>
 * I am expecting you to prepare:<br/>
 * <li>&emsp;Documentation (A single unified document (Word or PDF), including requirements document, diagrams, any other application specific  details you may need to include)
 * <li>&emsp;Implementation (Java project)
 * <br/><br/>
 * Example projects:
 * <br/>
 * <li>&emsp;A Java game which can demonstrate the use of classes, polymorphism, exception handling and various states within the application.
 * <li>&emsp;A system for a library, pharmacy, store (like HEB, Walmart), office, fitness center, etc. (Lots of possibilities here)
 * <li>&emsp;A management application for employees, courses, reservations, rentals, etc.
 * <li>&emsp;Basically anything that is complex enough so you can create requirements/design documents  and you can demonstrate all the OO concepts that we discussed. You are free to pick any complex project.
 * <br/><br/>
 * Some required components:<br/>
 * <li>&emsp;Exception Handling
 * <li>&emsp;GUI
 * <li>&emsp;Proper class hierarchy (inheritance/polymorphism/composition), Interfaces
 * <li>&emsp;Threading (If needed)
 * </b>
 * @author Patrick Carroll, Aaron Fortner, James Montis
 * @version 3.0
 * @since 2021-5-2
 */
public class HazMatMain extends javax.swing.JFrame {

    /**
     * driver for system,
     * @param args String unused
     */
    public static void main(String[] args) {

        System.out.println("main page is running..");

        // inventory object with inventory arraylist
        HazMatInventory inventory = new HazMatInventory();

        // loading HM sample file into inventory object and (commented out code) utility to create new file
        // after input of data console output verifies via size of the Arraylist in HazMatInventory
        System.out.printf("arraylist size before: %d\n",inventory.getHazMatStock().size());
        File file = new File("HazMatInv_Data_CSV_File.csv");
        FileOperations.readINTOListHazMatInvItemsFromCSV(file.getAbsolutePath(),inventory.getHazMatStock());
//        System.out.printf("arraylist size after: %d\n",inventory.getHazMatStock().size());
//        try {
//            FileOperations.writeFileToHazMatInvItemsFromCSV("test.csv",inventory.getHazMatStock());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(inventory);

    //load front GUI

        // load front end GUI
        FrontGUI frontGUI = new FrontGUI(inventory);
        frontGUI.setVisible(true);
    }
}
