package com.mohan.interfaceExamples;

public class DefaultMethodInInterface implements InterfaceA, InterfaceB {
    @Override
    public void test() {

    }

    @Override
    public void defaultMethod() {

        InterfaceA.super.defaultMethod();
    }

    public static void main(String[] args) {
        System.out.println(f);
        System.out.println(d);

    }
}
