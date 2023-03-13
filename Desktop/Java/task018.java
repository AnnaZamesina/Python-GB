// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task018 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            ar.add(x);
        }
        System.out.println(ar.toString());

        for (int index = 0; index < ar.size(); index++) {
            if (ar.get(index) % 2 == 0) {
                ar.remove(index);
            }
        }
        System.out.println(ar.toString());

    }
}
