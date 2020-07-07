package CalendarClass;

import java.util.Calendar;

/**
 * java.util.Calendar是一个抽象类，它提供了很多操作日历字段的方法（YEAR, MONTH, DAY_OF_MONTH, HOUR）
 * Calendar类无法直接创建对象使用，里面的静态方法getInstance()，返回Calendar类的子类对象
 * static Calendar getInstance()使用默认时区和语言环境获得一个日历
 *
 * 成员方法：
 *
 */
public class CalendarMain {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
