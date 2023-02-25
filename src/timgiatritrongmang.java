import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String [] students = {"Linh Le", "Cat Hai", "Tra My", "Tu Anh", "Duc Vinh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien muon tim: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0;i< students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Vi tri cua sinh vien trong list " + input_name + " la: "+i);
                isExist = true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found" + input_name + "in the list");
    }
}
