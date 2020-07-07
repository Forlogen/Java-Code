package Stream;

/*
    Stream流属于管道流，只能被消费一次
    一个Stream流调用完方法后，数据就会流转回到下一个Stream上
    每一个Stream流使用完毕就会闭关，不能在调用
 */
import java.util.stream.Stream;

public class SomeFuncInStream {
    public static void main(String[] args) {
        UsingForEach();
        System.out.println("-----------------");
        UsingFilter();
        System.out.println("-----------------");
        UsingMap();
        System.out.println("-----------------");
        UsingCount();
        System.out.println("-----------------");
        UsingLimit();
        System.out.println("-----------------");
        UsingSkip();
        System.out.println("-----------------");
        UsingConcat();
    }

    /*
    concat():用于合并两个流
        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b);
    静态方法
     */
    private static void UsingConcat() {
        Stream<String> stream = Stream.of("Forlogen", "kobe");
        Stream<String> stream1 = Stream.of("James", "ball");
        // 通过接口名直接调用
        Stream.concat(stream, stream1).forEach(name-> System.out.println(name));
    }

    /*
    skip()：用于跳过元素，返回的是一个新的流
        Stream<T> skip(long n);
        如果流的当前长度大于n，则跳过前n个，否则得到一个长度为0的新流
     */
    private static void UsingSkip() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.skip(1).forEach(name-> System.out.println(name));
    }

    /*
    limit():用于截取流中的元素，只取用前n个
        Stream<T> limit(long maxSize);
            如果当前集合长度大于maxSize则进行截取，否则不进行操作
    延迟方法，只是对流中的元素进行截取，返回一个新的流

     */
    private static void UsingLimit() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.limit(2).forEach(name-> System.out.println(name));
    }

    /*
    count()：用于统计Stream流中元素的个数
        long count();
     终结方法
     */
    private static void UsingCount() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        long count = stream.filter(name -> name.length() > 4).count();
        System.out.println(count);
    }

    /*
    map():将流中的元素映射到另一个流中
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
     */
    private static void UsingMap() {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.map(s->Integer.parseInt(s)).forEach(x-> System.out.println(x));

    }

    /*
    filter()：用于对Stream流中的数据进行过滤
        Stream<T> filter(Predicate<? super T> predicate);
     */
    private static void UsingFilter() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.filter(name->name.length() > 4).forEach(name-> System.out.println(name));
    }

    /*
    forEach()
        void forEach(Consumer<? super T> action);
        方法接收一个Consumer接口函数，会将每一个流元素将给该函数进行处理
        Consumer接口是一个消费型的函数式接口，可以传递Lambda表达式，消费数据

        即：
            forEach方法用来遍历流中的数据，一个终结方法
            使用它之后不能再用Stream中的其他方法
    */
    private static void UsingForEach() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.forEach(name -> System.out.println(name));
    }

}
