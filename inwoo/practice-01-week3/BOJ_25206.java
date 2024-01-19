import java.util.Scanner;

public class BOJ_25206 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjectNum = 20;
        double creditSum = 0;
        double sum = 0;
        for (int i=0; i<20; i++){
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("A+")){
                sum += credit * 4.5;
            }else if (grade.equals("A0")){
                sum += credit * 4;
            }else if (grade.equals("B+")){
                sum += credit * 3.5;
            }else if (grade.equals("B0")){
                sum += credit * 3;
            }else if (grade.equals("C+")){
                sum += credit * 2.5;
            }else if (grade.equals("C0")){
                sum += credit * 2;
            }else if (grade.equals("D+")){
                sum += credit * 1.5;
            }else if (grade.equals("D0")){
                sum += credit * 1;
            }else if (grade.equals("F")){
                sum += credit * 0;
            }else if (grade.equals("P")){
                continue;
            }
            creditSum += credit;
        }
        System.out.printf("%.6f", sum/creditSum);
    }
}
