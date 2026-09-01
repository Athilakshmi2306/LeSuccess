class Solution {
    public int numRookCaptures(char[][] board) {
        int r = 0, c = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                }
            }
        }

        int count = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for (int[] d : directions) {
            int i = r + d[0];
            int j = c + d[1];

            while (i >= 0 && i < 8 && j >= 0 && j < 8) {

                if (board[i][j] == 'B') {
                    break;
                }

                if (board[i][j] == 'p') {
                    count++;
                    break;
                }

                i += d[0];
                j += d[1];
            }
        }

        return count;
    }
}