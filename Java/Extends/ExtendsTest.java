package Extends;

// 父类：一个普通的类
// 子类格式
// public class 子类名称 extends 父类名称{}
// 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式
// 1. 直接通过子类对象访问成员变量：等号左边是谁就优先用谁，没有则向上找
// 2. 间接通过成员方法访问成员变量：该方法属于谁就有限用谁，没有则向上找
public class ExtendsTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.ID = 001;
        t.name = "Forlogen";
        t.work();  // teacher...
        t.showInfo(); // ID is: 1 and name is: Forlogen

        Assistant assistant = new Assistant();
        assistant.ID = 110;
        assistant.name = "kobe";
        assistant.work();  // assistant...
        assistant.showInfo();  // ID is: 110 and name is: kobe


    }
}
