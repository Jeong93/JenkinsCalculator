import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        int number1;
        int number2;
        if (command.equals("add")) {
            number1 = parseInt(scanner.next());
            number2 = parseInt(scanner.next());
            System.out.println(calculator.add(number1, number2));
        } else if (command.equals("subtract")) {
            number1 = parseInt(scanner.next());
            number2 = parseInt(scanner.next());
            System.out.println(calculator.subtract(number1, number2));
        } else if (command.equals("multiply")) {
            number1 = parseInt(scanner.next());
            number2 = parseInt(scanner.next());
            System.out.println(calculator.multiply(number1, number2));
        } else if (command.equals("divide")) {
            number1 = parseInt(scanner.next());
            number2 = parseInt(scanner.next());
            System.out.println(calculator.divide(number1, number2));
        } else if (command.equals("fibonacci")) {
            number1 = parseInt(scanner.next());
            System.out.println(calculator.fibonacciNumberFinder(number1));
        } else if (command.equals("binary")) {
            number1 = parseInt(scanner.next());
            System.out.println(calculator.intToBinaryNumber(number1));
        }
    }

}
