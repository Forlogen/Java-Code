package Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>��Java8�¼������õ����ӿڣ���ͨ�ӿڣ�
    ��ȡ�������ַ�����
    1. ���е�Collection���϶�����ͨ��stream()Ĭ�Ϸ�����ȡ��
        default Stream<T> stream()
    2. Stream�ӿ��еľ�̬����of���Ի�ȡ�����Ӧ����
        static <T> Stream<T> of (T...values)
        ������һ���ɱ��������ô�Ϳ��Դ���һ������
 */
public class GetStream {
    public static void main(String[] args) {
        // Collection�ӿ��еĵ��м���ֱ��ͨ��Ĭ�ϵ�stream()��ȡ��
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // Map������Ҫ��ת��ΪSet���ϣ���ͨ��set���ϵ�stream()��ȡ��
        Map<Integer, String> map = new HashMap<>();
        // ��ȡ��
        Set<Integer> keys = map.keySet();
        Stream<Integer> steam3 = keys.stream();
        // ��ȡֵ
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        // ��ȡ��ֵӳ���ϵ
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entries.stream();


        // ����ʹ��Stream�ӿ���of()��ȡ��
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);



    }
}

