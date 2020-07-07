package ClassLoader;

public class ClassInitDemo1 {
    static class Father{
        public static int a = 1;
    }

    static class Son extends Father{
        public static int b = a;
    }

    public static void main(String[] args) {
        System.out.println(Son.b); // 1
    }
}
