package com.mohan.interfaceExamples;

public interface InterfaceB {
        default void defaultMethod(){
            System.out.println("Interface B default method");
        }
}