import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task019 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            array1.add(x);
        }
        System.out.println(array1.toString());
        System.out.println(Collections.max(array1));
        System.out.println(Collections.min(array1));
        double sum = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum += array1.get(i);
        }
        double average = sum / (array1.size());
        System.out.println(average);

    }
}
