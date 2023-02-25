public class mergearray2 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {7,8,9,10};
        int size = array1.length + array2.length;
        int [] newArray = new int[size];
        System.arraycopy(array1,0,newArray,0,array1.length);
        System.arraycopy(array2,0,newArray,array1.length,array2.length);
        for (int number:newArray) {
            System.out.println(number);
        }
    }
}
