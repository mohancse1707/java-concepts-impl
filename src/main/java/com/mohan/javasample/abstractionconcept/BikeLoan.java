package com.mohan.javasample.abstractionconcept;

/**
 * Created by s726337 on 06/08/2017.
 */
public class BikeLoan implements Loan {

    public long loanAmount() {
        return 500;
    }

    public String documentRequired() {
        return "Bike RC Book";
    }
}
