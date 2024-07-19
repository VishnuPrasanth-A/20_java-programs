import java.util.*;
import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        BigInteger n = new BigInteger(input);
        scanner.close();
        
        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
