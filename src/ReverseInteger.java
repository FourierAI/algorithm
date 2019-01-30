/**
 * @program: algorithm
 * @description: 反转数字
 * @author: Geekye
 * @create: 2019-01-30 16:31
 **/
public class ReverseInteger {

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println("num before be reversed is " + x + ".");
        System.out.println("num after be reversed is " + reverse(x) + ".");
    }


    /**
     *
     *
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

        if(Long.parseLong(result.toString()) > Integer.MAX_VALUE || Long.parseLong(result.toString()) < Integer.MIN_VALUE){
            return 0;
        }

        return Integer.parseInt(result.toString());
    }
}
