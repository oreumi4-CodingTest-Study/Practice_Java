package M03.W2;

import java.util.*;

public class PGS_모음사전 {
    public static void main(String[] args) {
        String charOrder = "AEIOU";
        String word = "I";
        int dictNum = 0;
        int[] num = {781, 156, 31, 6, 1};
        for (int i = 0; i < word.length(); i++) {
            dictNum += charOrder.indexOf(word.charAt(i)) * num[i] + 1;
        }
        System.out.println(dictNum);
    }
}
