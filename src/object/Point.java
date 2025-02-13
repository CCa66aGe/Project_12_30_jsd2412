package object;

import java.util.Objects;

/**
 * 为测试Object做准备
 */
public class Point {  //Windows:alt+insert  Mac:command+n   右键找Generate
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override   //p1.equals(p2)
    public boolean equals(Object o) { //p1重写的方法，传进来的是p2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //判断类型是否相同
        Point point = (Point) o; //把传进来的p2转型赋值给point
        return this.x == point.x && this.y == point.y;
        //       p1.x == p2.x         p1.y == p2.y
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {  //Point{x=100, y=200}
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
