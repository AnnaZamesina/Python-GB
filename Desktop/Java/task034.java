import java.text.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.lang.model.element.Element;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568
public class task034 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        addNewContact(data);
    }

    public static void addNumber(Map<Integer, String> map) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите номер функции: (1 - Добавить номер телефона, 2 - Вывод всех номеров абонента, 3 - выход)  ");
        String num = scn.nextLine();
        System.out.println("Введите фамилию");
        String name = scn.nextLine();
        String next_num = "";
        while (!next_num.equals("3")) {
            System.out.print("Введите номер функции: (1 - Добавить номер телефона, 2 - Вывод всех номеров абонента, 3 - выход)  ");
            next_num = scn.nextLine();
            switch (next_num) {
                case "3":
                    break;
                case "2":
                    for (var element : map.entrySet()) {
                        if (element.getValue().equals(name)) {
                            System.out.println("Номер абонента" + " " + name + ": " + element.getKey());
                        }
                    }
                    break;
                case "1":
                    System.out.println("Введите номер");
                    Integer next_phone_number = scn.nextInt();
                    scn.nextLine();
                    map.put(next_phone_number, name);
                default:
                    break;
            }
        }
    }
    public static void addNewContact(Map<Integer, String> map) {
        Scanner scn = new Scanner(System.in);
        String next_command = "";
        while (!next_command.equals("3")) {
            System.out.print("Введите номер функции: (1 - Добавить новый контакт, 2 - Вывод всего, 3 - выход)  ");
            next_command = scn.nextLine();
            switch (next_command) {
                case "1":
                    addNumber(map);
                    break;
                case "2":
                
                for (var element : map.entrySet()) {
                    System.out.printf("Имя абонента: %s; Телефон: %s \n", element.getValue(), element.getKey());
                }
                case "3":
                    break;
                default:
                    break;
            }
        }
    }

}