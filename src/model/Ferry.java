/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class Ferry implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String ferryID;
    private int seats;
    private String type;

    public Ferry()
    {
    }

    public Ferry(String ferryID, int seats, String type)
    {
        this.ferryID = ferryID;
        this.seats = seats;
        this.type = type;
    }

    public String getFerryID()
    {
        return ferryID;
    }

    public void setFerryID(String ferryID)
    {
        this.ferryID = ferryID;
    }

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
