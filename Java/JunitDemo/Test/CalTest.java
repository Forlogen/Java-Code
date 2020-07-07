package JunitDemo.Test;

import JunitDemo.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalTest {
    /*
    初始化：用于资源的申请，所有测试方法执行前都会执行该方法
    加注解@before
     */
    @Before
    public void init(){
        System.out.println("init...");
    }


    @Test
    public void testAdd(){
        System.out.println("testing add method...");
        Calculator c = new Calculator();
        // System.out.println(c.add(2, 3));
        int res = c.add(2, 3);
        // 断言
        Assert.assertEquals(5, res);
    }

    @Test
    public void testSub(){
        System.out.println("testing sun method...");
        Calculator c = new Calculator();
        // System.out.println(c.add(2, 3));
        int res = c.sub(2, 3);
        // 断言
        Assert.assertEquals(-1, res);
    }

    /*
    释放资源方法：所有的测试方法执行完毕后都会执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
}
