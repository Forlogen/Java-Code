package Strings;

// String分割
// public Sting[] split(String regex):按照参数的规则，将字符串切分成若干部分
// regex为正则表达式
public class StringSplitTest {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String [] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
