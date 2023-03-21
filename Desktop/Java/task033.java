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

        for (int row = 0; row < 8; row++) {
            int col;
            for (col = 0; col < count; col++) {
                if (board.get(col) == row || Math.abs(board.get(col) - row) == count - col)
                    break;
            }

            if (col == count) {
                board.put(col, row);
                QueenPos(count + 1);
            }
        }
    }

    public static void printBoard(Map<Integer, Integer> map) {

        StringBuilder result = new StringBuilder("Вариант расстановки: ");
        for (int i = 0; i < 8; i++) {
            result.append(chess.get(i));
            result.append(board.get(i) + 1);
            if (i < 7) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}