import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);

        int a[] = new int[3];
        boolean pass = false;
        String total = "";

        do{
            for(int i = 0; i<3; i++){
                a[i] = scanNum.nextInt();
            }

            if(a[0] <= 100000 && a[0] >= 1 && a[1] <= 100000 && a[1] >= 1 && a[2] <= 1000000 && a[2] >= 1)
            {
                long temp = a[0];
                long b = 0;

                for(int j = 1; j <= Math.ceil(a[2]/10f) ; j++){
                    b = temp * (long)Math.pow(10,10);
                    if(j==1){
                        total = String.valueOf(b/a[1] - (temp/a[1])*(long)Math.pow(10,10));
                    }else{
                        total = String.valueOf(b/a[1]);
                    }
                    temp = (int)(b%a[1]);
                    if(temp == 0){
                        break;
                    }
                }
                if(temp == 0 && a[2]>10){
                    System.out.println(0);
                }else{
                    System.out.println(total.charAt((a[2]-1)%10));
                }

                pass = true;
            }
        }while(pass == false);
    }
}
