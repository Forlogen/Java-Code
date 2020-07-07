package Genreic;

/**
 * 定义含有泛型的接口
 * 格式：
 *      修饰符 interface 接口名<代表泛型的变量>{
 *          ...
 *      }
 */
public interface MyInterface<E> {
    public void show(E e);
}
