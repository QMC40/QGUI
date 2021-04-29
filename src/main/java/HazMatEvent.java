/*

  ==============================
	HazMatEvent.java - OOP Team 2 
	* 
	* Patrick Carroll, Aaron Fortner, James Montis
  ==============================
  * 
  * "Haz Mat" is short hand for Hazardous Materials.
  * 
  * This class is for creating and storing information regarding
  * local hazardous events such as oil or chemical spills.
  * 
  * This can serve as a local reference system so employees
  * are aware of previous events, and is where new events are logged.
*/

import java.io.*;
import java.time.LocalDateTime; // 
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


public class HazMatEvent {

	// =======================
	// Haz Mat Event details below
	// =======================

//	private vector<HazMatEvent> eventLog; //

	private String incidentName; // short description of event .. "March 3 Oil Spill"
	private LocalDateTime timeOfEvent; // LocalTime newTime = new LocalDateTime.now();
	
	// just messing with this for now
	LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
  /*Before Formatting: 2021-04-14T11:02:03.600604 
	After Formatting:  14-04-2021 11:02:03 */
	
	private int injured; // # of injuries associated with hazmat event
	private boolean reportedToAgencies; // boolean to check if it was reported to agencies
	private int deaths; // # of deaths associated with hazmat event, 
	
	// Methods  %% rough draft %% need to decide on arguments
	
//	public void createHazMatEvent();
	
//	public void updateHazMatEvent(); // %% need to add arguments
//	public void createAccountReport();
//	public void checkInventory(String item);
	

}
