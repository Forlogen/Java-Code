package Extends;


// 方法覆盖重写的注意事项
// 1. 必须保证父子类之间的方法名称相同，参数列表也相同
// @Override只写在方法前面，用来检测是不是有效的方法覆盖
// 2. 子类方法的返回值必须小于等于父类方法的返回值范围
// 3. 子类方法的权限必须大于等于父类方法的权限修饰符
// public > protected > (default) > private


public class OverrideTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.showInfo();
        /*
        ID is: 100
        name is: null
        classroom is: CS
        salary is: 10000
         */
    }
}
