public class _031_NextPermutation {

    public void nextPermutation(int[] A) {
        if (A == null || A.length <= 1) return;
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) i--;
        if (i >= 0) {
            int j = A.length - 1;
            while (A[i] >= A[j]) j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, A.length - 1);
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j) {
        while (i < j) swap(A, i++, j--);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 8, 4, 7, 6, 5, 3, 1};
        new _031_NextPermutation().nextPermutation(nums);
        Util.printNums(nums);
    }
}
