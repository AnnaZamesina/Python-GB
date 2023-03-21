// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
import java.util.HashMap;
import java.util.Map;

public class task035 {
    public static void main(String[] args) {
        String[] name = {"Иван", "Светлана", "Кристина", "Анна", "Анна", "Иван",
                "Петр", "Павел", "Петр", "Мария", "Марина", "Мария", "Мария", "Марина", "Анна", "Иван", "Петр", "Иван"};

        HashMap<String, Integer> workers_list = new HashMap<>();
        for (String i : name) {
            int count_value = workers_list.getOrDefault(i, 0) + 1;
            workers_list.put(i, count_value);
        }
        System.out.println(workers_list);
        int max = 1;
        for (int value : workers_list.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : workers_list.entrySet()) {
                String key = entry.getKey();
                if (workers_list.get(key) == i) {                    
                    System.out.format("%s %d \n", key, workers_list.get(key));

                }
            }
        }

    }
}