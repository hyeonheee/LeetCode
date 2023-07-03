class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        int row=grid.length; // 행 -
        int col=grid[0].length; // 열 ㅣ

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maxArea = Math.max(maxArea, findArea(grid, i, j));
                //maxArea 와 findArea중 큰 값을 maxArea에 저장
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