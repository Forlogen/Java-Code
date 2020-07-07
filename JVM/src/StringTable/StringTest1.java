package StringTable;

import org.junit.Test;

public class StringTest1 {

    @Test
    public void test1(){
        String s2 = new String("Forlogen");
        String s1 = "Forlogen";  // Forlogen保存在字符串常量池中
        System.out.println(s1.hashCode());  // 538205156
        System.out.println(s2.hashCode());  // 538205156
        System.out.println(s1 == s2);  // false
    }

    @Test
    public void test2(){
        String s1 = "Forlogen";
        String s2 = "Forlogen";
        System.out.println(s1 + " " + s2);  // Forlogen Forlogen
        System.out.println(s1 == s2);  // true

        s1 = "Kobe";
        System.out.println(s1 + " " + s2);  // Kobe Forlogen
        System.out.println(s1 == s2);  // false
    }

    @Test
    public void test3(){
        String s1 = "Forlogen";
        String s2 = "Forlogen";
        System.out.println(s1 + " " + s2);  // Forlogen Forlogen
        System.out.println(s1 == s2);  // true

        s1 += " kobe";
        System.out.println(s1 + " " + s2);  // Forlogen kobe Forlogen
        System.out.println(s1 == s2);  // false
    }

    @Test
    public void test4(){
        String s1 = "Forlogen";
        System.out.println(s1);  // Forlogen

        String s2 = s1.replace("F", "R");
        System.out.println(s2);  // Rorlogen
        System.out.println(s1 == s2);  // false
    }
}

