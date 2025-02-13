package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * java 提供的一些注解：
 * @Targte 注解，用于标注我们定义的注解可以被应用在哪些位置
 *      具体的位置由 ElementType 定义，常见的位置：
 *      ElementType.TYPE ：当前注解可以被应用在类上，接口上
 *      ElementType.METHOD ：当前注解可以被应用在方法上
 *      ElementType.CONSTRUCTOR ：当前注解可以被应用在构造器上
 *      ElementType.FIELD ：当前注解可以被应用在属性上
 *
 * @Retention 注解，指定我们定义的注解的保留级别
 *      有三个可选值：
 *      RetentionPolicy.SOURCE：注解仅保留在源代码中，译成字节码文件后就舍弃了
 *      RetentionPolicy.CLASS：保留在字节码文件中，但是 JVM 加载该类到 JVM 内部后被舍弃（默认值）
 *      RetentionPolicy.RUNTIME：保留在运行时，JVM 加载该类后依然保留，可被反射机制访问
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//如果希望在多个地方可用，以数组形式指定即可
//@Target({ElementType.TYPE,ElementType.METHOD})
public @interface AutoRunClass {
}

