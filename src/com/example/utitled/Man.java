package com.example.utitled;

public class Man {
    private double height;
    private int age;
    private String name;
    private String hair_color;

    public Man(){
        this.height = 1.73;
        this.age = 21;
        this.name = "Or Berman";
        this.hair_color = "Brown";
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
}
