import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter M = ");
        int m = scanner.nextInt();
        System.out.print("Enter N = ");
        int n = scanner.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[n][m];

        System.out.println("Matrix M x N");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix N x M");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
