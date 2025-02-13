package homework.homework_h.c02.ooDay01;

public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat(){
        System.out.println(name+"在吃");
    }
    void sleep(){
        System.out.println(name+"在睡");
    }
    void sayHi(){
        System.out.println(name+"在说你好");
    }
}
