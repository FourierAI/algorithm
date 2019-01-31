import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: algorithm
 * @description: eight queen question
 * @author: Geekye
 * @create: 2019-01-31 17:23
 **/
public class EightQueen {

    public static void main(String[] args) {

        List<Integer> eightQueen = Arrays.asList(0);
        List<Integer> copy = new ArrayList<>();
        Collections.copy(eightQueen, copy);
        eightQueen = getEightQueen(copy);
        System.out.println(eightQueen);
    }

    private static List<Integer> getEightQueen(List<Integer> a) {

        for (int i = 0; i < 8 || a.size() < 8; i++) {
            if (checkNum(a, i)) {
                a.add(i);
            }
            if(i == 8){
                i = 0;
            }
        }
        return a;
    }

    private static boolean checkNum(List<Integer> a, int num) {
        if (a.contains(num)) {
            return false;
        }
        if (a.contains(num + 1) || a.contains(num - 1)) {
            return false;
        }
        return true;
    }


}
