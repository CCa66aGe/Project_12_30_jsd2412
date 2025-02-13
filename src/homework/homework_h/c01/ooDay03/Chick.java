package homework.homework_h.c01.ooDay03;

public class Chick extends Animal {
    Chick() {
    }
    Chick(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"鸡在吃...");
    }
    void layEggs(){
        System.out.println(name+"鸡下蛋...");
    }
}
