import java.util.Scanner;
public class employPerformence{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hw = s.nextInt();
        int pC = s.nextInt();
        int ot = s.nextInt();
        int total = hw + ot;
        String res = (pC >5 && total>160) ? "Mark qualified for a bouns": "Mark not qualified for the Bonus";
        System.out.println(res);
    }
}