package com.example.ehsan.safeparking;

import com.example.ehsan.safeparking.User;
/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class Vehicle {
    private int Model;
    private String PlateNo;
    private int VehicleID;
    private User user;

    Vehicle() {}

    //getter functions
    int getModel() {
        return Model;
    }
    String getPlateNo() {
        return PlateNo;
    }
    int getVehicleID() {
        return VehicleID;
    }
    User getuser() {
        return user;
    }

    //setter functions
    void setModel(int e) {
        Model = e;
    }
    void setPlateNo(String e) {
        PlateNo = e;
    }
    void setVehicleID(int e) {
        VehicleID = e;
    }
    void setuser(User e) {
        user = e;
    }

}
