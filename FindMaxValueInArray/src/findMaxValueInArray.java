import java.util.Scanner;

public class findMaxValueInArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if(size>20)
                System.out.println("Size can't bigger than 20");
        }while (size>20);

        int[] array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter "+(i+1)+" element");
            array[i]=scanner.nextInt();
            i++;
        }

        System.out.println("List of elements: ");
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }

        int max = array[0];
        int index=1;
        for(int k=0;k<array.length;k++){
            if(array[k]>max)
                max = array[k];
                index=k+1;
        }

        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
