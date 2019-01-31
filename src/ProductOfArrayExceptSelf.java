import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 
 * @author: Geekye
 * @create: 2019-01-31 15:00
 **/
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] origin = new int[]{30000, 5000, 200000, 6000, 8000};
        StringBuilder stringBuilder1 = new StringBuilder();
        Arrays.stream(origin).forEach(num -> stringBuilder1.append(num + " "));
        System.out.println("原来的数组内容：" + stringBuilder1.toString());
        int[] result = productExceptSelf(origin);
        StringBuilder stringBuilder2 = new StringBuilder();
        Arrays.stream(result).forEach(num -> stringBuilder2.append(num + " "));
        System.out.println("生成后的数组内容：" + stringBuilder2.toString());

    }

    /**
     * unfinished
     * to be continued
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        r[r.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; --i) {
            r[i] = r[i + 1] * nums[i + 1];
        }
        int t = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            r[i] = r[i] * t;
            t *= nums[i];
        }
        return r;
    }

}
