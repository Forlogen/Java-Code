package Stream;

/*
    ʹ��Stream���������ϣ��Լ����е����ݽ��й���
    Stream����JDK8֮������ԣ���ע��ʲô����������ô��
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 10, 6, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int ele:array){
            System.out.println(ele);
        }

        List<String> list = new ArrayList<>();
        list.add("Forlogen");
        list.add("kobe");
        list.add("James");
        list.add("ball");
        list.add("bill");

        Iterator<String> iter  = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        for(String ele:list){
            System.out.println(ele);
        }

        List<String> list2 = new ArrayList<>();
        for(String ele:list){
            if (ele.length() > 3){
                list2.add(ele);
            }
        }

        List<String> list3 = new ArrayList<>();
        for (String ele: list2) {
            if (ele.startsWith("b")){
                list3.add(ele);
            }
        }

        for(String ele:list3){
            System.out.println(ele);
        }

        // ʹ��Stream������������
        list.stream().filter((name)->name.length() > 3)
                        .filter((name)->name.startsWith("b"))
                        .forEach((name)-> System.out.println(name));
    }
}
