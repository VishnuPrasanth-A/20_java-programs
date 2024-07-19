import java.util.Scanner;

public class countDay_fromsunday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next(); // Read the input as a String

        int n = 7;

        if (input.length() > 0) {
            char a = input.charAt(0); 

            if (a == 'M') {
                System.out.println(n - 6);
            } else if (a == 'T') {
                System.out.println(n - 5);
            } else if (a == 'W') {
                System.out.println(n - 4);
            } else if (a == 'R') {
                System.out.println(n - 3);
            } else if (a == 'F') {
                System.out.println(n - 2);
            } else if (a == 'S') {
                System.out.println(n - 1);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        s.close(); 
    }
}
