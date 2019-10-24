public class _079_WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;
        board[i][j] = '1'; // Any character except letters
        boolean res = backtrack(board, word, i + 1, j, index + 1)
                || backtrack(board, word, i, j + 1, index + 1)
                || backtrack(board, word, i - 1, j, index + 1)
                || backtrack(board, word, i, j - 1, index + 1);
        board[i][j] = word.charAt(index);
        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(new _079_WordSearch().exist(board, "ABCFD"));
    }
}
