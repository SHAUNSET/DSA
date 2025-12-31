class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char curr = board[row][col];

                if (curr == '.') continue;

                String rowKey = curr + " in row " + row;
                String colKey = curr + " in col " + col;
                String boxKey = curr + " in box " + (row / 3) + "-" + (col / 3);

                if (seen.contains(rowKey) ||
                    seen.contains(colKey) ||
                    seen.contains(boxKey)) {
                    return false;
                }

                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }

        return true;
    }
}
