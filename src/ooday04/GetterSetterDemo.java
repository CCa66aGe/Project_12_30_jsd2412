package ooday04;

/**
 * getter/setter的测试类
 */
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(100);
        p.setY(200);
        System.out.println(p.getX()+","+p.getY());
    }
}
