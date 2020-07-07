package LiskovSubstitutionPrinciple;

class Father{
    public int method(int x, int y){
        return x + y;
    }
}

class Son extends Father{
    @Override
    public int method(int x, int y) {
        return x - y;
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println(new Father().method(3, 1));
        System.out.println(new Son().method(3, 1));
    }
}
