import java.util.Scanner;

public class xoaphantutrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Nhap size mang: ");
        size = scanner.nextByte();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        int indexFind = -1;
        for (int i = 0; i < size; i++) {
            if (k == array[i]) {
                indexFind = i;
                System.out.println("vi tri phan tu can xoa la vi tri thu: " + i);
                break;
            }
        }

        int[] newArr = new int[size-1];

        if (indexFind < 0) {
            System.out.println("Khong tim thay vi tri cua phan tu");
        } else {
            for (int i = 0; i < size - 1; i++) {
                if (i >= indexFind) {
                    newArr[i] = array[i+1];
                }else{
                    newArr[i] = array[i];
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");

        }

    }
}
