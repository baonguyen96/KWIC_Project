import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularShift {

    private static List<String> lines;

    public static void generateCircularShift(String msg) {
        lines = new ArrayList<>();

        List<String> words = new ArrayList<>(Arrays.asList(msg.toUpperCase().split(" ")));
        int lastIndex = words.size() - 1;
        lines.add(msg);
        for (int i = 0; i < lastIndex; ++i) {
            words.add(lastIndex, words.remove(0));
            lines.add(arrToString(words));
        }
    }

    private static String arrToString(List<String> arr) {
        StringBuilder builder = new StringBuilder();
        for (String node : arr) {
            builder.append(node);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static List<String> getShiftedLines() {
        return lines;
    }


    public static void print() {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void clear() {
        lines = null;
    }

}
