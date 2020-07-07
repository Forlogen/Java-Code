package FuncInterface;

/*
    函数式接口：有且仅有一个抽象方法的接口
    接口中还可以包含其他的方法（默认、静态、私有）

    @FunctionalInterface:检测接口是否是一个函数式接口
        是：编译成功
        否：编译失败（接口中没有抽象方法或者抽象方法的个数多于一个）
 */
@FunctionalInterface
public interface FuncInterface {
    public abstract void method();
}
