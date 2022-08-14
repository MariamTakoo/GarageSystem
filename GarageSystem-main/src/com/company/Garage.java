package com.company;

import java.util.Scanner;

public class Garage {

    private int numberOfSlots;
    private Slot[] slots;

    CalculateTotalIncome totalIncome =new CalculateTotalIncome(); // to calculate the total income
    private  static volatile Garage instance; // to get only one instance of the garage class
    public static Garage getInstance()
    {
        if (instance==null)
        {
            synchronized (Garage.class){
                if (instance==null)
                {
                    instance=new Garage();
                }
            }

        }
        return instance;
    }
    // get slot
    public Slot getSlot(int index)
    {
        return slots[index];
    }
    //set size
    public  void setSize(int size)
    {
        this.numberOfSlots = size;
        slots=new Slot[numberOfSlots];
    }
     // get array of slots of garage
    public Slot[] getSlots() {
        return slots;
    }
    // set all info of the slots
    public void setAllSlots() {
        for (int i = 0; i < numberOfSlots; i++) {
            slots[i]=new Slot();
            System.out.println("Input slot " + (i + 1) + " width:");
            double width = new Scanner(System.in).nextDouble();
            while (width<=0)
            {
                System.out.println("Invalid Input!!\nPlease Enter Again:");
                width = new Scanner(System.in).nextDouble();
            }
            System.out.println("Input slot " + (i + 1) + " depth:");
            double depth = new Scanner(System.in).nextDouble();
            while (depth<=0)
            {
                System.out.println("Invalid Input!!\nPlease Enter Again:");
                depth = new Scanner(System.in).nextDouble();
            }
            this.slots[i].setWidth(width);
            this.slots[i].setDepth(depth);
            this.slots[i].setParkingID(i+1);
            this.slots[i].setAvailability(true);

        }
    }
}
