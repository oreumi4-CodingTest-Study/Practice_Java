package silver;

import java.io.*;
import java.util.*;

public class num7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people.add(new Person(weight, height));
        }

        for (int i = 0; i < n; i++) {
            int rank=1;
            for (int j = 0; j < n; j++) {
                if(people.get(i).height<people.get(j).height && people.get(i).weight<people.get(j).weight){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }

    static class Person {
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
}
