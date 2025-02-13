package homework.homework_h.c01.ooDay02;

public class Test {
    public static void main(String[] args) {
        Student ll = new Student("李林",11,"巴黎","二年级",3);
        ll.study();
        ll.sayHi();
        ll.eat();
        ll.sleep();

        Teacher lx = new Teacher("理想",23,"奥迪",22.0);
        lx.eat();
        lx.sleep();
        lx.teach();
        lx.sayHi();

        Doctor ys = new Doctor("医生",32,"奥迪","主治医师");
        ys.eat();
        ys.sleep();
        ys.sayHi();
        ys.cut();
    }
}
