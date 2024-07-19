import java.util.Scanner;
import java.math.BigInteger;
public class Big_Integer_add_multi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number:");
        String input1 = s.next();
        BigInteger a = new BigInteger(input1);

        System.out.println("Enter the second number:");
        String input2 = s.next();
        BigInteger b = new BigInteger(input2);

        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        s.close();
    }
}

