package com.mohan.javasample.polymorphism;
 
public class ObjectNumber {
    public static void main(String[] args) {

        //System.out.println(null);
    }
 
//    private static void printIt(Object object) {
//        System.out.println("Object method called");
//    }
     
    private static void printIt(String number) {
        System.out.println("Number method called");
    }
     
    private static void printIt(ArithmeticException arithmeticException){
        System.out.println("ArithmeticException method called");
    }
}