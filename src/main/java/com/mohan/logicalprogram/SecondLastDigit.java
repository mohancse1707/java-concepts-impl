/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.logicalprogram;

public class SecondLastDigit {
    public static void main(String[] args) {

        int n = 98562;
        System.out.println(((n/10%10)));
        System.out.print(Math.abs((n%100)/10));
    }
}
