package ooday03.homework.Animal02;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void swim(){
        System.out.println(color+"颜色的狗"+name+"在游泳");
    }
    void eat(){
        System.out.println(color+"颜色的狗"+name+"在吃饭");
    }
    void lookHome(){
        System.out.println(color+"颜色的狗"+name+"在看家");
    }
}
