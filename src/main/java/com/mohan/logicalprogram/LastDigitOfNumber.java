/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.logicalprogram;

import java.util.InputMismatchException;

 class LastDigitOfNumber {
    public final static void main(String[] args) {

        try {
            int input, lastDigit;
            System.out.println("Enter the any number");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.nextInt();
//            if(input > 9){
//                lastDigit = input % 10;
//            } else {
//                lastDigit = input;
//            }
//            System.out.println("Last digit is "+lastDigit);
            String S1 = new String ("Hello");
            System.out.println("S1 "+S1);
            System.out.println("S1 "+S1.toString());

            StringBuffer stringBuffer = new StringBuffer("HelloSB");
            stringBuffer = new StringBuffer("HSB");
            System.out.println("stringBuffer "+stringBuffer);
        } catch (InputMismatchException e) {
            System.out.println("Only Numbers Allowed");
        }

    }
}
