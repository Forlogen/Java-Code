package StringTable;

import org.junit.Test;

public class StringTest4 {

    @Test
    public void test1(){
        String s = new String("1");
        s.intern();//调用此方法之前，字符串常量池中已经存在了"1"
        String s2 = "1";
        System.out.println(s == s2);  //false

        //s3变量记录的地址为：new String("11")
        String s3 = new String("1") + new String("1");

        //执行完上一行代码以后，字符串常量池中，是否存在"11"呢？答案：不存在！！
        //jdk7:此时常量中并没有创建"11",而是创建一个指向堆空间中new String("11")的地址
        s3.intern();
        //s4变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11"的地址
        String s4 = "11";
        System.out.println(s3 == s4);//true
    }

    @Test
    public void test2(){
        String s = new String("Forlogen");
    }

    @Test
    public void test3(){
        String str = new String("a") + new String("b");
    }

}
