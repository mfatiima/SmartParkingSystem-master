package com.example.ehsan.safeparking;

/**
 * Created by ehsan on 28-03-2018.
 */

public class Complaint {
    private String Sender;

    public String getSender() {
        return Sender;
    }

    public String getComplaint() {
        return Complaint;
    }

    public String getResponse() {
        return Response;
    }

    public boolean isResponded() {
        return responded;
    }

    private String Complaint;
    private String Response;

    public void setResponse(String response) {
        Response = response;
        responded=true;
    }

    boolean responded;
    Complaint(String sender,String Complaint)
    {
        this.Sender=sender;
        this.Complaint=Complaint;
        responded=false;
    }
}
