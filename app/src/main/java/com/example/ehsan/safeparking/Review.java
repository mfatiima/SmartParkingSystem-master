package com.example.ehsan.safeparking;

import com.example.ehsan.safeparking.User;
/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class Review {
    private int ReviewID;
    private User user;
    private String ReviewContent;

    Review() {}

    //getter functions
    int getReviewID() {
        return ReviewID;
    }
    User getuser() {
        return this.user;
    }
    String getReviewContent() {
        return ReviewContent;
    }

    //setter functions
    void setReviewID(int e) {
        ReviewID = e;
    }
    void setuser(User e) {
        user = e;
    }
    void setReviewContent(String e) {
        ReviewContent = e;
    }
}
