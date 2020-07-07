package FuncInterface;

public class LoggerDemo {
    public static void main(String[] args) {
        String m1 = "hello";
        String m2 = " world";
        String m3 = " ...";

        show(1, m1 + m2 + m3);
    }

    public static void show(int level, String message){
        if (level == 1){
            System.out.println(message);
        }
    }
}
