package StringTable;

import org.junit.Test;

public class StringTest3 {

    @Test
    public void test1(){
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);   // true
        System.out.println(s1.equals(s2));  // true
    }

    @Test
    public void test2(){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";
        String s4 = "Hello" + "World";
        System.out.println(s3 == s4); // true
        System.out.println("-----------------");

        String s5 = s1 + "World";
        System.out.println(s3 == s5);  // false
        System.out.println("-----------------");

        String s6 = "Hello" + s2;
        System.out.println(s3 == s6); // false
        System.out.println("-----------------");

        String s7 = s1 + s2;
        System.out.println(s3 == s7);  // false
        System.out.println("-----------------");

        System.out.println(s5 == s6);  // false
        System.out.println(s5 == s7);  // false
        System.out.println(s6 == s7);  // false
        System.out.println("-----------------");

        String s8 = s6.intern();
        System.out.println(s6 == s8);  // false
    }

    @Test
    public void test3(){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";

        String s4 = s1 + s2;
        System.out.println(s3 == s4);  //false
    }

    @Test
    public void test4(){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);  // false
    }

    @Test
    public void test5(){
        final String s1 = "Hello";
        String s2 = "HelloWorld";
        String s3 = s1 + "World";
        System.out.println(s2 == s3);  // true
    }
}
