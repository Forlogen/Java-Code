package JunitDemo.Test;

import JunitDemo.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalTest {
    /*
    ��ʼ����������Դ�����룬���в��Է���ִ��ǰ����ִ�и÷���
    ��ע��@before
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
        // ����
        Assert.assertEquals(5, res);
    }

    @Test
    public void testSub(){
        System.out.println("testing sun method...");
        Calculator c = new Calculator();
        // System.out.println(c.add(2, 3));
        int res = c.sub(2, 3);
        // ����
        Assert.assertEquals(-1, res);
    }

    /*
    �ͷ���Դ���������еĲ��Է���ִ����Ϻ󶼻�ִ�и÷���
     */
    @After
    public void close(){
        System.out.println("close...");
    }
}
