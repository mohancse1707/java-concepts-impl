package com.mohan.javasample.hashcheck;

import java.util.Objects;

public class HashMapExample {

    public static void main(String args[]){

        SampleClass obj1 = new SampleClass();
        obj1.setNumber(23);


        SampleClass obj2 = new SampleClass();
        obj2.setNumber(23);

    }


}

class SampleClass {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleClass that = (SampleClass) o;
        return number == that.number;
    }


    @Override
    public int hashCode() {

        return Objects.hash(number);
    }
}
