public class _004_MedianofTwoSortedArrays {

    /**
     * O(log(min(m,n)))
     *
     * Assuming that N1 < N2
     * N1 = nums1.length
     * N2 = nums2.length
     * len = N1 + N2
     * cut1: number of elements on the left of nums1
     * cut2: number of elements on the left of nums2
     *
     * index:  0   1   2   3   4   5
     *
     *             L1  R1
     * nums1:  3   5 | 8   9             N1:4, cut1:2, L1:nums1[cut1-1], R1:nums1[cut1]
     * nums2:  1   2   7 | 10  11  12    N2:6, cut2:3, L2:nums2[cut2-1], R2:nums2[cut2]
     *                 L2  R2
     *
     * nums3 -> nums1 + nums2
     * nums3:  1  2  3  5  7 | 8  9  10  11  12
     *
     * if L1 <= R2 && R1 >= L2, finish.
     *
     * Assuming that cut1's range: [cutL, cutR]
     * init, [cutL, cutR] = [0, N1]
     * while(cut1 <= N1) {
     *   cut1 = (cutR - cutL)/2 + cutL
     *   cut2 = len / 2 - cut1
     *   if L1 > R2, cutR = cut1 - 1
     *   else if L2 > R1, cutL = cut1 + 1
     *   else, return
     * }
     *
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N1 = nums1.length;
        int N2 = nums2.length;
        if (N1 > N2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int len = N1 + N2;
        int cutL = 0, cutR = N1;
        int cut1 = N1 / 2;
        int cut2 = len / 2 - cut1;

        while (cut1 <= N1) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = len / 2 - cut1;
            int L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int R1 = (cut1 == N1) ? Integer.MAX_VALUE : nums1[cut1];
            int R2 = (cut2 == N2) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                // shift to the left
                cutR = cut1 - 1;
            } else if (R1 < L2) {
                // shift to the right
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    double m1 = (L1 > L2) ? L1 : L2;
                    double m2 = (R1 < R2) ? R1 : R2;
                    return (m1 + m2) / 2;
                } else {
                    double m = (R1 < R2) ? R1 : R2;
                    return m;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4, 5};
        double res = new _004_MedianofTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(res); //3.0
    }
}
