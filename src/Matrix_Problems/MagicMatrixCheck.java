package Matrix_Problems;

public class MagicMatrixCheck {
    public static boolean isMagicMatrix(int[][] matrix){
        int n=matrix.length;
        int targetSum=0;
        for (int j = 0; j < n; j++) {
            targetSum+=matrix[0][j];
        }

        //all row sum check
        for (int i = 1; i <n ; i++) {
            int rowSum=0;
            for (int j = 0; j < n; j++) {
                rowSum+=matrix[i][j];
            }
            if (rowSum!=targetSum){
                return false;
            }
        }
        //all column sum check
        for (int j = 0; j < n; j++) {
            int columnSum=0;
            for (int i = 0; i < n; i++) {
                columnSum+=matrix[i][j];
            }
            if (columnSum!=targetSum){
                return false;
            }
        }
        //Diagonal1 sum
        int dig1=0;
        for (int i = 0; i < n; i++) {
            dig1+=matrix[i][i];
        }
        if (dig1!=targetSum){
            return false;
        }

        //diagonal2 sum;
        int dig2=0;
        for (int i = 0; i < n; i++) {
            dig2+=matrix[i][n-1-i];
        }
        if (dig2!=targetSum){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        System.out.println(isMagicMatrix(matrix));
    }
}
