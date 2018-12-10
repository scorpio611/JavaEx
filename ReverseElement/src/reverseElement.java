import java.util.Scanner;

public class reverseElement {
    public static void main(String[] args) {
        int sizeOfArray;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter size of array: ");
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray > 20)
                System.out.println("Size can't bigger than 20");
        } while (sizeOfArray > 20);

        int[] inputArray = new int[sizeOfArray];
        int i = 0;

        while (i < inputArray.length) {
            System.out.println("Enter " + (i + 1) + " element");
            inputArray[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Elements in array: ");
        for (int j = 0; j < inputArray.length; j++) {
            System.out.println(inputArray[j] + "\t");
        }

        System.out.println("Reverse Array: ");
        for (int j = inputArray.length-1; j >= 0; j--) {
            System.out.println(inputArray[j] + "\t");
        }

    }
}
