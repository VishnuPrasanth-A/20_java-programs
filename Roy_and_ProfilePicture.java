import java.util.Scanner;

public class  Roy_and_ProfilePicture{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();  // minimum dimension required
        int N = scanner.nextInt();  // number of photos
        
        for (int i = 0; i < N; i++) {
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            
            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if (W >= L && H >= L) {
                if (W == H) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }
        }
        
        scanner.close();
    }
}
