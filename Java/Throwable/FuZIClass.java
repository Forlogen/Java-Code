package Throwable;

/*
    子父类的异常：
        如果父类抛出了多个异常，则类重写父类方法时，抛出和父类相同的异常获知父类异常的子类或者不抛出异常
        父类没有抛出异常，子类重写父类该方法时也不可抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出

    注意：
        父类异常什么样，子类异常什么样
 */
public class FuZIClass {
    public void show1() throws NullPointerException, ClassCastException{}
    public void show2() throws IndexOutOfBoundsException{}
    public void show3() throws IndexOutOfBoundsException{}
    public void show4(){}
}

class zi extends FuZIClass{
    // 抛出和父类相同的异常
    public void show1()throws NullPointerException, ClassCastException{}

    // 抛出父类异常的子类
    public void show2() throws ArrayIndexOutOfBoundsException{}

    // 不抛出异常
    public void show3(){}

    // 父类没有抛出异常，子类抛出异常需自行处理
    public void show4(){
        try{
            throw new Exception();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
