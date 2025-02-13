package ooday03.homework.Animal02;

abstract public class Animal {
    String name;
    int age;
    String color;
    public Animal(){
    }
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    abstract void eat();
    void drink(){
        System.out.println(color+"颜色的"+name+"在喝水");
    }
}
