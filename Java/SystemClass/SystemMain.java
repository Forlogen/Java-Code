package SystemClass;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);  // 1587609427487

        int[] src = new int[]{1,2,3,4};
        int[] dest = new int[]{5,6,7,8};
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));  // [1, 2, 3, 8]
    }
}
