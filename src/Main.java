import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap phan tu : (" + i + "," + j + ")");
                matrix[i][j] = sc.nextInt();
                if (i == j) sum += matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Tong cac phan tu tren duong cheo cua mang la : " + sum);
    }
}


//   https://github.com/nguyenchien0790/MD2-BAI3-BT7-TONGCHEO.git