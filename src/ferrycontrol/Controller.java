package ferrycontrol;

import contract.IContract;
import java.util.Date;

public class Controller implements IContract {

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteFerry(String ferryID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object getFerry(String ferryID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean updateFerry(String ferryID, int seats, String type) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
