import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;


public class beakjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int listLength = Integer.parseInt(sc.readLine());
        String[] lyrics = new String[listLength];

        for (int i = 0; i < listLength; i++) {
            lyrics[i] = sc.readLine();
        }

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(lyrics));
        lyrics = hashSet.toArray(new String[0]);
        Arrays.sort(lyrics);
        for (int i = 0; i < lyrics.length; i++) {
            for (int j = 0; j < lyrics.length-1-i; j++) {
                if (lyrics[j].length() > lyrics[j+1].length()){
                    String temp = lyrics[j];
                    lyrics[j] = lyrics[j+1];
                    lyrics[j+1] = temp;
                }
            }
        }
        for(String str : lyrics){
            System.out.println(str);
        }
    }
}