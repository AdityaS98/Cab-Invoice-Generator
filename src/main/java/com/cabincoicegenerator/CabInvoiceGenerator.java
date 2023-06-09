package com.cabincoicegenerator;

public class CabInvoiceGenerator {

    public static final double COST_PER_KM = 10.0;
    public static final double COST_PER_MIN = 1.0;
    public static final double MIN_FARE = 5;

    public double calculateFare(double distance , int time){
        double totalFare = (distance * COST_PER_KM) + (time * COST_PER_MIN);
        if(totalFare < 5){
            return MIN_FARE;
        }
        return totalFare;
    }


}
