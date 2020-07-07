package ReflectDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
//        normalCopy();
        Person[] p = new Person[10];
        Object o = goodCopy(p, p.length * 2);
        System.out.println((Person[])o);  // [LReflectDemo.Person;@677327b6

    }

    public static void normalCopy(){
        Person[] p = new Person[10];
        Object[] people = Arrays.copyOf(p, p.length);
        System.out.println((Person[])people);  // [LReflectDemo.Person;@677327b6

        Object[] o = new Object[10];
        Object[] objects = Arrays.copyOf(o, o.length);
        Person[] p1 = (Person[])o;
        System.out.println(p1); // Exception in thread "main" java.lang.ClassCastException
    }

    public static Object goodCopy(Object a, int length){
        Class<?> aClass = a.getClass();
        if (!aClass.isArray()){
            return null;
        }
        Class<?> componentType = aClass.getComponentType();
        int len = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, length);
        System.arraycopy(a, 0, newArray, 0, Math.min(len, length));
        return newArray;
    }
}
