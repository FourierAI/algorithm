package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithm
 * @description: eight queen question
 * @author: Geekye
 * @create: 2019-01-31 17:23
 **/
public class EightQueen {

    public static void main(String[] args) {

        List<long[]> matrix = getEightQueen();

    }

    private static List<long[]> getEightQueen() {
        List<long[]> matrix = new ArrayList<>();
        for (int i = 0; i <= 99999999; i++) {
            long [] a = new long [8];
            String str = String.valueOf(i);
            char[] chars = str.toCharArray();
            for (int j = 0; j < chars.length ; j++) {
                a[j] = Long.parseLong(String.valueOf(chars[j]));
            }
            System.out.println(Arrays.toString(a));
            matrix.add(a);
        }
        return matrix;
    }

    private static boolean checkNum(List<Integer> a, int num) {
        //判断同一行
        if (a.contains(num)) {
            return false;
        }

        //判断对角线
        for (int i = 1; i <= a.size(); i++) {
            if ((a.get(a.size() - i) + i == num) || (a.get(a.size() - i) - i == num)) {
                return false;
            }
        }

        return true;
    }


}
