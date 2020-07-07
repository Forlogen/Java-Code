package FuncInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class FuncMain {
    public static void main(String[] args) {
        // 调用接口实现类的重写方法
        show(new FuncInterfaceImpl());

        // 使用匿名内部类重写方法
        show(new FuncInterface() {
            @Override
            public void method() {
                System.out.println("Functional interface...");
            }
        });

        // 使用Lambda表达式重写方法
        show(() -> {System.out.println("Functional interface...");});
        show(() -> System.out.println("Functional interface..."));

    }


    public static void show(FuncInterface fi){
        fi.method();
    }
}
