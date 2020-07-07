package Interfaces;

/**
 * 接口中可以包含的内容：常量、抽象方法、默认方法、静态方法私有方法
 * 接口定义：public interface 接口名称{}
 * 使用接口的程序编译流程：.java ----> .class
 * 接口中可以包含的内容：常量、抽象方法、默认方法、静态方法私有方法
 *
 * 接口使用：
 * 1. 接口不能直接使用，必须有一个实现类实现接口
 * 格式：
 * public class 实现类名称implements 接口名称{
 *     ...
 * }
 * 2. 接口的实现类必须覆盖重写接口中所有的抽象方法
 * 3. 创建实现类的对象，进行使用
 * 4. 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就是抽象类
 *
 * 默认方法定义：
 * public default 返回值类型 方法名称(参数列表){
 *     ...
 * }
 * 作用：解决接口升级问题：在接口中添加方法而不用在实现类中修改
 * 可以通过接口实现类对象直接调用，也可以被实现类覆盖重写
 *
 * 静态方法：
 * 格式：public static 返回值类型 方法名称(参数列表){
 *     ...
 * }
 * 通过接口名称直接调用
 *
 * 私有方法(Java9之后的版本支持)
 * 1. 普通私有方法：解决多个默认方法之间重复代码的问题
 * 格式：
 * private 返回值类型 方法名称(参数列表){
 *     ...
 * }
 * 2. 静态私有方法：解决多个静态方法之间的重复代码问题
 * 格式：
 * private static 返回值类型 方法名称(参数列表){
 *     ...
 * }
 *
 * 成员变量：必须使用public static final三个关键字修饰
 * 从效果上看就是接口的常量
 * 格式：
 * public static final 数据类型 常量名称 = 数据值
 * final: 一旦赋值不可改变！
 * NOTE:
 * 1. 接口中的常量可以省略public static final
 * 2. 接口中的常量必须进行赋值，不能不赋值
 * 3. 接口中常量的名称使用完全大写的字母，用下划线进行分隔
 */
public interface InterfaceAbs {

    // 成员变量
    public static final int NUMBER = 10;

    // 抽象方法，接口中抽象方法的关键字必须是 public abstract，可选择性省略
    public abstract void methodAbs();

    // 默认方法
    public default void defaultMethod(){
        System.out.println("Interface default method...");
    }

    // 静态方法
    public static void methodStatic(){
        System.out.println("static method...");
    }

    // 私有方法
    // private void methodPrivate(){}
    // private static void methodStaticPrivate(){}
}
