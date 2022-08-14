package com.company;

public class ParkIn {
    public int parkInSlot(Configuration Configuration_,Slot[] slots,double depth,double width)
    {
        // know if there is  available slot to park in it according to configuration
        int availableSlot=Configuration_.searchForSlot(slots,depth,width);
        // if no available print that to the user
        if(availableSlot==-1)System.out.println("Oops, No Slot Available Now.");
        else
        {
            // set the availability by false
            slots[availableSlot].setAvailability(false);
            //set start time at slot
            MarkTime time=new MarkTime();
            slots[availableSlot].setStartTime(time.time);
            //print the id
            System.out.println("You Park Slot With ID "+(availableSlot+1));

        }
        return availableSlot;
    }
}
