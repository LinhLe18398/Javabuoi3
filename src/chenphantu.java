import java.util.Scanner;

public class chenphantu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M[] = new int[100];
        System.out.print("Nhap so phan tu thuc te ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            M[i] = input.nextInt();
        }

        for (int i = 0; i< n; i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        System.out.println("Nhap gia tri can chen: ");
        int gt = input.nextInt();
        System.out.print("Vi tri chen: ");
        int vt = input.nextInt();
        for (int i = n-1; i >= vt; i--){
            M[i+1] = M[i];
        }
        M[vt] = gt;
        n++;
        for (int i = 0; i< n; i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
    }
}
