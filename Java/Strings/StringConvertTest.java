package Strings;


// String中与转换相关的常用方法:
// public char[] toCharArray(): 将当前字符串拆分为字符数组返回
// public byte[] getBytes(): 获取当前字符串底层的字节数组
// public String replace(charSequence oldString, CharSequence newString): 将所有出现的老字符串替换成新的字符串，返回替换之后的结果

import java.util.Arrays;

public class StringConvertTest {
    public static void main(String[] args) {
        String str = "helloworld";

        char [] charArray = str.toCharArray();
        System.out.println(charArray); // helloworld
        System.out.println(Arrays.toString(charArray)); // [h, e, l, l, o, w, o, r, l, d]
        System.out.println(charArray.length);  // 10

        byte [] byteArray = str.getBytes();
        System.out.println(byteArray[3]); // 108


        String str1 = "Fologen love Kobe";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);  // Fologen love Kobe
        System.out.println(str2);  // F*l*gen l*ve K*be

    }
}
