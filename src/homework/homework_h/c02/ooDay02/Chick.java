package homework.homework_h.c02.ooDay02;

public class Chick extends Animal {
    public Chick() {
    }

    public Chick(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"鸡吃");
    }
    void layEggs(){
        System.out.println(name+"鸡下蛋");
    }
}
