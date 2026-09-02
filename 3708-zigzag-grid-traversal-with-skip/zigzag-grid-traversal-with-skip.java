class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> l = new LinkedList<>();

        int b = 0;

        for (int i = 0; i < grid.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < grid[0].length; j++) {
                    if (b == 0) {
                        l.add(grid[i][j]);
                        b = 1;
                    } else {
                        b = 0;
                    }
                }

            } else {

                for (int j = grid[0].length - 1; j >= 0; j--) {
                    if (b == 0) {
                        l.add(grid[i][j]);
                        b = 1;
                    } else {
                        b = 0;
                    }
                }
            }
        }

        return l;
    }
}