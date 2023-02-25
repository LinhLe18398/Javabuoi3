import java.util.Scanner;

public class TinhTongCacSoO1cot {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot cua mang: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < m; i++){
            for (int j= 0; j < n; j++){
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        int SoCotCanTinh;
        System.out.println("Nhap so cot muon tinh tong cac phan tu: ");
        SoCotCanTinh = scanner.nextInt();
        if (SoCotCanTinh > n)
            System.out.println("Nhap lai so cot phu hop");

        int tongPhantuCacCot = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < A[i].length; j++){

                if (SoCotCanTinh == j){
                    tongPhantuCacCot += A[i][j];
                }
            }
        }
        System.out.println(tongPhantuCacCot);
    }
}
