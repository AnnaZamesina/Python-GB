import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task033 {
    private static Map<Integer, Integer> board = new HashMap<>(8);
    private static Map<Integer, String> chess = new HashMap<>() {
        {
            put(0, "a");
            put(1, "b");
            put(2, "c");
            put(3, "d");
            put(4, "e");
            put(5, "f");
            put(6, "g");
            put(7, "h");
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            board.put(i, -1);
        }
        QueenPos(0);
    }

    public static void QueenPos(int count) {
        if (count >= 8) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < 8; i++) {
            int j;
            for (j = 0; j < count; j++) {
                if (board.get(j) == i || Math.abs(board.get(j) - i) == count - j)
                    break;
            }
            if (j == count) {
                board.put(j, i);
                QueenPos(count + 1);
            }
        }
    }

    public static void printBoard(Map<Integer, Integer> map) {

        ArrayList <String> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Integer num_int = board.get(i) + 1;
            String num_str = num_int.toString();
            result.add(chess.get(i)+ num_str);
            
        }
        System.out.println(result);
    }
}