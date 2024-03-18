import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 11866번 요세푸스 문제 0
public class silver5_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int people = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= people; i++) {
            circle.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int i = k-1;
        while(!circle.isEmpty()){
//            while( i >= circle.size() )
//                i = i - circle.size();
            i %= circle.size();

            result.add(circle.get(i));
            circle.remove(i);
            i += k-1;
        }

        sb.append("<");
        for (int j = 0; j < result.size(); j++) {
            sb.append(result.get(j));
            if( j == result.size()-1){
                sb.append(">");
                break;
            }
            sb.append(", ");
        }

        System.out.println(sb);
    }
}

