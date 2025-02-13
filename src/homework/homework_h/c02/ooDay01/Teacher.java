package homework.homework_h.c02.ooDay01;

public class Teacher extends Person {
    double salary;

    Teacher() {}

    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"在上课");
    }
}
