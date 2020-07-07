package collections;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = 0;
            num = r.nextInt(32) + 1;
            list.add(num);
        }

        for(int ele: list){
            System.out.println(ele);
        }
    }
}
