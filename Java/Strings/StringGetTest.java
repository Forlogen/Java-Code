package Strings;

// String中与获取相关的常用方法
// public int length(): 获取字符串中含有的字符个数
// public String concat(String str): 将当前字符串和参数字符串拼接为新字符串返回
// public char charAt(int index): 获取指定索引位置的单个字符
// public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1
public class StringGetTest {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.length()); // 3

        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1); // hello
        System.out.println(str2); // world
        System.out.println(str3); // helloworld

        System.out.println(str.charAt(0)); // a

        System.out.println(str.indexOf("bc")); // 1
        System.out.println(str.indexOf("ff")); // -1
    }
}
