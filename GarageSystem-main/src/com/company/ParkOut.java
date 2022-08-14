package com.company;

public class ParkOut {

    public int parkOut(int id,Slot[] slot)
    {

        int size= slot.length;
        // check if the parking id is found
        for (int i=0;i<size;i++)
        {
            if (slot[i].getParkingID()==id&& !slot[i].getAvailability())
            {
                // set the availability by true
                slot[i].setAvailability(true);
                // set the end time of the parking
                MarkTime time=new MarkTime();
                slot[i].setEndTime(time.getTime());
                return i+1;
            }


        }
        // if the id not found
        System.out.println("Invalid Parking ID !!");
        return  -1;
    }
}
