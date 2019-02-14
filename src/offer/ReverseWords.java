package offer;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 剑指Offer-翻转单词
 * @author: Geekye
 * @create: 2019-02-14 13:30
 **/
public class ReverseWords {

    /**
     * @description: 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
     * 有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
     * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     */

    public static void main(String[] args) {

        String originalString = "student. a am I";


        String[] strings = originalString.split(" ");

        String[] reversedStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            reversedStrings[strings.length - i - 1] = strings[i];
        }

        String resultString = StringUtils.join(Arrays.asList(reversedStrings), " ");
        System.out.println(resultString);
    }

}
