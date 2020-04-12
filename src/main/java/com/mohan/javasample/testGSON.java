package com.mohan.javasample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by s726337 on 29/06/2017.
 */
public class testGSON {

    public static void main(String args []){

        String matchValue="ASD ASDASD&";
        String notAllowedChar = "^[^<>&]*$";
        Pattern p = Pattern.compile(notAllowedChar);
        Matcher m = p.matcher(matchValue.toString());
        if(!m.matches()) {
            System.out.println("AMC BEAN SAVE VALIDATE MATCHES");
        }
        else {
            System.out.println("DOES NOT");
        }


//        List<String> generic = new ArrayList<String>();
//        generic.add("Mohan");
//        generic.add("Mani");
//
//        String t1 = new String("Hello");
//        String t2 = new String("Hello");
//
//        if (t1 == t2 ){
//            System.out.println("TRUE");
//        } else {
//            System.out.println("FALSE");
//        }
        //In java 1.5 collection and array elementsre iterated as below
//        for(String value:generic){
//            System.out.println("List values"+value);
//
//        }

//        List<HomeLoan> employeeList = new ArrayList<HomeLoan>();
//
//        HomeLoan home = new HomeLoan();
//        home.setName("EMp1");
//        employeeList.add(home);
//        employeeList.add(new HomeLoan());
//        employeeList.add(new HomeLoan());
//
//        for(Employee value:employeeList){
//            System.out.println("List values"+value.getName);
//
//        }





    }
}
