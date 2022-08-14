package com.company;

import java.util.Scanner;

public class Main {

    //display code start from here
    public static void main(String[] args) {
        System.out.println("Welcome to Our Garage Program!");
        System.out.println("----------------------------------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter number of Slots: ");
        int numOfSlots = sc.nextInt();
        while (numOfSlots<=0)
        {
            System.out.println("Invalid Input!!\nPlease Enter Again:");
            numOfSlots = sc.nextInt();
        }

        System.out.println();
        Garage garage = new Garage();
        garage.setSize(numOfSlots);
        // to set all slots of the garage
        garage.setAllSlots();
        System.out.println("----------------------------------------------");
        System.out.println("Please Enter Configuration: \n- 1 For Choose 'first come first served slots'\n- 2 For Choose 'best-fit approach '");
        int chooseConf = sc.nextInt();
        Configuration configuration = null;
        while (chooseConf > 2 || chooseConf < 1) {
            System.out.println("Invalid\n Please Enter your Choice Again:");
            chooseConf = sc.nextInt();
        }
        if (chooseConf == 1)
            configuration = new FirstSlot();
        else
            configuration = new BestSlot();
        //// setConfiguration
        ConfigurationChoice configurationChoice =new ConfigurationChoice();
        configurationChoice.setConfiguration(chooseConf,configuration);

        TouchScreen screen ;
        while (true)
        {
            System.out.println("""
                    Choose: 1.To park-in
                    Choose: 2.To Park-out
                    Choose else To Exit""");
            int choose=sc.nextInt();
            System.out.println("----------------------------------------");

           if(choose==1)
           {
               screen = new ParkingIn();
               // touch button park in
               screen.touch();
               Driver driver=new Driver();
               // driver set all the info of his vehicle
               driver.vehicle.setVehicleInfo();
               System.out.println("----------------------------------------");
               ParkIn inPark =new ParkIn();
               // park in and get the id of slot
               int parkingId =inPark.parkInSlot(configuration,garage.getSlots(),driver.vehicle.getDepth(),driver.vehicle.getWidth());
               // set the parking id in the slot
               driver.setParkingID(parkingId);
           }
           else if(choose==2)
           {
               screen = new ParkingOut();
               // touch button park out
               screen.touch();
               System.out.println("Enter Parking ID:");
               int id=sc.nextInt();

               ParkOut outPark =new ParkOut();
               // Park out if the id is found
               int found =outPark.parkOut(id, garage.getSlots());
                if(found>0 ) {
                    // get the slot then the start and end time to calculate the fees then add it to the total income
                    Slot parkSlot = garage.getSlot(id - 1);
                    CalculateFees fees = new CalculateFees(parkSlot.getStartTime(),parkSlot.getEndTime());
                    fees.calculateTotalTime();
                   garage.totalIncome.addIncome(fees.displayFees());
                }
                System.out.println("---------------------------------------------");
           }
           else
                break;
        }
        System.out.println("----------------------------------------");

    }
}
