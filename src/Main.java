import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String ERROR = "";

    public static void main(String[] args) {
        List<String> shiftedLines = new ArrayList<>();

        ICircularShift shifter = new CircularShift("HELLO WORLD");
        shiftedLines.addAll(shifter.getShiftedLines());

        System.out.println("circular shift");
        shifter.print();

        shifter=new CircularShift("CHOOSE A NUMBER");
        shiftedLines.addAll(shifter.getShiftedLines());

        System.out.println("circular shift");
        shifter.print();

        IAlphabetizedCircularShift alphabetizer = new AlphabetizedCircularShift(shiftedLines);
        System.out.println("alphabetised circular shift");
        alphabetizer.print();
    }

}
