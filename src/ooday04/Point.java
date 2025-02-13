package ooday04;
/**
 * 标准JavaBean的规范:
 * 1.成员变量私有，同时提供对应的公开的getter/setter
 * 2.包含公开的无参构造方法
 */
public class Point { //点
    private int x;
    private int y;

    public Point(){
    }


    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}
