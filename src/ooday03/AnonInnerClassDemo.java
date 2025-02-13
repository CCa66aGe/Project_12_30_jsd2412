package ooday03;
/**
 * 匿名内部类的演示
 */
public class AnonInnerClassDemo {
    public static void main(String[] args) {
        //1)创建了Inter的一个派生类，但是没有名字
        //2)为该子类创建了一个对象，名为o1，向上造型为Inter类型
        //3)大括号中的为派生类的类体
        //  ----new Inter(){};是在创建Inter的派生类的对象
        Inter o1 = new Inter(){};

        //1)创建了Inter的一个派生类，但是没有名字
        //2)为该子类创建了一个对象，名为o2，向上造型为Inter类型
        //3)大括号中的为派生类的类体
        Inter o2 = new Inter(){};

        //1)创建了InterInter的一个派生类，但是没有名字
        //2)为该子类创建了一个对象，名为o3，向上造型为InterInter类型
        //3)大括号中的为派生类的类体
        InterInter o3 = new InterInter() {
            public void show() {
                System.out.println("showshow");
            }
        };
        o3.show();

    }
}

interface InterInter{
    void show();
}

interface Inter{
}
