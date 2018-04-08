package com.example.ehsan.safeparking;

import com.example.ehsan.safeparking.ParkingPlace;
import com.example.ehsan.safeparking.AvailableTiming;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class ParkingSlot {
    private ParkingPlace Area;
    private AvailableTiming availableTiming;
    private String Picture;
    private int SlotID;
    private String Status;

    ParkingSlot() {}

    //getter functions
    ParkingPlace getArea() {
        return Area;
    }
    AvailableTiming getAvailableTime() {
        return availableTiming;
    }
    String getPicture() {
        return Picture;
    }
    int getSlotID() {
        return SlotID;
    }
    String getStatus() {
        return Status;
    }

    //setter functions
    void setArea(ParkingPlace e) {
        Area = e;
    }
    void setAvailableTiming(AvailableTiming e) {
        availableTiming = e;
    }
    void setPicture(String e) {
        Picture = e;
    }
    void setSlotID(int e) {
        SlotID = e;
    }
    void setStatus(String e) {
        Status = e;
    }
}
