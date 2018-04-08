package com.example.ehsan.safeparking;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */


public class Reservation {
    private int ReservationID;
    private int StartTime;
    private int EndTime;
    private float Rating;

    Reservation() {}

    //getter functions
    int getReservationID() {
        return ReservationID;
    }
    int getStartTime() {
        return StartTime;
    }
    int getEndTime() {
        return EndTime;
    }
    float getRating() {
        return Rating;
    }

    //setter functions
    void setReservationID(int e) {
        ReservationID = e;
    }
    void setStartTime(int e) {
        StartTime = e;
    }
    void setEndTime(int e) {
        EndTime = e;
    }
    void setRatng(float e) {
        Rating = e;
    }
}
