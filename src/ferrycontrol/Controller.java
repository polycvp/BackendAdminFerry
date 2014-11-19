package ferrycontrol;

import contract.IContract;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DummyPersistance;
import model.Ferry;
import model.Location;
import model.Trip;

public class Controller implements IContract {
    
    DummyPersistance dp;
    ArrayList<Ferry> ferries;
    public Controller()
    {
        try {
            dp = new DummyPersistance();
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            

    @Override
    public boolean addUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteUser(String username) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean updateUser(String userID, String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object getUser(String userID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean validateUser(String password, String username) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean addFerry(int seats, String type) {
        ferries = dp.getFerries();
        int currentSize = ferries.size();
        
        Ferry lastFerry = ferries.get(currentSize-1);
        int lastFerryID = Integer.parseInt(lastFerry.getFerryID());
        String newFerryId = Integer.toString(lastFerryID + 1);
        
        Ferry newFerry = new Ferry(newFerryId, seats, type);
        ferries.add(newFerry);
        
        if(ferries.size() > currentSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean deleteFerry(String ferryID) {
        Ferry toDelete = null;
        for(Ferry f : dp.getFerries())
        {
            String id = f.getFerryID();
            if(id.equals(ferryID))
            {
                toDelete = f;
            }
        }
        if (toDelete!=null)
        {
            dp.removeFerry(toDelete);
            return true;
        }
        else return false;
    }

    @Override
    public Object getFerry(String ferryID) {
        ferries = dp.getFerries();
        
         Ferry ferry = new Ferry();
        for(Ferry f : ferries)
        {
            String id = f.getFerryID();
            if(id.equals(ferryID))
            {
               ferry = f;
            }
        }
        return ferry; 
    }

    @Override
    public boolean updateFerry(String ferryID, int seats, String type) {
        ferries = dp.getFerries();
        Ferry updatedFerry = null,oldFerry=null;
        for(Ferry f : ferries)
        {
            String id = f.getFerryID();
            if(id.equals(ferryID))
            {
                updatedFerry = new Ferry(ferryID, seats, type);
                oldFerry = f;
            }
        }
        if(updatedFerry != null)
        {
            dp.removeFerry(oldFerry);
            dp.addFerry(updatedFerry);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean addLocation(String startLocation, String endLocation) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean deleteLocation(String locationID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object getLocation(String locationID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean updateLocation(String locationID, String startLocation, String endLocation) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean addTrip(String ferryID, String locationID) {
        Ferry tripFerry = null;
        Location tripLocation = null;
        for (Ferry f:dp.getFerries())
        {
            if (ferryID.equals(f.getFerryID())) {
                tripFerry =f;
            }
        }
        for (Location l:dp.getLocations()) {
            if (locationID.equals(l.getLocationID())) {
                tripLocation = l;
            }
        }
        String lastTripId;
        if (dp.getTrips().size()!=0)
            lastTripId = dp.getTrips().get(dp.getTrips().size()-1).getTripID();
        else lastTripId = "1";
        int newId = Integer.parseInt(lastTripId)+1;
        if (tripLocation!=null && tripFerry!=null) {
            dp.addTrip(new Trip(Integer.toString(newId),tripFerry,tripLocation));
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean deleteTrip(String tripID) {
        Trip toDelete = null;
        for (Trip t: dp.getTrips()) {
            if(tripID.equals(t.getTripID()))
                toDelete = t;
        }
        if (toDelete!=null) {
            dp.removeTrip(toDelete);
            return true;
        }
        else return false;
    }

    @Override
    public Object getTrip(String tripID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean updateTrip(String tripID, String ferryID, String locationID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean addSchedule(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
