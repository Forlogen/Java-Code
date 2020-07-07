package FuncInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class RunnableDemo {
    public static void main(String[] args) {
//        startThread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " start...");
//            }
//        });
//
//        startThread(() -> System.out.println(Thread.currentThread().getName() + " start..."));

        ArrayList<String> list = new ArrayList<>();
        list.add("Forlogen");
        list.add("ada");
        list.add("kobe");

        System.out.println(list.toString());
        list.sort(getComparator());
        System.out.println(list.toString());
    }

    public static void startThread(Runnable r){
        new Thread(r).start();
    }

    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

//        return (String o1, String  o2) -> {return o2.length() - o1.length();};
        return (o1, o2) -> o2.length() - o1.length();
    }
}
