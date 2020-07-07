package Strings;

// == 进行对象地址值的比较，如果需要进行字符串内容的比较，可以使用两个方法：
// public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串并且内容相同时返回true，否则返回false
// NOTE:
// 1. 任何对象都能用Object接收
// 2. equals方法具有对称性，即a.equals(b) 和 b.equals(a) 效果一样
// 3. 如果比较一个常量和一个变量，推荐使用 常量.equals(变量)
//
// public boolean equalsIgnoreCase(String str): 忽略大小写，进行内容比较
public class StringTest2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] chararray = new char[]{'a', 'b', 'c'};
        String str3 = new String(chararray);

        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.equals(str3));  // true
        System.out.println(str3.equals("abc")); // true
        System.out.println("abc".equals(str1)); // true

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false
        System.out.println(strA.equalsIgnoreCase(strB)); // true
    }
}
