package Solution.March_2nd.Bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 4153번 직각삼각형 브론즈3
과거 이집트인들은 각 변들의 길이가 3,4,5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오
 */
public class beakjoon_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempLines = "";

        while(true) {
            tempLines = br.readLine();
            if (tempLines.equals("0 0 0"))
                break;

            List<Integer> lines = Arrays.stream(tempLines.split(" ")).map(x -> Integer.parseInt(x)).sorted().collect(Collectors.toList());

            if (Math.pow(lines.get(2),2)==Math.pow(lines.get(0),2)+Math.pow(lines.get(1),2))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
