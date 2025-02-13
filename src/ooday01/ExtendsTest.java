package ooday01;

public class ExtendsTest {
    public static void main(String[] args) {
        Student zg = new Student();
        zg.name = "张光";
        zg.age = 23;
        zg.address = "廊坊";
        zg.className = "jsd2412";
        zg.stuId = "001";
        zg.eat();
        zg.sleep();
        zg.sayHi();
        zg.study();

        Student ll = new Student("李林",22,"佳木斯","jsd2412","002");
        ll.eat();
        ll.sleep();
        ll.sayHi();
        ll.study();

        Teacher zl = new Teacher("赵亮",36,"山东",6000.0);
        zl.eat();
        zl.sleep();
        zl.sayHi();
        zl.teach();

        Doctor wpf = new Doctor("王鹏飞",45,"山西","主任医师");
        wpf.eat();
        wpf.sleep();
        wpf.sayHi();
        wpf.cut();

        //演示超类不能访问派生类
        Person p = new Person();
        p.name = "人";
        p.age = 1;
        p.address = "未知";
        p.eat();
        p.sleep();
        p.sayHi();
//        p.stuId = "005"; //编译错误，超类不能访问派生类


    }
}
