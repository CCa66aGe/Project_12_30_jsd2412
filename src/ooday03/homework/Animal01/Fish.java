package ooday03.homework.Animal01;

public class Fish extends Animal implements Swim{
    Fish() {
    }
    Fish(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"鱼在吃...");
    }
    public void swim(){
        System.out.println(name+"鱼在游泳...");
    }
}
