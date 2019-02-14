package offer;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 左旋字符串
 * @author: Geekye
 * @create: 2019-02-14 13:58
 **/
public class LeftReverseWords {

    /**
     * @description 对于一个字符串，和字符串中的某一位置，请设计一个算法，
     * 将包括i位置在内的左侧部分移动到右边，将右侧部分移动到左边。
     * 给定字符串A和它的长度n以及特定位置p，请返回旋转后的结果。
     * 测试样例：
     * "ABCDEFGH",4
     * 返回："EFGHABCD"
     */

    public static void main(String[] args) {
        String originalString = "ABCDEFGH";

        String resultString = leftReverseWords(originalString, 3);
        System.out.println(resultString);
    }


    public static String leftReverseWords(String originalString, int offset) {
        char[] originChars = originalString.toCharArray();
        char[] tempChars1 = new char[originChars.length - 3];

        for (int i = 0; i < tempChars1.length; i++) {
            tempChars1[i] = originChars[i + 3];
        }
        char[] tempChars2 = Arrays.copyOfRange(originChars, 0, offset);

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : tempChars1
                ) {
            stringBuilder.append(c);
        }

        for (char c : tempChars2
                ) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
