/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.codeTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProgramTest {


    float f = 1.3f;
    double d = 2.3;
    long l = 50;
    static char ch = 'a';
    static int x = 11;
    private int y = 33;

    private static String date = "2020-06-22T20:00:00.000Z";
    private static String format = "dd-MM-yyyy";
    public static void main(String args[]) {
        System.out.print(" " + ch);
        System.out.println(Math.log10(5000000.5)/ Math.log10(2));

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date dt = (Date)sdf.parse((String) date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dt);
            System.out.print("DATE  " + cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}