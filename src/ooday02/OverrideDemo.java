package ooday02;

public class OverrideDemo {
    public static void main(String[] args) {
        //重写方法被调用时，看对象的类型执行方法(new谁就调谁)
        Student zg = new Student("张光",23,"廊坊","jsd2412","001");
        zg.sayHi(); //调用Student重写之后的
        Teacher ll = new Teacher("李林",35,"佳木斯",6000.0);
        ll.sayHi(); //调用Teacher重写之后的
        Doctor zl = new Doctor("赵亮",45,"山东","主治医师");
        zl.sayHi(); //调用Person中的
    }
}
