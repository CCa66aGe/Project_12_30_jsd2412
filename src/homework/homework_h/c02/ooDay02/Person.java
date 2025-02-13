package homework.homework_h.c02.ooDay02;

public class Person {
    String name;
    int age;
    String address;

    Person(){}
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"在吃");
    }
    void sleep(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"在睡觉");
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"在说你好");

    }
}
