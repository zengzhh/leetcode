public class _074_Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int begin = 0, end = matrix.length - 1;
        while (begin <= end) {
            int row = begin + (end - begin) / 2;
            if (matrix[row][0] == target) {
                return true;
            } else if (matrix[row][0] > target) {
                end = row - 1;
            } else {
                begin = row + 1;
            }
        }
        int row = (begin == 0) ? 0 : (begin - 1);
        int left = 0, right = matrix[0].length - 1;
        while (left <= right) {
            int col = left + (right - left) / 2;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                right = col - 1;
            } else {
                left = col + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        boolean res = new _074_Searcha2DMatrix().searchMatrix(matrix, 3);
        System.out.println(res);
    }
}
