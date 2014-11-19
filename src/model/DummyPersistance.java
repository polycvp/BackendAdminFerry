package model;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    
    public DummyPersistance() throws ParseException 
    {
        ferries = new ArrayList<Ferry>();
        ferries.add(new Ferry("1", 100, "Small"));
        ferries.add(new Ferry("2", 150, "Medium"));
        ferries.add(new Ferry("3", 200, "Large"));
        
        locations = new ArrayList<Location>();
        locations.add(new Location("1","Land", "Small Island"));
        locations.add(new Location("2","Land", "Large Island"));
        locations.add(new Location("3","Small Island","Large Island"));
        locations.add(new Location("4","Small Island","Land"));
        locations.add(new Location("5","Large Island","Land"));
        locations.add(new Location("6","Large Island","Small Island"));
        
        trips = new ArrayList<Trip>();
        trips.add(new Trip("1", ferries.get(0), locations.get(0)));
        trips.add(new Trip("2", ferries.get(1), locations.get(0)));
        trips.add(new Trip("3", ferries.get(2), locations.get(0)));
        
        trips.add(new Trip("4", ferries.get(1), locations.get(1)));
        trips.add(new Trip("5", ferries.get(2), locations.get(1)));
        
        trips.add(new Trip("6", ferries.get(1), locations.get(2)));
        
        schedules = new ArrayList<Schedule>();
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        schedules.add(new Schedule("1", format.parse("25/05/2015"), trips));
        schedules.add(new Schedule("2", format.parse("19/01/2015"), trips));
        schedules.add(new Schedule("3", format.parse("12/03/2015"), trips));
        schedules.add(new Schedule("4", format.parse("05/12/2014"), trips));
    }
    
    public void removeFerry(Ferry f) {
       if (ferries.contains(f))
       {
           ferries.remove(f);
       }
    }
    
    public void addFerry(Ferry f) {
        if (!ferries.contains(f)) {
            ferries.add(f);
        }
    }
    
    public void addTrip(Trip t) {
        if (!trips.contains(t)) {
            trips.add(t);
        }
    }
    
    public void removeTrip(Trip t) {
        if (trips.contains(t)) {
            trips.remove(t);
        }
    }
    
    public ArrayList<Ferry> getFerries() {
        return ferries;
    }

    public void setFerries(ArrayList<Ferry> ferries) {
        this.ferries = ferries;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
    
    
}
