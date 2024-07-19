import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Favourite_Singer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] playlist = new int[N];
        for (int i = 0; i < N; i++) {
            playlist[i] = s.nextInt();
        }
        s.close();
        int result = countFavoriteSingers(N, playlist);

        System.out.println(result);
    }

    public static int countFavoriteSingers(int N, int[] playlist) {
        Map<Integer, Integer> singerCount = new HashMap<>();
        for (int singer : playlist) {
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }

        // Step 3: Find the maximum count of songs by any singer
        int maxCount = 0;
        for (int count : singerCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Step 4: Count how many singers have this maximum count
        int favoriteSingerCount = 0;
        for (int count : singerCount.values()) {
            if (count == maxCount) {
                favoriteSingerCount++;
            }
        }

        return favoriteSingerCount;
    }
}
