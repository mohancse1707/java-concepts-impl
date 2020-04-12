package com.mohan.javasample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExample {



    public static void main (String args[] ){


        List<StringList> list = new ArrayList<StringList>();

        StringList obj = new StringList();
        String str;
        int fname;
        str = "Foolish boy.";
        fname = str.indexOf("fool");
        obj.setA(1);
        obj.setName("Mohan");

        list.add(obj);

        System.out.println("test" + fname);


        String test = new String("TEST");

        test = new String("Modified");

        System.out.println("test Value" + test);


        String number="S330556 ";

        System.out.println("test Value" + number.trim());


        Random random = new Random();
        for(int i =0; i < 3; i++ ){
            System.out.println(random.ints(1, 5, 11).findFirst().getAsInt());
        }


    }

    static class StringList{
        int a;
        String name;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
