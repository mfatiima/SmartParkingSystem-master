package com.example.ehsan.safeparking;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class User {

    private String CNIC;
    private String EmailID;
    private String Name;
    private String Password;
    private String Phone;
    private String Picture;
    private float Rating;
    private int UserID;
    private boolean isAdmin;
    private String LocationName;
    private float Loc_Latitude;
    private float Loc_longitude;

    User() {}

    //getter functions
    String getCNIC() {
        return CNIC;
    }
    String getEmailID() {
        return EmailID;
    }
    String getUsername() {
        return Name;
    }
    String getPassword() {
        return Password;
    }
    String getPhone() {
        return Phone;
    }
    String getPicture() {
        return Picture;
    }
    float getRating() {
        return Rating;
    }
    int getUserID() {
        return UserID;
    }
    boolean getisAdmin() {
        return isAdmin;
    }
    String getLocationName() {
        return LocationName;
    }
    float getLoc_Longitude() {
        return Loc_longitude;
    }
    float getLoc_Latitude() {
        return Loc_Latitude;
    }

    //setter functions
    void setCNIC(String e) {
        CNIC = e;
    }
    void setEmailID(String e) {
        EmailID = e;
    }
    void setUsername(String e) {
        Name = e;
    }
    void setPassword(String e) {
        Password = e;
    }
    void setPhone(String e) {
        Phone = e;
    }
    void setPicture(String e) {
        Picture = e;
    }
    void setRating(float e) {
        Rating = e;
    }
    void setUserID(int e) {
        UserID = e;
    }
    void setisAdmin(boolean e) {
        isAdmin = e;
    }
    void setLocationName(String e) {
        LocationName = e;
    }
    void setLoc_longitude(float e) {
        Loc_longitude = e;
    }
    void setLoc_Latitude(float e) {
        Loc_Latitude = e;
    }



}
