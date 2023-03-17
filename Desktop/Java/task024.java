// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная 
// была первой в списке, а первая - последней.
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Scanner;
// public class task024 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         LinkedList<String> listLink = new LinkedList<>();
//         System.out.println("Enter string: ");
//         String str = scn.nextLine();
//         while (!str.equals("stop")) {
//             if (!str.contains("print~")) {
//                 listLink.add(str);
//             } else {
//                 String st = str.substring(6);
//                 System.out.println(st);
//                 int index = Integer.parseInt(st);
//                 System.out.println(listLink.get(index));
//                 listLink.remove(index);
//             }
//             System.out.print(listLink.toString());
//             System.out.println("Enter new string: ");
//             str = scn.nextLine();
//         }
//         scn.close();
//     }
// }
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task024 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Deque <String> queue = new LinkedList<String>();           
      
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (! str.contains("print")) {            
            queue.add(str);            
            System.out.print(queue.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        while(! queue.isEmpty()) {
            System.out.println(queue.pollLast());
        }
        System.out.print(queue.toString());
        scn.close();
    }
}
