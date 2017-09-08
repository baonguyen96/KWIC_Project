import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AlphabetizedCircularShiftTest extends AbstractCircularShiftTest {

    @Test
    public void testGenerateAlphabetizedCircularShiftPassSingleLineMultiWords() {
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLine1Cs);
        String[] expected = multiWordsLine1Cs;
        Arrays.sort(expected);

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testGenerateAlphabetizedCircularShiftFailSingleLineMultiWords() {
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLine1Cs);
        String[] expected = multiWordsLine1Cs;

        assertFalse(Arrays.equals(expected, actual));
    }


    @Test
    public void testGenerateAlphabetizedCircularShiftPassMultiLines() {
        int length = multiWordsLine1Cs.length + singleWordLineCs.length;
        String[] actual = new String[length];
        String[] expected = new String[length];

        // first line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLine1Cs),
                0, actual, 0, multiWordsLine1Cs.length);
        System.arraycopy(multiWordsLine1Cs, 0, expected, 0, multiWordsLine1Cs.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);

        // second line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs),
                0, actual, multiWordsLine1Cs.length, singleWordLineCs.length);
        System.arraycopy(singleWordLineCs, 0, expected, multiWordsLine1Cs.length,
                singleWordLineCs.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

}