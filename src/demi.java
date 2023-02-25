import java.util.Scanner;

public class demi {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {

            int hang = 3; //thay cai so nay la hang nhap vao tu ban phim la ra em nhe

            if ((i + 1) == hang) {
                for (int j = 0; j < cols; j++) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
