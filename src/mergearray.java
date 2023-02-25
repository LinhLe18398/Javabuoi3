import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {7,8,9,10};
        int size = array1.length + array2.length;
        int [] newArray = new int[size];

        for (int i=0; i<array1.length;i++){
            newArray[i] =  array1[i];

        }
        int index = 0;
        for(int i = array1.length; i < newArray.length; i++){
            newArray[i] = array2[index];
            index++;

        }
        for (int number: newArray) {
            System.out.println(number);
        }
    }
}
