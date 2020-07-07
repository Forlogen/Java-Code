package Final;

/**
 * 当成员变量被final关键字修饰，变量照样不可变
 * 1. 由于成员变量具有默认值，所以使用了final之后必须手动赋值，不会再给默认值
 * 2. 对于被final修饰的成员变量，要么使用直接赋值，要么通过构造方法进行赋值，二者选其一
 * 3. 必须保证类中所有的重载的构造方法都最终会对final的成员变量进行赋值
 */
public class Person {
    final int ID;

    public Person() {
        ID = 10;
    }

    public Person(int ID) {
        this.ID = ID;
    }

    /**
     * 当final关键字用来修饰一个方法的时候，这个方法就是最终方法，无法被覆盖重写。格式：
     * 修饰符 final 返回值类型 方法名称（参数列表）{
     *     ...
     * }
     * 对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
     */
//    public final void showInfo(){
    public void showInfo(){
        System.out.println("person class...");
    }
}
