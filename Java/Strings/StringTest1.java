package Strings;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] chararray = new char[]{'a', 'b', 'c'};
        String str3 = new String(chararray);
        System.out.println(str3);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
    }
}
