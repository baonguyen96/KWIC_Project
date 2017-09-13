import java.util.Collections;
import java.util.List;

public class AlphabetizedCircularShift implements IAlphabetizedCircularShift {

    private static List<String> lines;

    public AlphabetizedCircularShift() {
    }

    public AlphabetizedCircularShift(List<String> lines) {
        this.lines = generateAlphabetizedCircularShift(lines);
    }


    public static List<String> generateAlphabetizedCircularShift(List<String> lines){
        Collections.sort(lines);
        return lines;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }

    @Override
    public void print() {
        for (String line: lines){
            System.out.println(line);
        }
    }

    public static void reset() {
        // clear out acsMessages (now it does not contain anything)
    }
}
