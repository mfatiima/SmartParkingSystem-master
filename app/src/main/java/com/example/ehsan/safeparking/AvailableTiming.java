package com.example.ehsan.safeparking;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class AvailableTiming {
    private int TimeID;
    private int StartTime;
    private int EndTime;
    private String Day;

    AvailableTiming() {}

    //getter functions
    int getTimeID() {
        return TimeID;
    }
    int getStartTime() {
        return StartTime;
    }
    int getEndTime() {
        return EndTime;
    }
    String getDay() {
        return Day;
    }

    //setter functions
    void setTimeID(int e) {
        TimeID = e;
    }
    void setStartTime(int e) {
        StartTime = e;
    }
    void setEndTime(int e) {
        EndTime = e;
    }
    void setDay(String e) {
        Day = e;
    }


}
