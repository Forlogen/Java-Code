package Lambda;

import Genreic.Person1;

public class LambdaTest1 {
    public static void main(String[] args) {
//        Person p = new Person("Forlogen");
//        p.show(); // Forlogen

        // 匿名内部类实现
        showName(new Person() {
            @Override
            public void show() {
                System.out.println("Forlogen");
            }
        });

        // 使用Lambda表达式实现
        // 无参数，无返回值
        showName(() -> {
            System.out.println("Forlgoen");
        });
    }

    public static void showName(Person p){
        p.show();
    }
}
