package reflect;

import java.lang.reflect.Field;

/**
 * 反射机制访问类的属性
 *
 * 这样的操作使用较少了，因此我们通常都是使用属性的 get，set 方法来操作属性
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        t.name="张三";
        System.out.println(t);

        Class cls = Class.forName("reflect.Teacher");
        Object obj = cls.newInstance();

        /*
            Class 提供的方法：
            Field getField(String fieldName)
            根据属性的名字获取该属性，返回值为 一个 Field 类型的对象
            Field 是属性对象，它的每一个实例用于表示一个类中的一个属性，反射对象之一
         */

        Field field = cls.getField("name");
        //为属性赋值
        field.set(obj,"李四"); //obj.name="李四";
        System.out.println(obj);

        //获取属性值
        System.out.println(field.get(obj));
    }
}
