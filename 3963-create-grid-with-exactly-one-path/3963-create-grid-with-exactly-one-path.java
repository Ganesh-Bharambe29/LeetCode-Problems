class Solution {
    public String[] createGrid(int m, int n) {
        String[][] grid=new String[m][n];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]="#";
            }
        }

        for(int i=0;i<n;i++){
            grid[0][i]=".";
        }

        for(int j=0;j<m;j++){
            grid[j][n-1]=".";
        }

        String result[]=new String[m];

        for(int i=0;i<m;i++){
            result[i]=String.join("", grid[i]);
        }

        return result;
    }
}