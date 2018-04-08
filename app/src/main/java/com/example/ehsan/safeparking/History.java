package com.example.ehsan.safeparking;

import com.example.ehsan.safeparking.User;
import com.example.ehsan.safeparking.Payment;
import com.example.ehsan.safeparking.Reservation;
/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class History {
    private int HistoryID;
    private Payment payment;
    private Reservation reservation;
    private User user;

    //getter functions
    int getHistoryID() {
        return HistoryID;
    }
    Payment getPayment() {
        return payment;
    }
    Reservation getReservation() {
        return reservation;
    }
    User getuser() {
        return user;
    }

    //setter functions
    void setHistoryID(int e) {
        HistoryID = e;
    }
    void setPayment(Payment e) {
        payment = e;
    }
    void setReservation(Reservation e) {
        reservation = e;
    }
    void setuser(User e) {
        user = e;
    }

}
