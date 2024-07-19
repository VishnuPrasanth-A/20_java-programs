import java.util.Scanner;;
public class voting_eligiblity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        String citizenship = s.next();

        String res = (age >=18 && citizenship.equalsIgnoreCase("Indian"))? "eligible to vote": "not eligible to vote";
        System.out.println(res);
    }
}
