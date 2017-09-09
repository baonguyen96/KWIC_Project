import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AlphabetizedCircularShiftTest extends AbstractCircularShiftTest {

    @BeforeEach
    void resetACS() {
        AlphabetizedCircularShift.reset();
    }

    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineMultiWords() {
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        String[] expected = multiWordsLineCs;
        Arrays.sort(expected);

        assertArrayEquals(expected, actual);
    }


    @Test
    void testGenerateAlphabetizedCircularShiftFailSingleLineMultiWords() {
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        String[] expected = multiWordsLineCs;   // unsorted

        assertFalse(Arrays.equals(expected, actual));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineSingleWords() {
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        String[] expected = singleWordLineCs;

        assertArrayEquals(expected, actual);
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassMultiLines() {
        int length = multiWordsLineCs.length + singleWordLineCs.length;
        String[] actual = new String[length];
        String[] expected = new String[length];

        // first line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs),
                0, actual, 0, multiWordsLineCs.length);
        System.arraycopy(multiWordsLineCs, 0, expected, 0, multiWordsLineCs.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);

        // second line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs),
                0, actual, multiWordsLineCs.length, singleWordLineCs.length);
        System.arraycopy(singleWordLineCs, 0, expected, multiWordsLineCs.length,
                singleWordLineCs.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassEmptyLine() {
        // single-word line
        String[] actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        String[] expected = singleWordLineCs;
        assertArrayEquals(expected, actual);

        // append empty line
        actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(emptyLineCs);
        assertArrayEquals(expected, actual);    // ACS should not change
    }

}