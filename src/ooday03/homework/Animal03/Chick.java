package ooday03.homework.Animal03;

public class Chick extends Animal{
    public Chick() {
    }

    public Chick(String name, String age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"鸡吃.");
    }
    void layEggs(){
        System.out.println(name+"鸡下蛋.");
    }
}
