import java.util.Scanner;

public class timaxmang2chieu {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cho mang: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot cho mang: ");
        n = scanner.nextInt();
        int A [][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j++){
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat cua mang la: " + max);
    }

}
