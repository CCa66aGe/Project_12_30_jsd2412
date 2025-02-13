package ooday03.homework.Animal03;

public class Fish extends Animal implements Swim{
    public Fish() {
    }

    public Fish(String name, String age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"鱼吃.");
    }
    public void swim(){
        System.out.println(name+"鱼游泳.");
    }
}
