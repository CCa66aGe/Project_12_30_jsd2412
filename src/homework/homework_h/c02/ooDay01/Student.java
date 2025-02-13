package homework.homework_h.c02.ooDay01;

public class Student extends Person {
    String className;
    int stuId;

    Student(){}

    Student(String name,int age,String address,String className,int stuId){
        super(name,age,address);
        this.className = className;
        this.stuId = stuId;
    }
    void study(){
        System.out.println(name+"在学习");
    }
}
