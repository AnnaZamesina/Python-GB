import java.io.IOError;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class task001 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner iScanner = new Scanner(System.in, "CP866"); 
        // CP866 - код для чтения русских букв
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
    }

}
