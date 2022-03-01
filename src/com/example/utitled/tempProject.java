package com.example.utitled;

import java.util.Scanner;

enum Color{
    ONE, two, THREE;
}

abstract class Animal{
    protected int age;
    protected abstract void makeSound();
    public void increaseAge(){
        this.age++;
    }
    public int getAge(){
        return this.age;
    }
}

class Dog extends Animal{
    public Dog(int age){
        this.age = age;
    }
    protected void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    public Cat(int age){
        this.age = age;
    }
    public void makeSound(){
        System.out.println("mew");
    }
}



public class tempProject {
    public static double max(double a, double b){
        if (a>b) return a;
        return b;
    }

    public static void main(String[] args) {
        double x = 3;
        double y = 0;
        System.out.println(x/y);
        Dog bob = new Dog(2);
        bob.increaseAge();
        int bob_age = bob.getAge();
        System.out.println(bob_age);
        bob.makeSound();
        Man man = new Man();
        System.out.println(man.getAge());

        int a = 15;
        double b = 32;
        System.out.println(max(a, b));
    }
}
