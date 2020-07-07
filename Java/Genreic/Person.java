package Genreic;

/**
 * 定义泛型类，使用了泛型的类可以接受任意类型的数据
 * 创建对象时确定泛型的数据类型
 * @param <E>
 */
public class Person<E> {
    E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }


    /**
     * 在调用方法时确定泛型的类型，传递什么类型的参数就使用什么类型的泛型
     * @param m
     * @param <M>
     */
    public static <M> void show(M m){
        System.out.println(m);
    }
}
