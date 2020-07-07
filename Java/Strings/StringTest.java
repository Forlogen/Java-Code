package Strings;

// 程序中的所有的双引号字符串都是String类的对象
// 字符串是常量，不可改变，可共享使用
// 字符串效果上相当于char型数组 char []，但底层原理是byte[]字节数组
//
public class StringTest {
    public static void main(String[] args) {
        // 三种构造
        String str1 = new String();
        System.out.println(str1);

        char [] array = new char []{'k', 'o', 'b', 'e'};
        String str2 = new String(array);
        System.out.println(str2); // "kobe"

        byte[] bytearray = new byte[]{97, 98, 99};
        String str3 = new String(bytearray); // "kobe"
        System.out.println(str3);

        // 直接创建
        String str4 = "kobe";
        System.out.println(str4); // "kobe"

    }
}
