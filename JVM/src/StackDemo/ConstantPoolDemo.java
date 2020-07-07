package StackDemo;

public class ConstantPoolDemo {
    public static int number = 1;

    public static void main(String[] args) {
        int res = number + 1;
        System.out.println(res);
        try {
            System.out.println(10 / 0);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
