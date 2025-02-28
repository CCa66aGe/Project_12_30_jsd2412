package homework.homework_api.day02;

import java.io.Serializable;

/**
 *  * 设计一个类:User
 *  * 里面有四个属性:String name,String pwd,String nick,int age
 *  * 定义get,set方法以及toString方法和构造方法
 */
public class User implements Serializable {
    private String name;
    private String pwd;
    private String nick;
    private int age;

    public User() {
    }

    public User(String name, String pwd, String nick, int age) {
        this.name = name;
        this.pwd = pwd;
        this.nick = nick;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
