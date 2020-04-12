package com.mohan.javasample.abstractionconcept;

/**
 * Created by s726337 on 06/08/2017.
 */
public class PersonNeedLoan {

    public static void main(String[] args){

        String loanType="Bike";
        //needLoan(loanType);
    }

    public  void needLoan(String loanType){

        //Loan loan = null;
        if(loanType.equals("Bike")){
            Loan  loan = new BikeLoan();

        }else if(loanType.equals("Home")){
            Loan loan = new HomeLoan();
        }

        //System.out.println("Documents for "+loanType+" :: "+loan.documentRequired());
    }
}
