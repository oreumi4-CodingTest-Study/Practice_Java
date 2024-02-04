import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean mixed = false;
        int[] scale = new int[8];
        for (int i = 0; i < scale.length; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < scale.length-1; i++) {
            if(scale[i]-scale[i+1] != 1 && scale[i]-scale[i+1] != -1){
                System.out.println("mixed");
                mixed = true;
                break;
            }
        }
        if(!mixed && scale[0]-scale[1] == 1){
            System.out.println("descending");
        }else if(!mixed && scale[0]-scale[1] == -1){
            System.out.println("ascending");
        }
    }
}
