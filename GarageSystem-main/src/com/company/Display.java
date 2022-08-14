package com.company;

public class Display
{
    public void display(Slot [ ] slots)
    {
        System.out.println("Available Slots:");
        for (int i = 0; i < slots.length; i++) {
            if(slots[i].getAvailability())
                System.out.println("Slot "+slots[i].getParkingID()+" iS Available");
        }
        System.out.println();
    }
}

