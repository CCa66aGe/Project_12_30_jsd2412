package homework.homework_h.c01.ooDay03;

public class Dog extends Animal implements Swim {
    Dog() {
    }
    Dog(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"狗在吃...");
    }
    public void swim(){
        System.out.println(name+"狗在游泳...");
    }
    void lookHome(){
        System.out.println(name+"狗在看家...");
    }
}
