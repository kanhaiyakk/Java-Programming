package Matrix_Problems;

import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void rotateMatrix(int[][] matrix){
        int n= matrix.length;
        //shifting
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reversing each row
        for (int i = 0; i < n; i++) {
            int j,k;
            for ( j = 0, k=n-1; j <k ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                k--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateMatrix(arr);
    }
}
