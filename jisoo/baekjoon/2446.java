import java.util.*;
import java.lang.*;
import java.io.*;

//2446번 별 찍기-9
public class Main {
    public static void main(String[] args) {
        int num = 0;

		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
        
        int lineCount=2*num-1;
        
        for(int j = 0; j < lineCount; j++){       
                if(j>=num){
                    for(int i = 0; i <= j; i++){
                        if(lineCount - j  -1 > i ){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }    
                }
                else{
                      for(int i = 0; i < lineCount-j; i++){                    
                        if(j > i ){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }  
                }
            if( j == lineCount-1 ) break;
            System.out.println();            
        }                    
    }        
}
