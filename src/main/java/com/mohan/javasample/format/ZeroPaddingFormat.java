package com.mohan.javasample.format;

public class ZeroPaddingFormat {

    public static void main(String args []){

        String number = "1";

        String zeroPadding = String.format("%04d", number);
        System.out.println(zeroPadding);
    }
}
