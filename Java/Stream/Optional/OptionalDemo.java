//package Stream.Optional;
//
///*
//    Optional��Java8�����һ�����ڽ����ָ���쳣������
//    �����Ա�������T��ֵ�����߽�������null��Optional�ṩ�ܶ����õķ������������ǾͲ�����ʽ���п�ֵ���
// */
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//public class OptionalDemo {
//    public static void main(String[] args) {
////        CreateOptionalObject();
////        getOptionalObject();
////        ConvertOptionalObject();
////        JudgeOptionalObject();
////        NewOfOptional();
//    }
//
//    public static void NewOfOptional() {
//        /*
//        Optional<T>	or?(Supplier<? extends Optional<? extends T>> supplier)
//        �������Ϊ�գ��򷵻ظö��󣬷��򷵻���Supplier��������һ��Optional ����
//         */
//        Optional<String> o = Optional.ofNullable("Forlogen").or(() -> Optional.ofNullable("Unknow"));
//        System.out.println(o.orElseGet(() -> "no value")); // Forlogen
//
//        Optional<Object> o1 = Optional.ofNullable(null).or(() -> Optional.ofNullable("unKnow"));
//        System.out.println(o1.orElseGet(() -> "no value")); // unKnow
//
//        Optional.ofNullable("Forlogen").
//                stream().
//                filter(w -> w.length() > 4).
//                map(String::toUpperCase).
//                forEach(System.out::println);  // FORLOGEN
//
//    }
//
//    public static void JudgeOptionalObject() {
//        /*
//        boolean	isPresent ():�����жϰ�װ�����ֵ�Ƿ�ǿ�
//         */
//        System.out.println(Optional.ofNullable(10).isPresent());  // true
//        System.out.println(Optional.ofNullable(null).isPresent());  // false
//
//        /*
//        void ifPresent (Consumer<? super T> action):
//        ��������һ��Consumer�������Ѻ������������װ�����ֵ�ǿգ�����Consumer�����accept()����
//         */
//        Optional.ofNullable("Forlogen").ifPresent(w -> System.out.println(w.toUpperCase()));  // FORLOGEN
//
//        /*
//        String toString():����һ��Optional�ķǿ��ַ���
//         */
//        System.out.println(Optional.ofNullable("Forlogen").toString()); // Optional[Forlogen]
//
//        /*
//        void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)��
//        ����������ֵ����ִ�� Consumer �Ķ������������� Runnable��
//         */
//        Person p = new Person("Forlogen");
//        Optional.ofNullable(new Person("Forlogen")).ifPresentOrElse(u -> System.out.println(u.getName()), ()-> System.out.println("no name")); // Forlogen
//        Optional.ofNullable(new Person()).ifPresentOrElse(u -> System.out.println(u.getName()), ()-> System.out.println("no name")); // null
//    }
//
//    public static void ConvertOptionalObject() {
//        /*
//        <U> Optional<U>	map(Function<? super T,? extends U> mapper)
//        map()������Optional�еİ�װ������Function�����������㣬����װ���µ�Optional���󣨰�װ��������Ϳ��ܸı䣩
//         */
//        Optional<String> s = Optional.of("Forlogen").map(w -> w.toUpperCase());
//        System.out.println(s.orElseGet(() -> "no value"));  // FORLOGEN
//
//        /*
//        <U> Optional<U>	flatMap (Function<? super T,? extends Optional<? extends U>> mapper)
//        ���Function�����ķ���ֵ����ΪOptional<U>���ͣ�������U���ͣ�
//        ����flatMap()�ܽ�һ����ά��Optional����ӳ���һ��һά�Ķ���
//         */
//        Person p = new Person("Forlogen");
//        Optional<String> s1 = Optional.ofNullable(p).flatMap(u -> Optional.ofNullable(u.getName()));
//        System.out.println(s1); // Optional[Forlogen]
//
//        /*
//        Optional<T>	filter (Predicate<? super T> predicate)
//        filter()�������ܲ���ΪPredicate�������ڶ�Optional������й��ˣ�
//        �������Predicate������������Optional���������򷵻�һ���յ�Optional����
//        */
//        Optional<String> b = Optional.ofNullable("Forlogen").filter(w -> w.startsWith("F") && w.length() > 3);
//        System.out.println(b.isPresent()); // true
//
//        /*
//        ��ʽ���
//         */
//        Optional<String> str = Optional.ofNullable("Forlogen")
//                .filter(w -> w.length() > 4)
//                .map(String::toUpperCase);
//        System.out.println(str.orElseGet(() -> "no value")); // FORLOGEN
//        Optional<String> str1 = Optional.ofNullable("Kobe")
//                .filter(w -> w.length() > 4)
//                .map(String::toUpperCase);
//        System.out.println(str1.orElseGet(() -> "no value")); // no value
//    }
//
//    public static void getOptionalObject() {
//        /*
//        T get():��ȡOptional�����ֵ�����������Ϊ��ʱ���׳�NullPointerException�쳣
//         */
//        Optional<Integer> o1 = Optional.of(10);
//        System.out.println(o1.get()); // 10
//
//        /*
//        T ofElse(T value):�������װ����ֵ�ǿգ����ذ�װ����ֵ�����򷵻����other��ֵ��Ĭ��ֵ)
//        ���Լ���
//         */
//        Optional<Integer> o2 = Optional.of(10);
//        Integer num = o2.orElse(0);
//        System.out.println(num); // 10
//
//        Person p = new Person("Forlogen");
//        Person person = Optional.of(p).orElse(null);
//        System.out.println(person.getName()); // Forlogen
//        Person p1 = new Person();
//        Person person1 = Optional.of(p1).orElse(null);
//        System.out.println(person1.getName()); // null
//
//        /*
//        T orElseGet (Supplier<? extends T> supplier):
//        ��ֵ��ʱ�򷵻�ֵ�����û��ֵ������ִ����Ϊ��������� Supplier����ʽ�ӿ�
//        ���Լ���
//         */
//        Integer num1 = Optional.of(24).orElseGet(() -> 0);
//        System.out.println(num1);  // 24
//        Object o = Optional.ofNullable(null).orElseGet(() -> 0);
//        System.out.println(o);  // 0
//
//        /*
//        <X extends Throwable> T	orElseThrow?(Supplier<? extends X> exceptionSupplier)
//        Supplier������뷵��һ��Throwable�쳣������orElseThrow()�н��쳣�׳���
//         */
//        String s = Optional.of("Forlogen").orElseThrow(() -> new RuntimeException("no name"));
//        System.out.println(s);  // Forlogen
//        Object s1 = Optional.ofNullable(null).orElseThrow(() -> new RuntimeException("no name"));
//        System.out.println(s1);  // Exception in thread "main" java.lang.RuntimeException: no name
//    }
//
//    public static void CreateOptionalObject() {
//        Person p = new Person();
////        System.out.println(p.getName().toLowerCase()); // Exception in thread "main" java.lang.NullPointerException
//
//        String name = p.getName() == null ? p.getName() : null;
//        System.out.println(name); // null
//
//        /*
//        ����Optionalʵ�������ַ�����
//        1.  Optional.empty():����һ����װ����ֵΪ�յ�Optional����
//        2. Optional.of(T value):������װ����ֵ�ǿյ�Optional����
//        3. Optional.ofNullable(T value):������װ����ֵ����Ϊ�յ�Optional����
//         */
//        Optional<Object> o1 = Optional.empty();
//        System.out.println(o1);  // Optional.empty
//        Optional<Object> o2 = Optional.of(10);
//        // �����null����of()���׳��쳣
////        Optional<Object> o3 = Optional.of(null);
////        System.out.println(o3);  // Exception in thread "main" java.lang.NullPointerException
//        System.out.println(o2);  // Optional[10]
//        Optional<Object> o4 = Optional.ofNullable(null);
//        System.out.println(o4);   // Optional.empty
//
//        /*
//        �����ʱOptional����Ϊ�գ���ôʹ��get()����ȡOptional�����ֵ�ͻ��׳��쳣
//        ���ԣ���Զ���ý�null����Optional
//        ���߾�������ʹ��get()����ȡOptional�����ֵ
//         */
////        System.out.println(o1.get());
////        // Exception in thread "main" java.util.NoSuchElementException: No value present
////        System.out.println(o3.get());
////        // Exception in thread "main" java.util.NoSuchElementException: No value present
//
//    }
//}
