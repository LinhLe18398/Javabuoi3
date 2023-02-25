import java.util.Scanner;

public class timminmang2chieu {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot cua mang: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.print("Nhap cac phan tu cho mang: ");
        for (int i= 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int min = A[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (min > A[i][j]){
                    min = A[i][j];
                }
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
