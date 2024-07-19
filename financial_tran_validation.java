import java.util.Scanner;
public class financial_tran_validation {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double trans_amount = a.nextDouble();
        double balance = a.nextDouble();
        boolean isVerified = a.nextBoolean();
        String res = (trans_amount<=balance && isVerified)? "transaction approved": "transaction declined";
        System.out.println(res);
    }
}
