package FuncInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SomeFncInterfacesInJDK {
    public static void main(String[] args) {

        // Supplier�ӿڵ�ʹ��
        String s = getString(()-> "Forlogen");
        System.out.println(s);  // Forlogen

        // ʹ��Supplierʵ�ֻ�ȡ��������ֵ
        int[] array = {1, 3, 10, 5, 8};
        /*
        �Զ����䣬�ȼ���
        Integer max = getMax();
        System.out.println(max.intValue());
         */
        int max = getMax(() -> {
            int maxN = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxN) {
                    maxN = array[i];
                }
            }

            return maxN;
        });
        System.out.println(max);  // 10

        // Consumer�ӿڵ�ʹ��
        Consume("Forlogen", (name) -> System.out.println(name.toUpperCase()));  //FORLOGEN

        ConsumeAddThen("Forlogen", (name)-> System.out.println(name.toUpperCase()),
                (name)->System.out.println(name.toLowerCase()) // FORLOGEN  forlogen
        );


        // Predicate�ӿڵ�ʹ��
        boolean b = CheckString("Forlogen", (str) -> str.length() > 5); // true
        System.out.println(b);

        boolean b1 = CheckStringAnd("Forlgoen", (str)-> str.startsWith("a"), (str)->str.length() > 5);
        System.out.println(b1);    // false

        boolean b2 = CheckStringOr("Forlgoen", (str)-> str.startsWith("a"), (str)->str.length() > 5);
        System.out.println(b2);  // true

        boolean b3= CheckStringNegate("Forlgoen", (str)-> str.startsWith("a"));
        System.out.println(b3); // true

        // Function�ӿڵ�ʹ��
        int x = convert((str)-> Integer.parseInt(str), "100");
        System.out.println(x);  // 100

        String s1 = convertAndThen((str) -> Integer.parseInt(str) * 3, (num) -> num + " ", "1000");
        System.out.println(s1);  // 3000


    }

    /*
    java.util.function.Supplier<T> �ӿڽ�����һ���޲εķ�����T get()
    �û�����ȡһ�����Ͳ���ָ�����͵Ķ�������

    Supplier<T>�ӿڱ���֮Ϊ�����ͽӿڣ�ָ���ӿڵķ�����ʲô���ͣ���ôget�����ͻ�����ʲô���͵�����
     */
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

    /*
    java.util.function.Consumer<T>�ӿ���������һ�����ݣ������������ɷ���ȷ��
    �ӿ���ֻ��һ������void accept(T t)����Ϊ����һ��ָ�����͵�����

    Consumer�ӿ���һ�������ͽӿڣ�����ָ��ʲô���ͣ��Ϳ���ʹ��accept��������ʲô���͵�����
    ���ھ�����ô��������Ҫ�Զ���

    Ĭ�Ϸ�����andThen
    ���ã���Ҫ����Consumer�ӿ�,���԰�����Consumer�ӿ������һ���ٶ����ݽ�������

    example:
        Consumer<String> c1
        Consumer<String> c2
        String s = "hello"
        c1.accept(s)
        c2.accept(s)

        �ȼ���
        c1.addThen(c2).accept(s) :˭дǰ��˭������

     */
    public static void Consume(String s, Consumer<String> c){
        c.accept(s);
    }

    public static void ConsumeAddThen(String s, Consumer<String> c1, Consumer<String> c2){
        c1.andThen(c2).accept(s);

//        c1.accept(s);
//        c2.accept(s);
    }

    /*
    java.util.function.Predicate<T>�ӿ�
    ���ã���ĳ���������͵����ݽ����жϣ��������һ��booleanֵ

    �ӿ��а���һ�����󷽷���boolean test(T t):������ָ�����������ͽ����ж�
        ��������������true
        ���򣬷���false

    Ĭ�Ϸ���
    1. and()
    2. or()
    3. negate()

    */

    public static boolean CheckString(String s, Predicate<String> p){
        return p.test(s);
    }

    public static boolean CheckStringAnd(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.and(p2).test(s);
        // �ȼ��� return p1.test(s) && p2.test(s);
    }

    public static boolean CheckStringOr(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.or(p2).test(s);
        // �ȼ��� return p1.test(s) || p2.test(s)

    }

    public static boolean CheckStringNegate(String s, Predicate<String> p){
        return p.negate().test(s);
        // �ȼ��� return !p.test(s);
    }

    /*
    java.util.function.Function<T, R>�ӿ���������һ�����͵����ݵõ���һ�����͵�����
    ǰ�߳�Ϊǰ�����������߳�Ϊ��������

    �ӿ��еĳ��󷽷�R apply(T t)����������T�Ĳ�����ȡ����R�Ľ��
     */
    public static Integer convert(Function<String, Integer> f, String s){
        return f.apply(s);
    }

    public static String convertAndThen(Function<String, Integer> f1, Function<Integer, String> f2, String s){
        return f1.andThen(f2).apply(s);
    }
}
