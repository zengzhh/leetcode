import java.util.ArrayList;
import java.util.List;

public class _054_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            // right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) break;
            // down
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            // left
            if (right < left) break;
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            // up
            if (bottom < top) break;
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        List<Integer> list = new _054_SpiralMatrix().spiralOrder(matrix);
        System.out.println(list);
    }

}
