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
    ��ȡ������
        String getName()
     */
    private static void getClassName() {
        Class<Person> cls = Person.class;
        System.out.println(cls.getName()); // ReflectDemo.Person

    }

    /*
    - ��ȡ��Ա������
        Method getMethod(String name, Class<?>... parameterTypes)
        Method[] getMethods()

        Method getDeclaredMethod(String name, Class<?>... parameterTypes)
        Method[] getDeclaredMethods()
     ��ȡ��������
        String getName()
     */
    private static void getMethods() throws Exception{
        Class<Person> cls = Person.class;

        // ��ȡ���б�public���εĳ�Ա����
        // �����౾��ĳ�Ա�����ʹӸ����м̳еķ���
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method + " : " + method.getName());
        }


        // ��ȡָ�����Ƶķ���
        // ���뷽����
        Method m2 = cls.getMethod("say");
        // ִ�з���
        Person p = new Person();
        m2.invoke(p); // say hello...

        // ��ȡָ�����ƺͲ������͵ķ���
        Method m3 = cls.getMethod("show", String.class);
        System.out.println(m3); // public void ReflectDemo.Person.show(java.lang.String)

    }

    /*
    - ��ȡ���췽����
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
        // ��������
        Object p1 = c1.newInstance("Forlogen", 10);
        System.out.println(p1); // Person{name='Forlogen', age=10, school='STU'}

        Constructor<Person> c2 = cls.getConstructor();
        System.out.println(c2);  // public ReflectDemo.Person()
        // ��������
        Object p2 = c2.newInstance();
        System.out.println(p2); // Person{name='null', age=0, school='STU'}
    }

    /*
    - ��ȡ��Ա������
        Field getField(String name)
        Field[] getFields()

        Field getDeclaredField(String name)
        Field[]	getDeclaredFields()
     */
    private static void getFieldsMethods() throws Exception {
        Class<Person> cls = Person.class;
        // ��ȡ��public���εĳ�Ա����
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f); // public java.lang.String ReflectDemo.Person.school
        }

        // ��ȡָ�����Ƶı�public���εĳ�Ա����
        Field fs = cls.getField("school");
        System.out.println(fs); // public java.lang.String ReflectDemo.Person.school

        /*
            ����ֵ��void set(Object obj, Object value)
            ��ȡֵ��get(Object obj)
         */
        Person p = new Person();
        Object value = fs.get(p);
        System.out.println(value);  // STU

        fs.set(p, "CUG");
        System.out.println(p);  // Person{name='null', age=0, school='CUG'}

        // ��ȡ���еĳ�Ա���������������η�
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
        // ���Է���Ȩ�����η��İ�ȫ���
        value2.setAccessible(true);  // ǿ�ƻ�ȡ����������
        System.out.println(value2.get(p));  // 0


    }


    /*  ��ȡClass����ķ�ʽ��
    - Class.forName("ȫ����")�����ֽ����ļ����ؽ��ڴ棬����Class����
    - ����.class��ͨ������������class��ȡ
    - ����.getClass()��getClass()������Object���ж���
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
        ͬһ���ֽ����ļ���һ�γ������й����У�ֻ�ᱻ����һ��
        ����ͨ����һ�ַ�ʽ��ȡ��Class�������ͬһ��
         */
        System.out.println(cls == cls2);  // true
        System.out.println(cls == cls3);  // true

        // Class[] getTypeParameters():���ر�ʾ�������͵�Class��������
        TypeVariable<? extends Class<?>>[] typeParameters = cls.getTypeParameters();
        for (TypeVariable<? extends Class<?>> typeParameter : typeParameters) {
            System.out.println(typeParameter.getName());
        }

        // Class[] getExceptionTypes():��������������׳��쳣���͵�Class��������
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
//            System.out.println(method + " : " + method.getName());
            System.out.println(method.getExceptionTypes());
        }

        // int getModifiers(): ��ȡ��int�ͱ�����ǵĹ��������������ֶε����η�
        int modifiers = cls.getModifiers();
        System.out.println(modifiers); // 1.

        // Modifier.toString()���ڽ�int������ǵ����η�ת��Ϊ��Ӧ���ַ���
        String s = Modifier.toString(modifiers); // public
        System.out.println(s);

        // Modifier.isxxx()�����жϴ����int�ͱ�����ʶ�����η���isxxx��������η��Ƿ�һ��
        boolean aPublic = Modifier.isPublic(modifiers);
        System.out.println(aPublic); //true
    }

}
