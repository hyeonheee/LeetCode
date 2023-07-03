class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        int row=grid.length;
        int col=grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maxArea = Math.max(maxArea, findArea(grid, i, j));
            }
        }
        return maxArea;
    }

    public int findArea(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0)
            return 0;
        grid[r][c] = 0;
        return (1 + findArea(grid, r - 1, c) + findArea(grid, r + 1, c) + findArea(grid,r, c-1) + findArea(grid, r, c + 1));
    }
}