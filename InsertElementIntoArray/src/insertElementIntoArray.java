import java.util.Scanner;

public class insertElementIntoArray {
    public static void main(String[] args) {
        int[] N_Array = {10, 2, 6, 9, 5, 8, 3, 4, 6, 7};
        System.out.println("The array is: ");
        for(int i =0;i<N_Array.length;i++) System.out.println(N_Array[i]);

        Scanner scanner = new Scanner(System.in);
        int inputNumber, index;

        System.out.println("Enter the number you want to insert into array: ");
        inputNumber = scanner.nextInt();
        System.out.println("Enter the index of number: ");
        index = scanner.nextInt();

        if(index<=1 || index >=N_Array.length-1){
            System.out.println("Can not insert into array");
        }
        else {
            N_Array[index-1] = inputNumber;
            System.out.println("The new array is: ");
            for(int i =0;i<N_Array.length;i++) System.out.println(N_Array[i]);
        }
    }
}
