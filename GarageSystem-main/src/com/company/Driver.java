package com.company;

// class driver is the owner of the vehicle to park in or out of the garage
public class Driver {

// this is the id that the driver takes from the garage system when park in and give it to the system to park out
    private int parkingID;
     Vehicle vehicle =new Vehicle(); // this is the driver car that want to park it on or out

    // default constructor
    public Driver() {
        this.parkingID = -1;
    }
    // setter for the parking id
    public void setParkingID(int pID) {
        this.parkingID = pID;
    }
}
