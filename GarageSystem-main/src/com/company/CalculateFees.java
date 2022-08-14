package com.company;

import java.util.Date;

public class CalculateFees {
    Date start, end;
    double total = 0;

    public CalculateFees(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public void calculateTotalTime() {
        long diffMin = Math.max(0, end.getMinutes() - start.getMinutes());
        long diffHou = Math.max(0, end.getHours() - start.getHours());
        long diffDay = Math.max(0, end.getYear() - start.getYear());
        total = ((diffMin / 60.0) + diffHou + (diffDay * 24));
        total = Math.ceil(total);
        total = total * 5;


    }

    public long displayFees() {
        System.out.println("The Fees: " + (long) total+" LE");

        return (long) total;

    }// to display the fees on the screen to the driver

}


