package Final;

/**
 * 当final关键字用来修饰一个类时，格式：
 * public final class 类名称{
 *     ...
 * }
 * 当前类不能有子类
 * 一个类如果被final修饰，那么其中的所有成员方法都无法进行覆盖重写
 */
public final class FinalClass {
    public void show(){
        System.out.println("final class...");
    }

}
