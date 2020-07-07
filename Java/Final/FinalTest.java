package Final;

public class FinalTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.showInfo();

        int number = 10;
        System.out.println(number + 1); // 11

        /**
         * 当变量被final修饰，一次赋值终生不变
         *
         * 对于基本类型来说，不可变说的是变量当中的数据不可变
         * 对于引用类型来说，不可变说的是变量当中的地址值不可变
         */
//        final int number1 = 10;
//        number1 = 20;  // Error:(15, 9) java: 无法为最终变量number1分配值
    }
}
