import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        char result = ' ';
        int more = Integer.MIN_VALUE;
        int count;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        ArrayList<Character> text = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            text.add(input.charAt(i));
        }

        while(text.size() > 0) {
            count = 0;
            for (int j = 0; j < text.size(); j++) {
                if(text.get(0) == text.get(j)){
                    //System.out.println("현재 0번:" + text.get(0) + "text.size:" + text.size());
                    count++;
                }
            }
            //System.out.println(text.get(0) +":" + count);
            //System.out.println(text.toString());
            if(count > more){
                more = count;
                result = text.get(0);
            }else if(count == more){
                result = '?';
            }
            text.removeIf(n -> n.equals(text.get(0)));
        }
        System.out.println(result);
    }
}
