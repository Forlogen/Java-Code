package IntegerClass;

public class IntegerMain {
    public static void main(String[] args) {
        // 构造方法
        Integer i = new Integer(24);
        System.out.println(i);  // 24

        Integer i1 = new Integer("24");
        System.out.println(i1);  // 24

        // 静态方法
        Integer i2 = Integer.valueOf(24);
        Integer i3 = Integer.valueOf("24");
        System.out.println(i2); // 24
        System.out.println(i3); // 24

        // 拆箱
        int number= i.intValue();
        System.out.println(number);  // 24
    }
}
