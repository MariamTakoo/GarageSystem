package com.company;

public class CalculateTotalIncome {
    private long total;

    public CalculateTotalIncome()
    {
        total=0;
    }
    public void addIncome(long income)
    {
        this.total+=income;
    }
    public long displayTotalIncome()
    {
        System.out.println("Total Income: "+total+" LE");
        return total;
    }

}
