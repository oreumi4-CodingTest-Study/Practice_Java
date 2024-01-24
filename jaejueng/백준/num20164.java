import java.util.Scanner;

public class Main {

    public static int countodd(String str) {

        int cnt = 0;
        for (char ch : str.toCharArray()) {
            if (Integer.parseInt(String.valueOf(ch)) % 2 == 1 ) {
                cnt++;
            }
        }
        return cnt;
    }
    public static int minnum = Integer.MAX_VALUE;
    public static int maxnum = Integer.MIN_VALUE;
    public static void cal(int num, int cnt) {
        String str = String.valueOf(num);

        cnt += countodd(str);

        if (str.length() == 1) {
            if (maxnum < cnt)
                maxnum = cnt;
            if (minnum > cnt)
                minnum = cnt;
        }
        else if (str.length() == 2) {
            for (int i = 1; i<str.length(); i++)
                cal(Integer.parseInt(str.substring(0, i)) +
                        Integer.parseInt(str.substring(i, str.length())), cnt);
        }
        else {
            for (int i = 1; i<str.length()-1; i++)
                for (int j=i+1; j<str.length(); j++)
                    cal(Integer.parseInt(str.substring(0, i)) +
                            Integer.parseInt(str.substring(i, j)) +
                            Integer.parseInt(str.substring(j, str.length())), cnt);
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        cal(N, 0);
        System.out.println(minnum + " " + maxnum);



    }
}