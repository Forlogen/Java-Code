package ReflectDemo;


import java.io.InputStream;
import java.lang.reflect.*;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        getClassMethods();
//        getFieldsMethods();
//        getConstructorsMethods();
//        getMethods();
//        getClassName();
    }

    /*
    获取类名：
        String getName()
     */
    private static void getClassName() {
        Class<Person> cls = Person.class;
        System.out.println(cls.getName()); // ReflectDemo.Person

    }

    /*
    - 获取成员方法们
        Method getMethod(String name, Class<?>... parameterTypes)
        Method[] getMethods()

        Method getDeclaredMethod(String name, Class<?>... parameterTypes)
        Method[] getDeclaredMethods()
     获取方法名：
        String getName()
     */
    private static void getMethods() throws Exception{
        Class<Person> cls = Person.class;

        // 获取所有被public修饰的成员方法
        // 包括类本身的成员方法和从父类中继承的方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method + " : " + method.getName());
        }


        // 获取指定名称的方法
        // 传入方法名
        Method m2 = cls.getMethod("say");
        // 执行方法
        Person p = new Person();
        m2.invoke(p); // say hello...

        // 获取指定名称和参数类型的方法
        Method m3 = cls.getMethod("show", String.class);
        System.out.println(m3); // public void ReflectDemo.Person.show(java.lang.String)

    }

    /*
    - 获取构造方法们
        Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?>[] getConstructors()

        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
        Constructor<?>[] getDeclaredConstructors()
     */
    private static void getConstructorsMethods() throws Exception {
        Class<Person> cls = Person.class;
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        /*
        public ReflectDemo.Person()
        public ReflectDemo.Person(java.lang.String,int)
         */

        Constructor<Person> c1 = cls.getConstructor(String.class, int.class);
        System.out.println(c1);  // public ReflectDemo.Person(java.lang.String,int)
        // 创建对象
        Object p1 = c1.newInstance("Forlogen", 10);
        System.out.println(p1); // Person{name='Forlogen', age=10, school='STU'}

        Constructor<Person> c2 = cls.getConstructor();
        System.out.println(c2);  // public ReflectDemo.Person()
        // 创建对象
        Object p2 = c2.newInstance();
        System.out.println(p2); // Person{name='null', age=0, school='STU'}
    }

    /*
    - 获取成员变量们
        Field getField(String name)
        Field[] getFields()

        Field getDeclaredField(String name)
        Field[]	getDeclaredFields()
     */
    private static void getFieldsMethods() throws Exception {
        Class<Person> cls = Person.class;
        // 获取被public修饰的成员变量
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f); // public java.lang.String ReflectDemo.Person.school
        }

        // 获取指定名称的被public修饰的成员变量
        Field fs = cls.getField("school");
        System.out.println(fs); // public java.lang.String ReflectDemo.Person.school

        /*
            设置值：void set(Object obj, Object value)
            获取值：get(Object obj)
         */
        Person p = new Person();
        Object value = fs.get(p);
        System.out.println(value);  // STU

        fs.set(p, "CUG");
        System.out.println(p);  // Person{name='null', age=0, school='CUG'}

        // 获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        /*
        private java.lang.String ReflectDemo.Person.name
        private int ReflectDemo.Person.age
        public java.lang.String ReflectDemo.Person.school
         */

        Field value2 = cls.getDeclaredField("age");
//        System.out.println(value2.get(p)); // Exception in thread "main" java.lang.IllegalAccessException:
        // 忽略访问权限修饰符的安全检查
        value2.setAccessible(true);  // 强制获取，暴力反射
        System.out.println(value2.get(p));  // 0


    }


    /*  获取Class对象的方式：
    - Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
    - 类名.class：通过类名的属性class获取
    - 对象.getClass()：getClass()方法在Object类中定义
    */
    private static void getClassMethods() throws ClassNotFoundException {
        Class<?> cls = Class.forName("ReflectDemo.Person");
        System.out.println(cls);  // class ReflectDemo.Person

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);  // // class ReflectDemo.Person

        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);  // // class ReflectDemo.Person

        /*
        同一个字节码文件在一次程序运行过程中，只会被加载一次
        无论通过哪一种方式获取的Class类对象都是同一个
         */
        System.out.println(cls == cls2);  // true
        System.out.println(cls == cls3);  // true

        // Class[] getTypeParameters():返回表示参数类型的Class对象数组
        TypeVariable<? extends Class<?>>[] typeParameters = cls.getTypeParameters();
        for (TypeVariable<? extends Class<?>> typeParameter : typeParameters) {
            System.out.println(typeParameter.getName());
        }

        // Class[] getExceptionTypes():返回这个方法所抛出异常类型的Class对象数组
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
//            System.out.println(method + " : " + method.getName());
            System.out.println(method.getExceptionTypes());
        }

        // int getModifiers(): 获取用int型变量标记的构造器、方法或字段的修饰符
        int modifiers = cls.getModifiers();
        System.out.println(modifiers); // 1.

        // Modifier.toString()用于将int变量标记的修饰符转换为对应的字符串
        String s = Modifier.toString(modifiers); // public
        System.out.println(s);

        // Modifier.isxxx()用于判断传入的int型变量标识的修饰符和isxxx后面的修饰符是否一致
        boolean aPublic = Modifier.isPublic(modifiers);
        System.out.println(aPublic); //true
    }

}
