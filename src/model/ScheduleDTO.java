/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paul
 */
public class ScheduleDTO implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String scheduleID;
    private Date date;
    private List<Trip> listOfTrips;
    
    public ScheduleDTO()
    {
        
    }
    
    public ScheduleDTO(String scheduleID, Date date, List<Trip> listOfTrips)
    {
        this.scheduleID = scheduleID;
        this.date = date;
        this.listOfTrips = listOfTrips;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Trip> getListOfTrips() {
        return listOfTrips;
    }

    public void setListOfTrips(List<Trip> listOfTrips) {
        this.listOfTrips = listOfTrips;
    }
    
}
