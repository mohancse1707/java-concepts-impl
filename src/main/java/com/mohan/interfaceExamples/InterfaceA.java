package com.mohan.interfaceExamples;

@FunctionalInterface
public interface InterfaceA {

    float f = 1.3f;
    double d = 2.3;
    void test();
        default void defaultMethod(){
            System.out.println("Interface A default method");
        }
}

