import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int target = 8;
        int[] indexes = cleverWay(nums, target);
        Arrays.sort(indexes);
        StringBuilder result = new StringBuilder();
        result.append("Array‘s indexes are ");
        for (int i = 0; i < indexes.length; i++) {
            if (i == (indexes.length - 1)) {
                result.append(indexes[i] + " !");
            } else {
                result.append(indexes[i] + " and ");
            }
        }

        System.out.println(result.toString());
    }

    private static int[] simpleWay(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    private static int[] cleverWay(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (Integer key : map.keySet()
                ) {
            if (map.get(target - map.get(key)) != null) {
                indexes[0] = map.get(key);
                indexes[1] = map.get(target - key);
            }
        }

        return indexes;
    }
}
