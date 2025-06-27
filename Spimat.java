public class Spimat {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Traverse from Right to Left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // Traverse from Bottom to Top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
