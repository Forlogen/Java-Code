package OOP;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Employee());
        Employee e1 = new Employee("Forlogen", 1000);
        Employee e2 = new Employee("kobe", 2000);

        // 按值传递修改对象值
        System.out.println(e1.getSalary());  // 1000
        tripleSalary(e1.getSalary());
        System.out.println(e1.getSalary());
        System.out.println("-------------");  // 1000

        // 按引用传递修改对象值
        System.out.println(e2.getSalary());  // 2000
        tripleSalary(e2);
        System.out.println(e2.getSalary());  // 6000


//        // 引用传递交换
//        System.out.println("MAIN -- e1's salary is: " + e1.getSalary() + " and e2's salary is: " + e2.getSalary());
//        // e1's salary is: 1000 and e2's salary is: 6000
//        swap(e1, e2);
//        System.out.println("MAIN -- e1's salary is: " + e1.getSalary() + " and e2's salary is: " + e2.getSalary());
//        // e1's salary is: 1000 and e2's salary is: 6000

        // 按值传递交换
        System.out.println("MAIN -- e1's salary is: " + e1.getSalary() + " and e1's name is: " + e1.getName());
        System.out.println("MAIN -- e2's salary is: " + e2.getSalary() + " and e1's name is: " + e2.getName());
        /*
        MAIN -- e1's salary is: 1000 and e1's name is: Forlogen
        MAIN -- e2's salary is: 6000 and e1's name is: kobe
         */

        swap(e1, e2);
        System.out.println("MAIN -- e1's salary is: " + e1.getSalary() + " and e1's name is: " + e1.getName());
        System.out.println("MAIN -- e2's salary is: " + e2.getSalary() + " and e1's name is: " + e2.getName());
        /*
        MAIN -- e1's salary is: 6000 and e1's name is: kobe
        MAIN -- e2's salary is: 1000 and e1's name is: Forlogen
         */

    }
    public static void tripleSalary(int s){
        s = s * 3;
        System.out.println("s is : " + s);  // 3000
    }

    public static void tripleSalary(Employee e){
        e.setSalary(e.getSalary() * 3);
        System.out.println("e's salary is: " + e.getSalary());  // 6000
    }

//    public static void swap(Employee x, Employee y){
//        Employee e =  x;
//        x =  y;
//        y =  e;
//        System.out.println("SWAP -- x's salary is: " + x.getSalary() + " and y's salary is: " + y.getSalary());
//    }

    public static void swap(Employee e1, Employee e2){
        int t1 = e1.getSalary();
        e1.setSalary(e2.getSalary());
        e2.setSalary(t1);

        String name = e1.getName();
        e1.setName(e2.getName());
        e2.setName(name);
    }
}
