package com.mohan.javasample.abstractionconcept;

/**
 * Created by s726337 on 06/08/2017.
 */
public class HomeLoan implements Loan {
    public long loanAmount() {
        return 50000;
    }

    public String documentRequired() {
        return "Land registration proof";
    }

    public static void main(String[] args) {
        PersonNeedLoan personNeedLoan = new PersonalLoan();
        personNeedLoan.needLoan("");
       // PersonalLoan personalLoan = new PersonNeedLoan();
    }
}

