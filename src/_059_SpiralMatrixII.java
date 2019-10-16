public class _059_SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        int j = 1;
        while (true) {
            // right
            for (int i = left; i <= right; i++) {
                res[top][i] = j++;
            }
            if (++top > bottom) break;
            // down
            for (int i = top; i <= bottom; i++) {
                res[i][right] = j++;
            }
            if (--right < left) break;
            // left
            for (int i = right; i >= left; i--) {
                res[bottom][i] = j++;
            }
            if (--bottom < top) break;
            // up
            for (int i = bottom; i >= top; i--) {
                res[i][left] = j++;
            }
            if (++left > right) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res = new _059_SpiralMatrixII().generateMatrix(3);
        Util.printMatrix(res);
    }
}
