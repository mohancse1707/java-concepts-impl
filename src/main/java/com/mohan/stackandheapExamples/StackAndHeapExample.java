package com.mohan.stackandheapExamples;

public class StackAndHeapExample {

    public static void main(String args[]) {
        A parent = new A();
    }

    static class A {
        B child = new B();
        int e;
    }

    static class B {
        int c;
        int d;
    }

    public void m1() {
        int x = 20;
        m2(10);
        m3();
    }

    public void m2(int b) {
        boolean c;
    }

    public void m3() {
        Account ref = new Account();
    }

    class Account {
        int p;
        int q;
    }
}

