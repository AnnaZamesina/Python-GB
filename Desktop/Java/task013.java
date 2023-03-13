import java.util.Scanner;
public class task013 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter equation like '2? + ?5 = 69': ");
        String equation = iScanner.nextLine(); //2? + ?5 = 69.
        String message = "Решения нет!";
        for (int i = 0; i < 10; i++) {
            String result = equation.replace("?", Integer.toString(i));
            // 20 + 05 = 69  
            String[] arr = result.split(" ");
            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
                message = result;
        }
        System.out.println(message);
    }
}
