/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticCalculator 
{
    public double calculate(double x, double y, ArithmeticOperation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}

enum ArithmeticOperation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}
class ArithmeticInput {
    private double x;
    private double y;

    public void setNumbers(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ArithmeticOperation getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = scanner.next().toUpperCase();
        return ArithmeticOperation.valueOf(input);
    }
}





public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        ArithmeticInput input = new ArithmeticInput();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        input.setNumbers(x, y);

        ArithmeticOperation operation = input.getOperationFromUser();

        double result = calculator.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}



