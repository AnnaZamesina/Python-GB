import java.util.Scanner;

public class task003_Calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = iScanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = iScanner.nextDouble();
        System.out.print("Введите номер операции +, -, *, /: ");
        char operator = iScanner.next().charAt(0);
        double res = 0;
        if (operator == '+') {
            res = a + b;
            System.out.printf(a + " " + operator + " " + b + " = " + res);
        } else if (operator == '-') {
            res = a - b;
            System.out.printf(a + " " + operator + " " + b + " = " + res);
        } else if (operator == '*') {
            res = a * b;
            System.out.printf(a + " " + operator + " " + b + " = " + res);
        } else if (operator == '/') {
            res = a / b;
            System.out.printf(a + " " + operator + " " + b + " = " + res);
        }
    }
}
