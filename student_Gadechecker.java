import java.util.Scanner;
public class student_Gadechecker {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int marks = n.nextInt();
        String res = (marks >=85)? "The student eligibile for the award.": "The student not eligibile for the award.";
        System.out.println(res);
    }
}
