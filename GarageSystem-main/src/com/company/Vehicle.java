package com.company;

import java.util.Scanner;

// class to save the vehicle data
 public class Vehicle {
     // info of vehicle
        private double width;
        private double depth;
        private int uniqueIdentification;
        private String modelName;
        private int modelYear;

        // default constructor to initial the vehicle data
        public Vehicle() {
            this.width = 0.0;
            this.depth = 0.0;
            this.modelName = "";
            this.modelYear = 0;
            this.uniqueIdentification = 0;
        }

        // setter to set all data by the vehicle owner
        public void setVehicleInfo() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Vehicle Information: ");

            System.out.println("Please Enter Your Vehicle Model: ");
            this.modelName = sc.nextLine();

            System.out.println("Please Enter Your Vehicle Unique Identification: ");
            this.uniqueIdentification = sc.nextInt();

            System.out.println("Please Enter Your Vehicle Model Year: ");
            this.modelYear = sc.nextInt();

            System.out.println("Please Enter Your Vehicle Width: ");
            double wi = sc.nextDouble();
            while (wi<=0)
            {
                System.out.println("Invalid Input!!\nPlease Enter Again:");
                wi = sc.nextDouble();
            }
            this.width = wi;

            System.out.println("Please Enter Your Vehicle Depth: ");
            double dep = sc.nextDouble();
            while (dep<=0)
            {
                System.out.println("Invalid Input!!\nPlease Enter Again:");
                dep = sc.nextDouble();
            }
            this.depth = dep;

        }

        // the following function are getter to the vehicle data
        public double getWidth() {
            return this.width;
        }

        public double getDepth() {
            return this.depth;
        }

    }


