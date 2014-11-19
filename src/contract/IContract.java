package contract;

import java.util.Date;

public interface IContract {

	/**
	 * Saves a user with a username and a password.
	 * 
	 * @param username
	 * @param password
	 * @return boolean - true, if the user was successfully added, otherwise false.
	 */
	public boolean addUser(String username, String password);
	
	/**
	 * 
	 * Delete a user by username
	 * 
	 * @param username
	 * @return boolean - true, if the user was deleted, false if the user don't exists or other reasons.
	 */
	public boolean deleteUser(String username);
	
	/**
	 * 
	 * Update user by userID, username and password will be updated in database.
	 * 
	 * 
	 * @param userID
	 * @param username
	 * @param password
	 * @return boolean - true, if user was successfully updated, false if something in the process went wrong.
	 */
	public boolean updateUser(String userID, String username, String password);
	
	/**
	 * Return a DTO (Data-transfer-object) with user information by userID. 
	 * 
	 * @param userID
	 * @return Object - A data transfer object with the specific information needed for the GUI.
	 */
	public Object getUser(String userID);
	
	/**
	 * 
	 * Validate if user exists in database
	 * 
	 * @param password
	 * @param username
	 * @return boolean - true, if user exists, false otherwise.
	 */
	public boolean validateUser(String password, String username);
	
	/**
	 * Create a ferry with number of seats and what ferry type.
	 * 
	 * @param seats
	 * @param type
	 * @return boolean - true, if ferry was successfully created, otherwise false.
	 */
	public boolean addFerry(int seats, String type);
	
	/**
	 * Delete a ferry by id.
	 * 
	 * @param ferryID
	 * @return boolean - true, if was successfully deleted, otherwise false.
	 */
	public boolean deleteFerry(String ferryID);
	
	/**
	 * Return a DTO (Data-transfer-object) with information about a ferry by id.
	 * 
	 * @param ferryID
	 * @return Object - Data transfer object with the specific ferry information needed by the GUI.
	 */
	public Object getFerry(String ferryID);
	
	/**
	 * Update a ferry by id, seats and type will be updated.
	 * 
	 * @param ferryID
	 * @param seats
	 * @param type
	 * @return boolean - true, if successfully updated, otherwise false.
	 */
	public boolean updateFerry(String ferryID, int seats, String type);
	
	/**
	 * Add a start and end location.
	 * 
	 * @param startLocation
	 * @param endLocation
	 * @return boolean - true, if succesfully added, otherwise false.
	 */
	public boolean addLocation(String startLocation, String endLocation);
	
	/**
	 * Delete a location by id.
	 * 
	 * @param locationID
	 * @return boolean - true, if successfully deleted, otherwise false.
	 */
	public boolean deleteLocation(String locationID);
	
	/**
	 * By id returns a DTO (Data-transfer-object) of a location information.
	 * 
	 * @param locationID
	 * @return Object - Data transfer object with specific GUI information.
	 */
	public Object getLocation(String locationID);
	
	/**
	 * Update location by id. Start and end location will be updated.
	 * 
	 * @param locationID
	 * @param startLocation
	 * @param endLocation
	 * @return boolean - true, if successfully updated, otherwise false.
	 */
	public boolean updateLocation(String locationID, String startLocation, String endLocation);
	
	/**
	 * Create a trip with a ferryID and a locationID.
	 * 
	 * @param ferryID
	 * @param locationID
	 * @return boolean - true, if trip was successfully added, otherwise false.
	 */
	public boolean addTrip(String ferryID, String locationID);
	
	/**
	 * Delete a trip by id.
	 * 
	 * @param tripID
	 * @return boolean - true, if successfully deleted, otherwise false.
	 */
	public boolean deleteTrip(String tripID);
	
	/**
	 * By id returns a DTO (Data-transfer-object) with relevant trip information needed for GUI.
	 * 
	 * @param tripID
	 * @return Object - Data transfer object with specific GUI information.
	 */
	public Object getTrip(String tripID);
	
	/**
	 * Update trip by id. Trip can be updated with a ferryID and a locationID.
	 * 
	 * @param tripID
	 * @param ferryID
	 * @param locationID
	 * @return boolean - true, if successfully updated, otherwise false.
	 */
	public boolean updateTrip(String tripID, String ferryID, String locationID);
	
	/**
	 * Creates a schedule
	 * 
	 * @param date
	 * @return boolean - true, if successfully added, otherwise false.
	 */
	public boolean addSchedule(Date date);
	
	
	
}
