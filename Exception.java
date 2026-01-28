import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        try {
            System.out.print("Enter first integer: ");
            a = sc.nextInt();

            System.out.print("Enter second integer: ");
            b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers!");
        } 
        finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}
