package Stream;

/*
    Stream�����ڹܵ�����ֻ�ܱ�����һ��
    һ��Stream�������귽�������ݾͻ���ת�ص���һ��Stream��
    ÿһ��Stream��ʹ����Ͼͻ�չأ������ڵ���
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
    concat():���ںϲ�������
        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b);
    ��̬����
     */
    private static void UsingConcat() {
        Stream<String> stream = Stream.of("Forlogen", "kobe");
        Stream<String> stream1 = Stream.of("James", "ball");
        // ͨ���ӿ���ֱ�ӵ���
        Stream.concat(stream, stream1).forEach(name-> System.out.println(name));
    }

    /*
    skip()����������Ԫ�أ����ص���һ���µ���
        Stream<T> skip(long n);
        ������ĵ�ǰ���ȴ���n��������ǰn��������õ�һ������Ϊ0������
     */
    private static void UsingSkip() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.skip(1).forEach(name-> System.out.println(name));
    }

    /*
    limit():���ڽ�ȡ���е�Ԫ�أ�ֻȡ��ǰn��
        Stream<T> limit(long maxSize);
            �����ǰ���ϳ��ȴ���maxSize����н�ȡ�����򲻽��в���
    �ӳٷ�����ֻ�Ƕ����е�Ԫ�ؽ��н�ȡ������һ���µ���

     */
    private static void UsingLimit() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.limit(2).forEach(name-> System.out.println(name));
    }

    /*
    count()������ͳ��Stream����Ԫ�صĸ���
        long count();
     �ս᷽��
     */
    private static void UsingCount() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        long count = stream.filter(name -> name.length() > 4).count();
        System.out.println(count);
    }

    /*
    map():�����е�Ԫ��ӳ�䵽��һ������
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
     */
    private static void UsingMap() {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.map(s->Integer.parseInt(s)).forEach(x-> System.out.println(x));

    }

    /*
    filter()�����ڶ�Stream���е����ݽ��й���
        Stream<T> filter(Predicate<? super T> predicate);
     */
    private static void UsingFilter() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.filter(name->name.length() > 4).forEach(name-> System.out.println(name));
    }

    /*
    forEach()
        void forEach(Consumer<? super T> action);
        ��������һ��Consumer�ӿں������Ὣÿһ����Ԫ�ؽ����ú������д���
        Consumer�ӿ���һ�������͵ĺ���ʽ�ӿڣ����Դ���Lambda���ʽ����������

        ����
            forEach���������������е����ݣ�һ���ս᷽��
            ʹ����֮��������Stream�е���������
    */
    private static void UsingForEach() {
        Stream<String> stream = Stream.of("Forlogen", "kobe", "James");
        stream.forEach(name -> System.out.println(name));
    }

}
