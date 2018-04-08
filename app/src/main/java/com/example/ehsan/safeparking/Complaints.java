package com.example.ehsan.safeparking;

import com.example.ehsan.safeparking.User;
/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class Complaints {
    private int ComplaintID;
    private User user;
    private String Category;
    private String ComplaintContent;
    private String TimeDate;

    Complaints() {}

    //getter functions
    int getComplaintID() {
        return ComplaintID;
    }
    User getuser() {
        return user;
    }
    String getCategory() {
        return Category;
    }
    String getComplaintContent() {
        return ComplaintContent;
    }
    String getTimeDate() {
        return TimeDate;
    }

    //setter functions
    void setComplaintID(int e) {
        ComplaintID = e;
    }
    void setuser(User e) {
        user = e;
    }
    void setCategory(String e) {
        Category = e;
    }
    void setComplaintContent(String e) {
        ComplaintContent = e;
    }
    void setTimeDate(String e) {
        TimeDate = e;
    }

}
