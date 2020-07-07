package Clone;

public class CloneDemo2 {
    public static void main(String[] args) {
        Subject s = new Subject("lakers");
        Student s1 = new Student("Forlgoen", 10, s);
        Student s2 = new Student("Forlgoen", 10, s);
        System.out.println(s1.getSubject() + " -- " + s2.getSubject());
        System.out.println("s1 is: " + s1 + " and s2 is: " + s2);
        System.out.println(s1 == s2);
        System.out.println("-------------");
        /*
        Clone.Subject@135fbaa4 -- Clone.Subject@135fbaa4
        s1 is: Clone.Student@45ee12a7 and s2 is: Clone.Student@330bedb4
        false
         */

        Student s3 = s1;
        System.out.println(s1.getSubject() + " -- " + s3.getSubject());
        System.out.println("s1 is: " + s1 + " and s3 is: " + s3);
        System.out.println(s1 == s3);
        System.out.println("-------------");
        /*
        Clone.Subject@135fbaa4 -- Clone.Subject@135fbaa4
        s1 is: Clone.Student@45ee12a7 and s3 is: Clone.Student@45ee12a7
        true
         */

        Student s4 = (Student) s1.clone();
        System.out.println(s1.getSubject() + " -- " + s4.getSubject());
        System.out.println("s1 is: " + s1 + " and s4 is: " + s4);
        System.out.println(s1 == s4);
        System.out.println("-------------");
        /*
        Clone.Subject@135fbaa4 -- Clone.Subject@135fbaa4
        s1 is: Clone.Student@45ee12a7 and s4 is: Clone.Student@2503dbd3
        false
         */

    }
}
