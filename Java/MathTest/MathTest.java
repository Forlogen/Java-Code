package MathTest;

import java.sql.SQLOutput;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.E);  // 2.718281828459045
        System.out.println(Math.PI); // 3.141592653589793

        System.out.println(Math.abs(4)); // 4
        System.out.println(Math.abs(-4)); // 4

        System.out.println(Math.floor(1.6)); // 1.0
        System.out.println(Math.ceil(1.6));  // 2.0

        System.out.println(Math.min(2, 6)); // 2
        System.out.println(Math.max(2, 6)); // 6

        System.out.println(Math.exp(2)); // 7.38905609893065
        System.out.println(Math.log(2)); // 0.6931471805599453

        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.sqrt(4));  // 2.0

        System.out.println(Math.sin(4.0));  // -0.7568024953079282
        System.out.println(Math.asin(-0.7568024953079282));  // -0.8584073464102067

        System.out.println(Math.random());  // 0.7898083114483953

    }
}
