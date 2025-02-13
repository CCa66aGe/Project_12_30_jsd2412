package ooday01.homework;

public class Doctor extends Person{
    String title;

    Doctor() {}

    public Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }
    void cut(){
        System.out.println(name+"在做手术");
    }
}
