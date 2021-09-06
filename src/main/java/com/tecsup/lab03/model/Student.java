package com.tecsup.lab03.model;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("El nombre del estudiante es "+ this.name+ " y su edad es " + this.age);
    }
}
