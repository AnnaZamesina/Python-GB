// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text

// 1. Нужно сохранить text в связный список
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


import java.util.LinkedList;
import java.util.Scanner;
import javax.sql.rowset.serial.SQLOutputImpl;

public class task022 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> listLink = new LinkedList<>();
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (!str.equals("stop")) {
            if (!str.contains("print~")) {
                listLink.add(str);
            } else {
                String st = str.substring(6);
                System.out.println(st);
                int index = Integer.parseInt(st);
                System.out.println(listLink.get(index));
                listLink.remove(index);
            }
            System.out.print(listLink.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        scn.close();
    }
}
       