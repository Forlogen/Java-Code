package Strings;

// 字符串截取
// public String subString(int index):截取从参数位置一直到字符串末尾，返回新字符串
// public String subString(int begin, int end): 截取[begin, end)范围内的字符串
public class SubStringTest {
    public static void main(String[] args) {
        String str = "hello world";

        String str2 = str.substring(2);
        System.out.println(str2); // llo world
        System.out.println(str == str2);  // false
        System.out.println(str);  // hello world
        System.out.println(str.substring(2, str.length() - 2)); // llo wor


        // strA 中保存的是地址值
        // 为strA 赋予不同的字符串是改变了strA中保存的地址值，但"hello"和"world"是不可改变的
        String strA = "hello";
        System.out.println(strA); // hello
        strA = "world";
        System.out.println(strA); // world
    }
}
