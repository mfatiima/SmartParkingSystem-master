package com.example.ehsan.safeparking;

/**
 * Created by Mahnoor Fatima on 4/7/2018.
 */

public class Payment {
    private int PaymentID;
    private float AmountPaid;
    private int CVC;
    private String CardNumber;
    private int ExpireMonth;
    private int ExpireYear;
    private String TimeDate;
    private boolean isCard;

    Payment() {}

    //getter functions
    int getPaymentID() {
        return PaymentID;
    }
    float getAmountPaid() {
        return AmountPaid;
    }
    int getCVC() {
        return CVC;
    }
    String getCardNumber() {
        return CardNumber;
    }
    int getExpireMonth() {
        return ExpireMonth;
    }
    int getExpireYear() {
        return ExpireYear;
    }
    String getTimeDate() {
        return TimeDate;
    }
    boolean getisCard() {
        return isCard;
    }

    //setter functions
    void setPaymentID(int e) {
        PaymentID = e;
    }
    void setAmountPaid(float e) {
        AmountPaid = e;
    }
    void setCVC(int e) {
        CVC = e;
    }
    void setCardNumber(String e) {
        CardNumber = e;
    }
    void setExpireMonth(int e) {
        ExpireMonth = e;
    }
    void setExpireYear(int e) {
        ExpireYear = e;
    }
    void setTimeDate(String e) {
        TimeDate = e;
    }
    void setisCard(boolean e) {
        isCard = e;
    }
}
