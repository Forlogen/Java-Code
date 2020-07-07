package Lambda;


import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest2 {
    public static void main(String[] args) {
        Student[] list = {new Student(24, "Forlogen"), new Student(20, "kobe")};

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 有参数有返回值
        Arrays.sort(list, (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });

//        Arrays.sort(list, (Student o1, Student o2) -> {return o1.getAge() - o2.getAge();});

        //Arrays.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());


        for(Student s : list){
            System.out.println(s.getAge() + " " + s.getName());
        }


    }
}
