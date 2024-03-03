import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordCount = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        while(wordCount-- > 0){
            words.add(br.readLine());
        }
        List<String> wordList = new ArrayList<>(words);
        wordList.sort(Comparator.comparing(String::toString));
        wordList.sort(Comparator.comparing(String::length));

        for (String word : wordList){
            System.out.println(word);
        }
    }
}
