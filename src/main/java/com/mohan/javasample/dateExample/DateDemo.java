package com.mohan.javasample.dateExample;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        // create 2 dates
        Date releaseDate = new Date(15, 1, 21);
        Date allocateDate = new Date(16, 1, 21);

        // tests if date 2 is before date and print
        boolean before = allocateDate.after(releaseDate);
        System.out.println("Date 2 is before date: " + before);

        // tests if date is before date 2 and print
        before = releaseDate.after(allocateDate);
        System.out.println("Date is before date 2: " + before);
    }
}
