import java.util.List;

public class AlphabetizedCircularShift {

    private static List<String> lines;

    public static void generateAlphabetizedCircularShift(List<String> lines) {
        // NOTE: lines != this.lines
        // append lines to this.lines

//        Collections.sort(lines);
//        return lines;
    }

    public static void clear() {
        lines = null;
    }


    public static List<String> getLines() {
        return lines;
    }

    public static void print() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
