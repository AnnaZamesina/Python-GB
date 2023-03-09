// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class task011 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("marks.txt")))
        {
               String l = br.readLine();
               while (l != null){
                String [] words;
                words = l.split(":");
                System.out.printf("Студент " + words[1] + " получил " + words[3] + " по предмету " + words[5] + "\n");
                l = br.readLine();
               }
                br.close(); 
                
            }
        catch (IOException e){
                System.out.println("ERROR ");
            }
        }
    }
