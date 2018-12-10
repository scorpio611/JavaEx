import java.util.Scanner;

public class findMaxValueInArray2 {
    public static void main(String[] args) {
        int column,row;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows:");
        row = scanner.nextInt();

        System.out.println("Enter columns:");
        column=scanner.nextInt();

        int[][] array = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter element in "+"["+i+"]"+"["+j+"]"+" position");
                array[i][i]=scanner.nextInt();
            }
        }

        System.out.println("The array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(array[i][j]+"\t");
            }
            System.out.println("\t");
        }

        int max = array[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(array[i][j]>max)
                max=array[i][j];
            }
        }

        System.out.println("The max elements is: "+max);
    }
}
