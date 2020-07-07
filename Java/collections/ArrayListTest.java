package collections;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 右侧的<>中可以不写内容但必须有
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // add(E e)
        list.add("Forlogen");
        boolean k = list.add("Kobe");
        System.out.println(list); // [Forlogen, Kobe]

        // size()
        System.out.println(list.size()); // 2

        // get(int index)
        System.out.println(list.get(0)); // Forlogen

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String ele: list){
            System.out.println(ele);
        }

        // remove(int index)
        list.remove(0);
        System.out.println(list); // [Kobe]

        //remove(object 0)
        list.remove("Kobe");
        System.out.println(list); // []

    }
}
