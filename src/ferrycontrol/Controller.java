package ferrycontrol;

import contract.IContract;
import java.util.ArrayList;
import java.util.Date;
import model.DummyPersistance;
import model.Ferry;

public class Controller implements IContract {
    
    DummyPersistance dp;
    ArrayList<Ferry> ferries;
    public Controller()
    {
        dp = new DummyPersistance();
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
        ferries = dp.getFerries();
        int currentSize = ferries.size();
        
        for(Ferry f : ferries)
        {
            String id = f.getFerryID();
            if(id.equals(ferryID))
            {
                ferries.remove(f);
            }
        }
        
        if(ferries.size() < currentSize)
        {
            return true;
        }
        else
            return false;
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
        int currentSize = ferries.size();
        Ferry updatedFerry = new Ferry(ferryID, seats, type);
        for(Ferry f : ferries)
        {
            String id = f.getFerryID();
            if(id.equals(ferryID))
            {
                ferries.remove(f);
                ferries.add(updatedFerry);
            }
        }
        
        if(currentSize == ferries.size())
        {
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
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean deleteTrip(String tripID) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
