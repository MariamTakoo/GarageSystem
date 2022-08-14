package com.company;
import java.time.LocalDateTime;
import java.util.Date;

public class MarkTime {

    Date time;
    MarkTime()
    {
        time = new Date();
    } // set the time by the date now
    public Date getTime() {
        return time;
    } // get the time
}