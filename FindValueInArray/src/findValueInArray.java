import java.util.Scanner;

public class findValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String input_name = scanner.nextLine();
        boolean check=false;
        for(int i = 0;i<students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of the student "+input_name+" in list is "+(i+1));
                check=true;
                break;
            }
        }
        if(!check) {
            System.out.println("Can't found "+input_name+" in list");
        }
    }
}
