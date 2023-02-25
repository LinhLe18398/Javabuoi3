import java.util.Scanner;

public class tinhduongcheo {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        n = scanner.nextInt();
        int [][] A = new int[m][n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i==j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
