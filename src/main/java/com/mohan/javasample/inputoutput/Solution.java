package com.mohan.javasample.inputoutput;

import java.util.Date;

/**
 * Created by s726337 on 08/01/2018.
 */
public class Solution {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        // Write your code here.
//        scan.nextLine(); //consuming the <enter> from input above
//        double d = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("enter");
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            if(x <100){
//                String test = String.format("%03d", x);
//                System.out.printf("%-15s%s\n",s1,test);
//            }else{
//                System.out.printf("%-15s%s\n",s1,x);
//            }
//
//        }
//        System.out.println("================================");

        Date ne = new Date();
        System.out.println(String.valueOf(ne));

        long round = Math.round(5.01);
        double ceil = Math.ceil(5.01);

        double floor = Math.floor(5.55);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);

    }


}
