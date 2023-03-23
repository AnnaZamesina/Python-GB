import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import javax.lang.model.element.Element;

import FINAL_jAVA.Notebook;

public class start {

         
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Dell", 8, 8, "Windows", "grey", 100);
        Notebook notebook2 = new Notebook("Mac", 16, 16, "MAC OS", "white", 1000);
        Notebook notebook3 = new Notebook("Samsung", 32, 128, "Windows", "black", 150);
        Notebook notebook4 = new Notebook("Honor", 64, 64, "Linux", "white", 300);
        Notebook notebook5 = new Notebook("Dell", 128, 64, "Linux", "black", 700);
        Set<Notebook> set = new HashSet<>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        Scanner scn = new Scanner(System.in);
        System.out.println(
                "Введите номер критерия: 1 - модель, 2 - ОЗУ, 3 - Объем ЖД, 4 - Операционная система, 5 - Цвет, 6 - Цена");
        String firstFilter = scn.nextLine();
        Set <String> filterSetString = new LinkedHashSet<>();
        Set<Integer> filterSetInt = new LinkedHashSet<>();
        switch (firstFilter) {
            case "1":
                filterSetString.add(notebook1.getModel());
                filterSetString.add(notebook2.getModel());
                filterSetString.add(notebook3.getModel());
                filterSetString.add(notebook4.getModel());
                filterSetString.add(notebook5.getModel());
                PrintSTRArray(filterSetString);
                System.out.println("Напишите уточняющий критерий");
                String secondFilter = scn.nextLine();
                for (Notebook element : set) {
                    if (element.getModel().toLowerCase().equals(secondFilter)) {
                        System.out.println(element);
                    }
                }
                break;
                case "2":
                filterSetInt.add(notebook1.getRAM());
                filterSetInt.add(notebook2.getRAM());
                filterSetInt.add(notebook3.getRAM());
                filterSetInt.add(notebook4.getRAM());
                filterSetInt.add(notebook5.getRAM());
                PrintINTArray(filterSetInt);
                System.out.println("Напишите уточняющий критерий");
                Integer secondFilter02 = scn.nextInt();
                for (Notebook element : set) {
                    if (element.getRAM() == secondFilter02) {
                        System.out.println(element);
                    }
                }
                break;
                case "3":
                filterSetInt.add(notebook1.getHDV());
                filterSetInt.add(notebook2.getHDV());
                filterSetInt.add(notebook3.getHDV());
                filterSetInt.add(notebook4.getHDV());
                filterSetInt.add(notebook5.getHDV());
                PrintINTArray(filterSetInt);
                System.out.println("Напишите уточняющий критерий");
                Integer secondFilter03 = scn.nextInt();
                for (Notebook element : set) {
                    if (element.getHDV() == secondFilter03) {
                        System.out.println(element);
                    }
                }
                break;
                case "4":
                filterSetString.add(notebook2.getOperatingSystem());
                filterSetString.add(notebook3.getOperatingSystem());
                filterSetString.add(notebook4.getOperatingSystem());
                PrintSTRArray(filterSetString);
                System.out.println("Напишите уточняющий критерий");
                String secondFilter04 = scn.nextLine();
                for (Notebook element : set) {
                    if (element.getOperatingSystem().toLowerCase().equals(secondFilter04)) {
                        System.out.println(element);
                    }
                }
                break;
                case "5":
                filterSetString.add("black");
                filterSetString.add("white");
                filterSetString.add("grey");
                System.out.println(filterSetString);
                System.out.println("Напишите уточняющий критерий");
                String secondFilter05 = scn.nextLine();
                for (Notebook element : set) {
                    if (element.getColor().equals(secondFilter05.toLowerCase())) {
                        System.out.println(element);
                    }
                }
                break;
                case "6":
                filterSetString.add("100");
                filterSetString.add("150");
                filterSetString.add("300");
                filterSetString.add("700");
                filterSetString.add("1000");
                System.out.println(filterSetString);
                System.out.println("Напишите уточняющий критерий");
                Integer secondFilter06 = scn.nextInt();
                for (Notebook element : set) {
                    if (element.getPrice()==secondFilter06) {
                        System.out.println(element);
                    }
                }
                break;


        
    }


    }
    public static void PrintSTRArray(Set <String> StrSet) {
        Iterator <String> j = StrSet.iterator();
                int count=1;
                while (j.hasNext()) {
                    System.out.printf("%d - %s\n", count, j.next());
                    count++;
                }
    }
    public static void PrintINTArray(Set <Integer> IntSet) {
        Iterator <Integer> j = IntSet.iterator();
                int count=1;
                while (j.hasNext()) {
                    System.out.printf("%d - %s\n", count, j.next());
                    count++;
                }
    }
}
              