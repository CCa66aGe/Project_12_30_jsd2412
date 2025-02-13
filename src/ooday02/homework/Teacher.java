package ooday02.homework;

public class Teacher extends Person{
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary=salary;
    }
    void teach(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"工资是"+salary+"的老师在上课");
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"工资是"+salary+"的老师在说你好");
    }
}
