package matrix;

public class SortedMatrix {

    public void search(int[][] matrix, int n, int s_key) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == s_key) {
                System.out.println("s_key found at - " + i + " , " + j);
                return;
            }
            if (matrix[i][j] > s_key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("s_key not found in matrix");
    }

    public static void main(String... args) {
        int[][] matrix =
                {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 32, 37},
                        {32, 33, 39, 51}
                };
        SortedMatrix sortedMatrix = new SortedMatrix();
        sortedMatrix.search(matrix,matrix.length,51);
    }
}
