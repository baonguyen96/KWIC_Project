import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CircularShift implements ICircularShift {

    private  List<String> lines;

    public CircularShift(String line) {
        this.lines = generateCircularShift(line);
    }

    public CircularShift() {
        this.lines = new ArrayList<>();
    }

    @Override
    public List<String> getShiftedLines() {
        return lines;
    }

    public static List<String> generateCircularShift(String msg) {
        List<String> result = new ArrayList<>();

        List<String> words = new ArrayList<>(Arrays.asList( msg.toUpperCase().split(" ")));
        int lastIndex = words.size() - 1;
        result.add(msg);
        for (int i = 0; i < lastIndex ; ++i) {
            words.add(lastIndex,words.remove(0));
            result.add(arrToString(words));
        }
        return result;
    }

    private static String arrToString(List<String> arr){
        StringBuilder builder = new StringBuilder();
        for (String node: arr) {
            builder.append(node);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public void print() {
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
