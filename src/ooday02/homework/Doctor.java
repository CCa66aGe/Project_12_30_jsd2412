package ooday02.homework;

public class Doctor extends Person{
    String title;
    Doctor(){}
    Doctor(String name,int age,String address,String title){
        super(name,age,address);
        this.title=title;
    }
    void cut(){
        System.out.println("名字叫"+name+"年龄是"+age+"家住"+address+"部门是"+title+"的医生在做手术");
    }
}
