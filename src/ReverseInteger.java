import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: algorithm
 * @description: 反转数字
 * @author: Geekye
 * @create: 2019-01-30 16:31
 **/
public class ReverseInteger {

    public static void main(String[] args) {
        int x = 153623;
        System.out.println("num before be reversed is " + x + ".");
        System.out.println("num after be reversed is " + fastestWay(x) + ".");
    }


    /**
     * use String`s .toCharArray() function to solve this question
     * for example 153623 -> 326351
     */
    private static int reverse(int x) {

        if (x == 0) {
            return x;
        }

        char[] list = String.valueOf(x).toCharArray();
        int listLength = list.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < listLength; i++) {
            char indexValue = list[listLength - i - 1];
            boolean negative = (i == 0 && list[0] == '-');
            if (negative) {
                result.append("-");
            }

            if (indexValue != '-') {
                result.append(indexValue);
            }

            if (indexValue == '0' || negative) {
                continue;
            }

        }

        if (Long.parseLong(result.toString()) > Integer.MAX_VALUE || Long.parseLong(result.toString()) < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.parseInt(result.toString());
    }


    /**
     * use / and % to solve this question
     * and I also use Lambda to map reduce those data
     */
    private static int fastestWay(int x) {

        if (x >= Integer.MAX_VALUE) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        while ((x < 0 && x > -10) || (x < 10 && x > 0) || (x / 10 != 0)) {
            int remainder = x % 10;
            list.add(remainder);
            x = (x / 10);
            if (x == 0) {
                break;
            }
            list = list.stream().map(r -> r * 10).collect(Collectors.toList());
        }

        long result = list.stream().mapToInt(p -> p.intValue()).sum();
        if (result >= Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
