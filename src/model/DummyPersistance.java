package model;

import java.util.ArrayList;

/**
 * Description: This class contains initialized 
 * arraylists with persistance data that 
 * acts as a database for the six use cases that need to be implemented
 */
public class DummyPersistance {
    private ArrayList<Ferry> ferries;
    private ArrayList<Location> locations;
    private ArrayList<Trip> trips;
    private ArrayList<Schedule> schedules;
    
    public DummyPersistance() {
        ferries = new ArrayList<Ferry>();
        locations = new ArrayList<Location>();
    }
}
