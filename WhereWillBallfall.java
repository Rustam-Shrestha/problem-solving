public class WhereWillBallfall {

    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] result = new int[n];

        for (int col = 0; col < n; col++) {
            int currCol = col;
            for (int row = 0; row < m; row++) {
                int dir = grid[row][currCol];
                int nextCol = currCol + dir;

                // Check if ball goes out of bounds or hits a V shape
                if (nextCol < 0 || nextCol >= n || grid[row][nextCol] != dir) {
                    currCol = -1;
                    break;
                }
                currCol = nextCol;
            }
            result[col] = currCol;
        }

        return result;
    }

}