package ooday03.homework.Animal03;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, String age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println(name+"狗吃.");
    }
    public void swim(){
        System.out.println(name+"狗游泳.");
    }
    void lookHome(){
        System.out.println(name+"狗看家.");
    }
}
