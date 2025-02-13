package exception;

/**
 * 请分别说明 `final`、`finally`、`finalize` 是什么？
 *
 * `finalize` 是 `Object` 定义的一个方法
 *
 * 当 GC 扫描发现一个对象不在被引用时，会将其释放，释放前会调用该方法。
 * 该方法是一个对象生命周期中的最后一个方法，调用完毕后该对象就会被 GC 清除
 * （`Java`手册中有明确规定，该方法重写时不能有耗时操作，例如死循环）
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(
                test("0")+","+test(null)+","+test("")
        );
        //输出结果是：0，1，2（没有finally） | 3，3，3（有finally）
    }
    public static int test(String str){

        try {
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
