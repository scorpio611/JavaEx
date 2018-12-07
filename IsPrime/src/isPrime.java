import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int inputNumber = scanner.nextInt();

        if(inputNumber<2)
            System.out.println(inputNumber+" is not a prime");
        else {
            int count = 0;
            for(int i = 2;i<=Math.sqrt(inputNumber);i++){
                if(inputNumber%i==0) {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(inputNumber+" is a prime");
            else
                System.out.printf("%d is not a prime",inputNumber);
        }
    }
}
