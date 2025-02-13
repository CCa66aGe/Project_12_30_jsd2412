package homework.homework_h.c02.ooDay01;

public class Doctor extends Person {
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
