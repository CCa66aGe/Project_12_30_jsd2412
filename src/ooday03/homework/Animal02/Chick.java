package ooday03.homework.Animal02;

public class Chick extends Animal{
    public Chick() {
    }

    public Chick(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(color+"颜色的鸡"+name+"在吃饭");
    }
    void layEggs(){
        System.out.println(color+"颜色的鸡"+name+"在下蛋");
    }
}
