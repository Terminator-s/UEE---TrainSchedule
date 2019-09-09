package com.example.trainapp;

public class History {

    protected String startStation;
    protected String endStation;
    protected String timestamp;


    public String getStartStation() {
        return startStation;
    }

    public History(String startStation, String endStation, String timestamp) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.timestamp = timestamp;
    }

}
