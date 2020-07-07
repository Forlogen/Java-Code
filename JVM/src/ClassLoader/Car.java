package ClassLoader;

import java.sql.DriverManager;

public class Car {
    String name;
    double price;

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = new Car().getClass().getClassLoader();
        System.out.println(classLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@3fee733d

        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();
        System.out.println(aClass); // class ClassLoader.Car

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);
        // jdk.internal.loader.ClassLoaders$AppClassLoader@3fee733d

        System.out.println(ClassLoader.getSystemClassLoader());
        // jdk.internal.loader.ClassLoaders$AppClassLoader@3fee733d



    }
}
