// записать в текстовый файл слово TEST 10 раз
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task008 {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 10; i++){
            sb.append("тест");
        }
        try{
            FileWriter fr = new FileWriter(file);
            fr.write(sb.toString());
            fr.close();
            }
        catch(IOException e) {
            System.out.println("ERROR  ");
        }
    }
}