import java.util.Scanner;

public class remove_Duplicate {    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        remove_Duplicate solution = new remove_Duplicate();
        int n = s.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        s.close();

        int ret = solution.removeDuplicates(nums);
        System.out.println(ret);
        for (int i = 0; i < ret; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
