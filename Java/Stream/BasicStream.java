package Stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
    ֮ǰ���еĹ���Stream�Ĳ���������ʹ�õĶ���java.util.Stream<T>�������Ҫ��int�͵����ݴ洢������
    ����ʵ�����ǽ��䱣�浽Stream<Integer>��Stream<int>�ǲ����ڵģ�����������Ҫ����ת��Ϊ��Ӧ�İ�װ���ͣ�Ч�ʽϵ͡�

    java.util.stream����DoubleStream��IntStream��LongStream��ֱ�Ӵ洢�������͵�ֵ��������ʹ�ð�װ��
    IntStream���ڴ洢short��char��byte��boolean���͵����ݣ�DoubleStream���ڴ洢float��double������

    �����������Ĵ���ͬ������ʹ��of()��generate()��iterate()

    IntStream��LongStream�о�̬�ķ���range()��rangeClosed()�������ɲ���Ϊ1��������Χ

    ��������ʹ��Collection.parallelStream()�����⼯���л�ȡһ��������
    ����parallel()������˳�����ת��Ϊ������

 */
public class BasicStream {
    public static void main(String[] args) {
        TestIntStream();
        // DoubleStream��LongStream�����ƵĲ�����ֻ�����Ͳ�ͬ����
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
