import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task020 {

    public static void split(ArrayList<Integer> ar, Integer n) {
        if (n < 2) {
            return;
        }
        Integer mid = n / 2;
        ArrayList<Integer> ar1 = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            ar1.add(ar.get(i));
        }
        ArrayList<Integer> ar2 = new ArrayList<>();
        for (int j = mid; j < ar.size(); j++) {
            ar2.add(ar.get(j));
        }
        split(ar1, ar1.size());
        split(ar2, ar2.size());
        Merge(ar, ar1, ar2, ar1.size(), ar2.size());
    }

    public static void Merge(ArrayList<Integer> input, ArrayList<Integer> left, ArrayList<Integer> right,
            Integer ind_left,
            Integer ind_right) {
        Integer i = 0;
        Integer j = 0;
        Integer k = 0;
        while ((i < ind_left) && (j < ind_right)) {
            if (left.get(i) < right.get(j)) {
                input.set(k, left.get(i));
                k++;
                i++;

            } else {
                input.set(k, right.get(j));
                k++;
                j++;
            }

        }
        while (i < ind_left) {
            input.set(k++, left.get(i++));
        }
        while (j < ind_right) {
            input.set(k++, right.get(j++));
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 2, 45, 35, 75, 180, 12));
        System.out.println(ar.toString());
        split(ar, ar.size());
        System.out.println(ar);
    }
}
