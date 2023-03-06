import java.util.Scanner;

public class task001_factorial {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = iScanner.nextInt();
        int count = 0;
        int sum = 0;
        int factorial = 1;
        while (count <= n) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
        count = 1;
        while (count <= n) {
            factorial = factorial * count;
            count++;
        }
        System.out.println(factorial);
    }
}
