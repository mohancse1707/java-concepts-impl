package com.mohan.javasample.abstractionconcept;

/**
 * Created by s726337 on 06/08/2017.
 */
public interface Loan {

    long loanAmount();
    String documentRequired();

    default void test(){

    }
}
