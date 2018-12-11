import java.util.Scanner;

public class numberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) System.out.println("Out of ability");
        else {
            char[] convert = Integer.toString(number).toCharArray();
            String oneDigit = "", twoDigits = "", threeDigits = "", result = "";
            int firstNumber = Character.getNumericValue(convert[0]);
            int secondNumber = Character.getNumericValue(convert[1]);
            int thirdNumber = Character.getNumericValue(convert[2]);
        if(convert.length==1) {
            switch (firstNumber) {
                case 1:
                    oneDigit = "One";
                    break;
                case 2:
                    oneDigit = "Two";
                    break;
                case 3:
                    oneDigit = "Three";
                    break;
                case 4:
                    oneDigit = "Four";
                    break;
                case 5:
                    oneDigit = "Five";
                    break;
                case 6:
                    oneDigit = "Six";
                    break;
                case 7:
                    oneDigit = "Seven";
                    break;
                case 8:
                    oneDigit = "Eight";
                    break;
                case 9:
                    oneDigit = "Nine";
                    break;
                default:
                    oneDigit = "Nothing";
                    break;
            }
            result=oneDigit;
        }
        else if(convert.length==2) {
            if (firstNumber == 1) {
                switch (secondNumber) {
                    case 0:
                        twoDigits = "Ten";
                        break;
                    case 1:
                        twoDigits = "Eleven";
                        break;
                    case 2:
                        twoDigits = "Twelve";
                        break;
                    case 3:
                        twoDigits = "Thirteen";
                        break;
                    case 4:
                        twoDigits = "Fourteen";
                        break;
                    case 5:
                        twoDigits = "Fifteen";
                        break;
                    case 6:
                        twoDigits = "Sixteen";
                        break;
                    case 7:
                        twoDigits = "Seventeen";
                        break;
                    case 8:
                        twoDigits = "Eighteen";
                        break;
                    case 9:
                        twoDigits = "Nineteen";
                        break;

                }
            }
            else if (firstNumber < 10 && firstNumber>1) {
                switch (firstNumber) {
                    case 2:
                        twoDigits = "Twenty";
                        break;
                    case 3:
                        twoDigits = "Thirty";
                        break;
                    case 4:
                        twoDigits = "Fourty";
                        break;
                    case 5:
                        twoDigits = "Fifty";
                        break;
                    case 6:
                        twoDigits = "Sixty";
                        break;
                    case 7:
                        twoDigits = "Seventy";
                        break;
                    case 8:
                        twoDigits = "Eighty";
                        break;
                    case 9:
                        twoDigits = "Ninety";
                        break;
                }
                switch (secondNumber){
                    case 0:
                        twoDigits += "";
                        break;
                    case 1:
                        twoDigits += " One";
                        break;
                    case 2:
                        twoDigits += " Two";
                        break;
                    case 3:
                        twoDigits += " Three";
                        break;
                    case 4:
                        twoDigits += " Four";
                        break;
                    case 5:
                        twoDigits += " Five";
                        break;
                    case 6:
                        twoDigits += " Six";
                        break;
                    case 7:
                        twoDigits += " Seven";
                        break;
                    case 8:
                        twoDigits += " Eight";
                        break;
                    case 9:
                        twoDigits += " Nine";
                        break;
                }
            }
            result=twoDigits;
        }
        else if(convert.length==3){
            switch (firstNumber) {
                case 1:
                    threeDigits = "One hundred";
                    break;
                case 2:
                    threeDigits = "Two hundred";
                    break;
                case 3:
                    threeDigits = "Three hundred";
                    break;
                case 4:
                    threeDigits = "Four hundred";
                    break;
                case 5:
                    threeDigits = "Five hundred";
                    break;
                case 6:
                    threeDigits = "Six hundred";
                    break;
                case 7:
                    threeDigits = "Seven hundred";
                    break;
                case 8:
                    threeDigits = "Eight hundred";
                    break;
                case 9:
                    threeDigits = "Nine hundred";
                    break;
            }
            if (secondNumber == 1) {
                switch (thirdNumber){
                    case 0:
                        threeDigits += " and ten";
                        break;
                    case 1:
                        threeDigits += " and Eleven";
                        break;
                    case 2:
                        threeDigits += " and Twelve";
                        break;
                    case 3:
                        threeDigits += " and Thirteen ";
                        break;
                    case 4:
                        threeDigits += " and Fourteen ";
                        break;
                    case 5:
                        threeDigits += " and Fifteen ";
                        break;
                    case 6:
                        threeDigits += " and Sixteen ";
                        break;
                    case 7:
                        threeDigits += " and Seventeen ";
                        break;
                    case 8:
                        threeDigits += " and Eighteen ";
                        break;
                    case 9:
                        threeDigits += " and Nineteen ";
                        break;
                }
            }
            else if (secondNumber < 10 && secondNumber>1) {
                switch (secondNumber) {
                    case 2:
                        threeDigits += " and Twenty";
                        break;
                    case 3:
                        threeDigits += " and Thirty";
                        break;
                    case 4:
                        threeDigits += " and Fourty";
                        break;
                    case 5:
                        threeDigits += " and Fifty";
                        break;
                    case 6:
                        threeDigits += " and Sixty";
                        break;
                    case 7:
                        threeDigits += " and Seventy";
                        break;
                    case 8:
                        threeDigits += " and Eighty";
                        break;
                    case 9:
                        threeDigits += " and Ninety";
                        break;
                }
                switch (thirdNumber){
                    case 0:
                        threeDigits += "";
                        break;
                    case 1:
                        threeDigits += " One";
                        break;
                    case 2:
                        threeDigits += " Two";
                        break;
                    case 3:
                        threeDigits += " Three";
                        break;
                    case 4:
                        threeDigits += " Four";
                        break;
                    case 5:
                        threeDigits += " Five";
                        break;
                    case 6:
                        threeDigits += " Six";
                        break;
                    case 7:
                        threeDigits += " Seven";
                        break;
                    case 8:
                        threeDigits += " Eight";
                        break;
                    case 9:
                        threeDigits += " Nine";
                        break;
                }
            }
            result=threeDigits;
        }
        else {
            System.out.println("Out of ability");
        }

            System.out.println(result);
//            System.out.println(convert[1]);
        }


    }
}
