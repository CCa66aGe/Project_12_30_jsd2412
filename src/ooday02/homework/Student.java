package ooday02.homework;

public class Student extends Person{
    String className;
    int StuId;
    Student(){}
    Student(String name, int age, String address, String className, int stuId) {
        super(name, age, address);
        this.className = className;
        StuId = stuId;
    }
    void study(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"的学生在学习");
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"的学生在说你好");
    }
}
