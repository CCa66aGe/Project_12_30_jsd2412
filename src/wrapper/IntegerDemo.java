package wrapper;

/**
 * 包装类的演示
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //演示包装类的定义：
        /*
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1==i2); //flase，==比较地址
        //String 、包装类默认重写了equals()来比较内容是否相等
        System.out.println(i1.equals(i2)); //true，包装类重写equals()比较值了

        //valueOf()方法会复用1个字节(-128到127)范围内的数据，建议使用valueOf()
        Integer i3 = Integer.valueOf(5); //Integer提供静态方法赋值，类名点 属于静态方法
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4)); //true，包装类重写equals()比较值了
        */

        //演示基本类型与包装类型之间互转：
        /*
        Integer i = Integer.valueOf(5); //基本类型转换为包装类型
        int j = i.intValue(); //包装类型转换为基本类型

        //触发了自动装箱特性，会被编译为：Integer m = Integer.valueOf(5);
        Integer m = 5; //基本类型到引用类型---------装
        //触发了自动拆箱特性，会被编译为：int n = m.intValue();
        int n = m; //引用类型到基本类型-------------拆
         */

        //演示包装类的常用操作：

        //1)可以通过包装类来获取基本类型的取值范围：
        int max = Integer.MAX_VALUE; //获取int的最大值
        int min = Integer.MIN_VALUE; //获取int的最小值
        System.out.println("int的最大值为："+max+"，int的最小值为："+min);
        //int的最大值为：2147483647，int的最小值为：-2147483648

        long max1 = Long.MAX_VALUE; //获取long的最大值
        long min1 = Long.MIN_VALUE; //获取long的最小值
        System.out.println("long的最大值为："+max1+"，long的最小值为："+min1);
        //long的最大值为：9223372036854775807，long的最小值为：-9223372036854775808

        //2)通过包装类可以将字符串转换为对应的基本类型:
        String s1 = "40"; //如果不是有效int运行时报错
        int age = Integer.parseInt(s1); //将字符串s1转换为int类型并赋值给age
        System.out.println(age); //40----int类型

        String s2 = "123.456";
        double price = Double.parseDouble(s2); //将字符串s2转换为double类型并赋值给price
        System.out.println(price); //123.456----double类型




    }
}
