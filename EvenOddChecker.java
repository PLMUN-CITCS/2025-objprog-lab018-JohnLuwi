import java.util.Scanner;

public class EvenOddChecker {
    public static int getIntegerInput(){
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true){
            System.out.print("Enter an integer: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }            
        }

        return number;
    
    }
        
        public static String checkEvenorOdd(int number) {
            if (number % 2 == 0) {
                return number + " is an Even number.";
            } else {
                return number + " is an Odd number.";
            }
        }
        public static void main(String[] args) {
            int userInput = getIntegerInput();
            String result =
            checkEvenorOdd(userInput);
            System.out.println(result);
        }
}
