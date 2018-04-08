package com.example.ehsan.safeparking;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class ParkingPlace {
    private int AreaID;
    private String Category;
    private String AreaLocation;
    private String AreaName;
    private String Picture;
    private int Slots;

    ParkingPlace() {}

    //getter functions
    int getAreaID() {
        return AreaID;
    }
    String getCategory() {
        return Category;
    }
    String getAreaLocation() {
        return AreaLocation;
    }
    String getAreaName() {
        return AreaName;
    }
    String getPicture() {
        return Picture;
    }
    int getSlots() {
        return Slots;
    }

    //setter functions
    void setAreaID(int e) {
        AreaID = e;
    }
    void setCategory(String e) {
        Category = e;
    }
    void setAreaLocation(String e) {
        AreaLocation = e;
    }
    void setAreaName(String e) {
        AreaName = e;
    }
    void setPicture(String e) {
        Picture = e;
    }
    void setSlots(int e) {
        Slots = e;
    }


}
