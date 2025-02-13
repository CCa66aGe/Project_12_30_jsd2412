package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0||age>100){
            //throw 和 return 一样都会结束方法
//            throw new RuntimeException("年龄不合法"); //运行时异常
            //除了RuntimeException之外的其他异常，如果throw抛出，则必须在方法上使用throws声明该异常的抛出
//            throw new Exception("年龄不合法");

            throw new IllegalAgeException("年龄超出了范围（0-100）："+age);
        }
        this.age = age;
    }
}
