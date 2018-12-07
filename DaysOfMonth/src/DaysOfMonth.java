import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thang: ");
        int month = scanner.nextInt();

        String days;
        switch (month){
            case 2:
                days="28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days="30";
                break;
            default:
                days="";
                break;
        }
        if(days != "") System.out.printf("Tháng %d có %s ngày", month, days);
        else System.out.println("Bạn nhập sai");
    }
}
