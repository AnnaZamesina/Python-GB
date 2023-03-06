
public class task002_simpleNumbers {
    public static void main(String[] args) {
        int high_border = 1000;
        for (int i = 2; i < high_border + 1; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count++;

            }
            if (count < 2)
            System.out.println(i);
        }
    }
}
