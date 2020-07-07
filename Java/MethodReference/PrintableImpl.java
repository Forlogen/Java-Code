package MethodReference;

public class PrintableImpl implements Printable{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
