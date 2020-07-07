//package Clone;
//
//public class CloneDemo {
//    public static void main(String[] args) {
//        Student s1 = new Student("Forlogen", 10);
//        Student s2 = new Student("Kobe", 24);
//        // 对于成员属性值不同的对象来说，它们是不同的
//        System.out.println("s1 is: " + s1 + " and s2 is: " + s2);
//        // s1 is: Clone.Student@135fbaa4 and s2 is: Clone.Student@45ee12a7
//        System.out.println(s1 == s2); // fasle
//
//        Student s3 = new Student("Forlogen", 10);
//        Student s4 = new Student("Forlogen", 10);
//        // 对于成员属性值相同的对象来说，它们也是不同的，堆内存地址不同
//        System.out.println("s3 is: " + s3 + " and s4 is: " + s4);
//        // s3 is: Clone.Student@330bedb4 and s4 is: Clone.Student@2503dbd3
//        System.out.println(s3 == s4); // fasle
//
//        // 对象拷贝
//        // 如果通过 = 直接赋值，实际上赋给的是堆内存地址
//        // = 两端的变量拥有相同的内容，即堆内存地址，那么自然是相等的
//        Student s5 = s4;
//        System.out.println("s4 is: " + s4 + " and s5 is: " + s5);
//        // s4 is: Clone.Student@2503dbd3 and s5 is: Clone.Student@2503dbd3
//        System.out.println(s4 == s5); // true
//
//        // 浅拷贝直接在堆内存中生成了一个新对象，并把内存地址赋给了新变量
//        Student s6 = (Student) s4.clone();
//        System.out.println("s4 is: " + s4 + " and s6 is: " + s6);
//        // s4 is: Clone.Student@2503dbd3 and s6 is: Clone.Student@4b67cf4d
//        System.out.println(s4 == s6); // false
//
//
//
//    }
//}
