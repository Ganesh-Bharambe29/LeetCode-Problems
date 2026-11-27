class Solution {
    public void setZeroes(int[][] matrix) {
        int idx[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    idx[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < idx.length; i++) {
            for (int j = 0; j < idx[0].length; j++) {
                if (idx[i][j] == 1) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = 0;
                    }

                    for (int m = 0; m < matrix.length; m++) {
                        matrix[m][j] = 0;
                    }
                }
            }
        }

    }
}