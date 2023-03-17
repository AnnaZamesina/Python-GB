// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

// System.currentTimeMillis()
import java.util.ArrayList;
import java.util.LinkedList;

public class task021 {
    public static void main(String[] args) {
        long timeStart_1 = System.currentTimeMillis();
        ArrayList<Integer> resulList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            resulList.add(i);
        }
        long timeFinish_1 = System.currentTimeMillis();

        long timeStart_2 = System.currentTimeMillis();
        LinkedList<Integer> listlink = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            listlink.add(i);
        }

        long timeFinish_2 = System.currentTimeMillis();
        System.out.printf("The time = %d \n" ,timeFinish_1 - timeStart_1);
        System.out.printf("The time = %d \n",timeFinish_2 - timeStart_2);
    }
}