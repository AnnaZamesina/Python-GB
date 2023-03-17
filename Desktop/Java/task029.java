import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task029 {
    public static Double Calc(Double num1, Double num2, char op) {
        double res = 0;
        if (op == '+') {
            res = num1 + num2;
        } else if (op == '-') {
            res = num1 - num2;
        } else if (op == '*') {
            res = num1 * num2;
        } else if (op == '/') {
            res = num1 / num2;
        }
        return res;
    }

    public static void main(String[] args) {
        Deque<Double> que_res = new LinkedList<Double>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Double a = iScanner.nextDouble();
        iScanner.nextLine();
        System.out.print("Введите номер операции +, -, *, /: ");
        char operator = iScanner.next().charAt(0);
        iScanner.nextLine();
        System.out.print("Введите второе число: ");
        Double b = iScanner.nextDouble();
        iScanner.nextLine();
        Double result = Calc(a, b, operator);
        que_res.addFirst(result);
        System.out.println("Введите строку или нажмите пробел для продолжения");
        String s = iScanner.nextLine();
        if (s.equals("answer")) {
            System.out.println(que_res.getFirst());
        }
        while (!s.equals("answer")) {
            System.out.print("Введите номер операции +, -, *, /: ");
            char nextOperator = iScanner.next().charAt(0);
            iScanner.nextLine();
            System.out.print("Введите второе число: ");
            Double c = iScanner.nextDouble();
            iScanner.nextLine();
            Double next_result = Calc(que_res.getFirst(), c, nextOperator);
            que_res.addFirst(next_result);
            System.out.println("Введите строку или нажмите пробел для продолжения");
            s = iScanner.nextLine();
            if (s.equals("cancel")) {
                que_res.removeFirst();
            }
            if (s.equals("answer")) {
                System.out.println(que_res.getFirst());
            }

        }

    }

}
