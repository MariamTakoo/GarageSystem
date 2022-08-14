package com.company;


import java.util.Date;

public class Slot{
    // info of slot
    private double width;
    private double depth;
    private  int parkingID;
    private  boolean available;
    private Date startTime;
    private  Date endTime;
   // setter and getter for all info
    public  void setWidth(double wid)
    {
        this.width=wid;
    }
    public  void setDepth(double dep)
    {
        this.depth=dep;
    }
    public double getWidth()
    {
        return width;
    }
    public double getDepth()
    {
        return depth;
    }
    public  void setParkingID(int index)
    {
        this.parkingID =index;
    }
    public int getParkingID()
    {
        return parkingID;
    }
    public void setAvailability(boolean avail)
    {
        this.available=avail;
    }
    public  boolean getAvailability()
    {
        return available;
    }
    public void setStartTime(Date start)
    {
        this.startTime=start;
    }
    public Date getStartTime()
    {
        return startTime;
    }
    public void setEndTime( Date end)
    {
        this.endTime=end;
    }
    public Date getEndTime()
    {
        return endTime;
    }

}
