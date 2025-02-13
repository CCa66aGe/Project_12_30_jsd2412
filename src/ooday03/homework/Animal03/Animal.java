package ooday03.homework.Animal03;

abstract public class Animal {
    String name;
    String age;
    String color;
    public Animal(){
    }
    public Animal(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    abstract void eat();
    void drink(){
        System.out.println(name+"喝水.");
    }
}
