package ooday03.homework.Animal02;

public class Fish extends Animal implements Swim{
    public Fish() {
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }
    public void swim(){
        System.out.println(color+"颜色的鱼"+name+"在游泳");
    }
    void eat(){
        System.out.println(color+"颜色的鱼"+name+"在吃饭");
    }
}
