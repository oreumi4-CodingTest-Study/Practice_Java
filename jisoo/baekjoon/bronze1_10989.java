import java.io.*;
import java.util.Arrays;

public class bronze1_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        int[] nums = new int[count];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(nums);
        for (int num : nums){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
