// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task010 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        StringBuilder sb = new StringBuilder();
        int[] array = { 3, 8, 1, 12, 6, 2 };
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - 1 - i; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j]);
                sb.append(" ");
            }
            sb.append("\n");
            try {
                FileWriter fr = new FileWriter(file);
                fr.write(sb.toString());
                fr.close();
            } catch (IOException e) {
                System.out.println("ERROR  ");
            }
        }
    }
}
