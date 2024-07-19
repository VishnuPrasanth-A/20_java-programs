public class findMedianSortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int imin = 0, imax = m, half_len = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = half_len - i;
            if (i < m && nums2[j-1] > nums1[i]) {
                imin = i + 1;
            } else if (i > 0 && nums1[i-1] > nums2[j]) {
                imax = i - 1;
            } else {
                int max_of_left = 0;
                if (i == 0) { max_of_left = nums2[j-1]; }
                else if (j == 0) { max_of_left = nums1[i-1]; }
                else { max_of_left = Math.max(nums1[i-1], nums2[j-1]); }
                if ( (m + n) % 2 == 0 ) {
                    int min_of_right = 0;
                    if (i == m) { min_of_right = nums2[j]; }
                    else if (j == n) { min_of_right = nums1[i]; }
                    else { min_of_right = Math.min(nums1[i], nums2[j]); }
                    return (max_of_left + min_of_right) / 2.0;
                } else {
                    return max_of_left;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        findMedianSortedArr solution = new findMedianSortedArr();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double ret = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(ret);
    }
}
