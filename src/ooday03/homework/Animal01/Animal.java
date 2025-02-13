package ooday03.homework.Animal01;

abstract public class Animal {
    String name;
    int age;
    String color;
    Animal(){
    }
    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    abstract void eat();
    void drink(){
        System.out.println(name+"在喝水...");
    }
}
