//package Clone;
//
//public class CloneDemo {
//    public static void main(String[] args) {
//        Student s1 = new Student("Forlogen", 10);
//        Student s2 = new Student("Kobe", 24);
//        // ���ڳ�Ա����ֵ��ͬ�Ķ�����˵�������ǲ�ͬ��
//        System.out.println("s1 is: " + s1 + " and s2 is: " + s2);
//        // s1 is: Clone.Student@135fbaa4 and s2 is: Clone.Student@45ee12a7
//        System.out.println(s1 == s2); // fasle
//
//        Student s3 = new Student("Forlogen", 10);
//        Student s4 = new Student("Forlogen", 10);
//        // ���ڳ�Ա����ֵ��ͬ�Ķ�����˵������Ҳ�ǲ�ͬ�ģ����ڴ��ַ��ͬ
//        System.out.println("s3 is: " + s3 + " and s4 is: " + s4);
//        // s3 is: Clone.Student@330bedb4 and s4 is: Clone.Student@2503dbd3
//        System.out.println(s3 == s4); // fasle
//
//        // ���󿽱�
//        // ���ͨ�� = ֱ�Ӹ�ֵ��ʵ���ϸ������Ƕ��ڴ��ַ
//        // = ���˵ı���ӵ����ͬ�����ݣ������ڴ��ַ����ô��Ȼ����ȵ�
//        Student s5 = s4;
//        System.out.println("s4 is: " + s4 + " and s5 is: " + s5);
//        // s4 is: Clone.Student@2503dbd3 and s5 is: Clone.Student@2503dbd3
//        System.out.println(s4 == s5); // true
//
//        // ǳ����ֱ���ڶ��ڴ���������һ���¶��󣬲����ڴ��ַ�������±���
//        Student s6 = (Student) s4.clone();
//        System.out.println("s4 is: " + s4 + " and s6 is: " + s6);
//        // s4 is: Clone.Student@2503dbd3 and s6 is: Clone.Student@4b67cf4d
//        System.out.println(s4 == s6); // false
//
//
//
//    }
//}
