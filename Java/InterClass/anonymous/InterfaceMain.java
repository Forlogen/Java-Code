package InterClass.anonymous;

/**
 * 如果接口的实现类（或父类的子类）只需要使用唯一的一次，则可以省略该类的定义，而改为使用匿名内部类
 *
 * 匿名内部类格式：
 * 接口名称 对象名 = new 接口名称(){
 *   //覆盖称谢所有抽象方法
 * };
 *
 * 注意事项：
 * new 接口名称(){...}
 * 1. new代表创建对象的动作
 * 2. 接口名称是匿名内部类需要实现那个接口
 * 3. {...}是匿名内部类的内容
 *
 * 匿名内部类在创建对象的时候，只能使用唯一的一次
 * 如果希望希望多次创建独享，而且类的内容完全一样，则只能使用接口的单独实现类
 * 匿名内部类是省略了实现类/子类名称，但匿名对象是省略了对象名称
 */
public class InterfaceMain {
    public static void main(String[] args) {
        MyInterfaceImpl my = new MyInterfaceImpl();
        my.show(); // MyInterfaceImpl...

        // 使用匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("anonymous inter class...");
            }
        };

        myInterface.show(); // anonymous inter class...

    }
}
