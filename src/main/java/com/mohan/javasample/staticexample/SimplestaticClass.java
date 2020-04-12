package com.mohan.javasample.staticexample;

/**
 * Created by s726337 on 12/06/2017.
 */
public class SimplestaticClass {
    void instanceHello() {
        System.out.println("Hello from the instance.");
    }

    public static void main(String[] argv){
        // The main method is defined even though there are no instances

        //instanceHello();  // but this is a syntax error; non static method can not be referenced from static context
        SimplestaticClass h = new SimplestaticClass();
        h.instanceHello();  // this isn't though

    }
}
