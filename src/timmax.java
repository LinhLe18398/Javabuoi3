import java.util.Scanner;

public class timmax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20)
                System.out.println("Size khong duoc qua 20");
        } while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int max = array[0];
        int index = 1;
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++){
            if(array[j] > max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println("Nguoi giau nhat trong danh sach la: " + max + ", o vi tri " + index);

    }
}
