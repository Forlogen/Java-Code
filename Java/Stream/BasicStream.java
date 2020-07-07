package Stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
    之前所有的关于Stream的操作，我们使用的都是java.util.Stream<T>，如果想要将int型的数据存储到流中
    程序实际上是将其保存到Stream<Integer>，Stream<int>是不存在的，但这样就需要将其转换为对应的包装类型，效率较低。

    java.util.stream中有DoubleStream、IntStream和LongStream来直接存储基本类型的值，而无需使用包装类
    IntStream用于存储short、char、byte和boolean类型的数据；DoubleStream用于存储float、double型数据

    基本类型流的创建同样可以使用of()、generate()和iterate()

    IntStream和LongStream有静态的方法range()、rangeClosed()用于生成步长为1的整数范围

    并行流：使用Collection.parallelStream()从任意集合中获取一个并行流
    或是parallel()将任意顺序的流转换为并行流

 */
public class BasicStream {
    public static void main(String[] args) {
        TestIntStream();
        // DoubleStream和LongStream有相似的操作，只是类型不同而已
    }

    private static void TestIntStream() {
        System.out.println(Arrays.toString(IntStream.of(1, 4, 3, 15).toArray()));  // [1, 4, 3, 15]
        System.out.println("--------------------");

        System.out.println(Arrays.toString(IntStream.range(1, 10).toArray()));   // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println("--------------------");

        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 10).toArray()));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("--------------------");

        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println(min.getAsInt());  // 1
        System.out.println("--------------------");

        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println(max.getAsInt());  // 9
        System.out.println("--------------------");

        OptionalDouble average = IntStream.range(1, 10).average();
        System.out.println(average.getAsDouble());  // 5.0
        System.out.println("--------------------");

        int sum = IntStream.range(1, 10).sum();
        System.out.println(sum);   // 45
        System.out.println("--------------------");


    }
}
