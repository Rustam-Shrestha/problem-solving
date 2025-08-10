public class NoOfIslands {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) return 0;

            int count = 0;
            int rows = grid.length;
            int cols = grid[0].length;

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (grid[r][c] == '1') {
                        count += 1;
                        dfs(grid, r, c);
                    }
                }
            }

            return count;
        }

        public void dfs(char[][] grid, int row, int col) {
            int rows = grid.length;
            int cols = grid[0].length;

            if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0') {
                return;
            }

            grid[row][col] = '0';

            dfs(grid, row + 1, col);
            dfs(grid, row - 1, col);
            dfs(grid, row, col + 1);
            dfs(grid, row, col - 1);
        }


}
