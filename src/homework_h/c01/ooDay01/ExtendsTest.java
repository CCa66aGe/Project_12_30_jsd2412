package homework_h.c01.ooDay01;

public class ExtendsTest {
    public static void main(String[] args) {

        Student xx = new Student("学生",12,"地球","一班",001);
        xx.eat();
        xx.sleep();
        xx.sayHi();
        xx.study();

        Teacher ls = new Teacher("老师",30,"中国",2000.0);
        ls.eat();
        ls.sleep();
        ls.sayHi();
        ls.teach();

        Doctor ys = new Doctor("医生",40,"河南","主治医师");
        ys.eat();
        ys.sleep();
        ys.sayHi();
        ys.cut();
    }
}
