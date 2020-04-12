package com.mohan.javasample.calendarExample;

import java.util.Calendar;

/**
 * Created by s726337 on 03/08/2017.
 */
public class DateBetwheenTwoDates {

   public static void main(String args[]){

       int printdate=10;
       Calendar start = Calendar.getInstance();
       start.set(2017,00,01);
       //00 - Jan , 01 - Feb, 02 - Mar, .... 11-December
       Calendar end = Calendar.getInstance();
       end.set(2017,00,31);

       System.out.println("Stard Date"+start.getTime());
       System.out.println("End Date "+ end.getTime());

       //print any one date
       if(start.getTime().before(end.getTime())){
           start.add(Calendar.DATE, printdate);
            System.out.println(printdate+"TH Date" +start.getTime());
       }


       // To print All dates between two date; looping
       while(start.getTime().before(end.getTime())){
           start.add(Calendar.DATE, 1); // adding 1 date from start
           System.out.println("All dates" +start.getTime());
       }
   }
}
