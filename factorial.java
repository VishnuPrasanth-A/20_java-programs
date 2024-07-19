import java.util.Scanner;

public class factorial{
    public static void main(String[]args){
        Scanner s1 =new Scanner(System.in);

        int n = s1.nextInt();
        s1.close();
        
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
} 
