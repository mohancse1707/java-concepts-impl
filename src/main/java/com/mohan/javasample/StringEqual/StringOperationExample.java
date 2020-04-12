package com.mohan.javasample.StringEqual;

/**
 * Created by s726337 on 08/08/2017.
 */
public class StringOperationExample {

    public static void main(String args[]){
        String s1 = "abc";
        String s2 = new String ("abc");
        String s3 = "abc";
        String s4 = new String ("abc");
        String s5 = new String ("abc").intern ();

        System.out.println ("--comparing s1--");
        System.out.println (s1==s2); //false
        System.out.println (s1==s3); //true
        System.out.println (s1==s4); //false
        System.out.println (s1==s5); //true

        System.out.println ("--comparing s2--");
        System.out.println (s2==s3); //false
        System.out.println (s2==s4); //false
        System.out.println (s2==s5); //false

        System.out.println ("--comparing s3--");
        System.out.println (s3==s4); //false
        System.out.println (s3==s5); //true

        System.out.println ("--comparing s4--");
        System.out.println (s4==s5); //false



        // why String is Immutable ?

        String str = "knowledge";
        System.out.println("str= "+ str);
        System.out.println(str.hashCode());
        String s = str;
        System.out.println(s.hashCode());
        System.out.println("S= "+s);

        str = str.concat(" base");
        System.out.println("str.concat = " + str);
        System.out.println(str.hashCode());



    }

    void test(){

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";
        String s4 = "abc";
        String s5 = "abc";

        s5 = s5 + "defg"; // s5 will be "abcdefg"
    }
}
