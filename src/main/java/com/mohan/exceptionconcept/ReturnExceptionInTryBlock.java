/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.exceptionconcept;

public class ReturnExceptionInTryBlock {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String returnVal = method1();
        System.out.println(returnVal);
    }

    public static String method1() throws Exception {
        try {
            int i = 9 / 0;
            System.out.println(i);
            return "from try";
        } catch (Exception e) {
            System.out.println("exception caught");
            throw new Exception("EX");
            //return "from catch";
        } finally {
            System.out.println("finally block executing");
            //return  "Final";
        }

    }
}
