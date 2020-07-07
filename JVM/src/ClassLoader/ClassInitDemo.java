package ClassLoader;

public class ClassInitDemo {
    private static int a = 1;
    private static int b = 0;
    static {
        b = 2;
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
