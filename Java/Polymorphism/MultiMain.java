package Polymorphism;
/**
 * 代码中体现多态性：父类引用指向子类对象
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 接口名称 对象名 = new 实现类名称();
 *
 * 访问成员变量的两种方式：
 * 1. 直接通过对象名称访问成员变量，看等号左边是谁优先用谁，没有则往上找
 * 2. 间接通过成员方法访问成员变量，看方法属于谁就优先用谁，没有则向上找
 * 
 * 访问成员方法的方式：
 * 1. 看new的是谁就优先用谁，没有则想上找
 * 口诀：编译看左边，运行看右边
 */


public class MultiMain {
    public static void main(String[] args) {
        // 使用多态
        Person p = new Student();
        p.showInfo();
        p.showName();

        // 父类成员变量
        System.out.println(p.number);
    }
}
