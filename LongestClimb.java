import java.util.Scanner;

public class LongestClimb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] elevations = new int[n];

        for (int i = 0; i < n; i++) {
            elevations[i] = s.nextInt();
        }
        System.out.println(findLongestClimb(elevations));
        s.close();
    }
    

    public static int findLongestClimb(int[] elevations) {
        int longestclimb = 0;
        int currentclimb = 1;
        for (int i = 1; i < elevations.length; i++) {
            if (elevations[i] > elevations[i - 1]) {
                currentclimb++;
            } else {
                longestclimb = Math.max(longestclimb, currentclimb);
                currentclimb = 1;
            }
        }
        return Math.max(longestclimb, currentclimb);
    }
}
