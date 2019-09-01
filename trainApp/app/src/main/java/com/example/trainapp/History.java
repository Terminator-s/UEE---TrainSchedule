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

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
