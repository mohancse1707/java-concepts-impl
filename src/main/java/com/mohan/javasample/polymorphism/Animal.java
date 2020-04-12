package com.mohan.javasample.polymorphism;

class Animal {
    public static void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal{
    public static void eat() {
        System.out.println("Dog Eating");
    }
}

class LosePolymorphismConcept {
    public static void main(String args[]) {
       Animal obj= new Dog();//Dog object in animal
       obj.eat(); //should call dog's eat but it didn't
    }
}