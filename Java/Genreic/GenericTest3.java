package Genreic;

/**
 * 含有泛型的方法
 * 格式：
 *      修饰符 <代表泛型的变量> 返回值类型 方法名(参数){
 *          ...
 *      }
 * public interface Iterator<E>{
 *     E next();
 * }
 *
 * Scanner实现了Iterator接口，并指定接口的泛型为String
 * public final class Scanner implements Iterator<Sting>{
 *     public String next(){
 *         ...
 *     }
 * }
 */
public class GenericTest3 implements MyInterface<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
