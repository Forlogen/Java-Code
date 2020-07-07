package MethodReference;

/*
    通过对象名引用成员方法
    使用前提：
    1. 对象名已经存在
    2. 成员方法已经存在

 */
public class StringConvertDemo {
    public static void main(String[] args) {
        String str = "HELLO world...";
        // 通过Lambda表达式使用成员方法
        showString(str, (s)->{
            StringConvert st = new StringConvert();
            st.StringToUppercase(s);  // HELLO WORLD...
        });
        System.out.println("------------");

        // 通过对象名引用成员方法
        showString(str, new StringConvert()::StringToUppercase);  // HELLO WORLD...
        System.out.println("------------");

        // 通过类名直接引用静态方法
        showString(str, StringConvert::StringToLowercase);  // hello world...
    }
    public static void showString(String str, Printable p){
        p.print(str);
    }
}
