import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task012 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(10);
        ArrayList<Integer> list3 = new ArrayList();
        list2.add(0, 12); // добавить элемент в массив
        list2.get(0); // элемент из списка по указанной позиции
        System.out.println(list2.size());
        System.out.println(list2.get(0));
        System.out.println(list2.indexOf(12)); //Первое вхождение или -1
        list2.remove(0); //Удаление эл на указанной позиции или его возвращение
        list2.add(0, 22); 
        list2.add(1,2);
        list2.sort(null);
        list2.subList(0, 1); //получение эл в диапазоне позиций
        int day = 29;
        int month = 4;
        int year = 1997;
        Integer [] date = {day , month, year};
        List <Integer> d = Arrays.asList(date);

    }
}