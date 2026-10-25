class Solution {
    public String tictactoe(int[][] moves) {
        int grid[][] = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            if (i % 2 == 0) {
                grid[row][col] = 1;
            } else {
                grid[row][col] = 2;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] != 0 && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return grid[i][0] == 1 ? "A" : "B";
            }

            if (grid[0][i] != 0 && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return grid[0][i] == 1 ? "A" : "B";
            }
        }

        if (grid[0][0] != 0 && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return grid[0][0] == 1 ? "A" : "B";
        }

        if (grid[0][2] != 0 && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return grid[0][2] == 1 ? "A" : "B";
        }

        if (moves.length == 9) {
            return "Draw";
        }

        return "Pending";
    }
}