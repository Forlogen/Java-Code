package FuncInterface;


import java.util.function.*;

public class SomeFncInterfacesInJDK_2 {
    public static void main(String[] args) {
        String str = "Hello world";
        UsingBiConsume(0, str.length() - 2, (s, e)->{
            System.out.println(str.subSequence(s, e)); // Hello wor
        });

        boolean b = UsingBiPredicate(2, 10, (f, l) -> f < l);
        System.out.println(b); // true
        
    }

    // BiConsume<T, U>
    // accept()¡¢andThen()
    public static void UsingBiConsume(int start, int end, BiConsumer<Integer, Integer> bc){
        bc.accept(start, end);
    }

    /*
    BiPredicate<T, U>

    boolean	test(T t, U u)
    default BiPredicate<T,U> and(BiPredicate<? super T,? super U> other)
    default BiPredicate<T,U> negate()
    default BiPredicate<T,U> or(BiPredicate<? super T,? super U> other)
     */
    public static boolean UsingBiPredicate(int first, int second, BiPredicate<Integer, Integer> bp){
        return bp.test(first, second);
    }

}
