import java.util.Scanner;
public class palindromenumber{
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(isPalindrome(x));
        s.close();
    }
}

