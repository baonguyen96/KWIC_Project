import java.util.Collections;
import java.util.List;

public class AlphabetizedCircularShift implements IAlphabetizedCircularShift {

    private static List<String> lines;

    public AlphabetizedCircularShift(List<String> lines) {
        AlphabetizedCircularShift.lines = generateAlphabetizedCircularShift(lines);
    }


    private static List<String> generateAlphabetizedCircularShift(List<String> lines) {
        Collections.sort(lines);
        return lines;
    }

    public static void clear() {
        lines = null;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }

    @Override
    public void print() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
