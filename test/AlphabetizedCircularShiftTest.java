import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AlphabetizedCircularShiftTest extends AbstractCircularShiftTest {

    @BeforeEach
    void resetACS() {
        AlphabetizedCircularShift.reset();
    }

    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineMultiWords() {
        List<String> actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        List<String> expected = multiWordsLineCs;
        Collections.sort(expected);

        assertThat(actual,is(expected));
    }


 /**   @Test
    void testGenerateAlphabetizedCircularShiftFailSingleLineMultiWords() {
        List<String> actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        List<String> expected = multiWordsLineCs;   // unsorted

        assertFalse(Arrays.equals(expected, actual));
    }**/


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineSingleWords() {
        List<String> actual= AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        List<String> expected= singleWordLineCs;

        assertThat(actual,is(expected));
    }


/**    @Test
    void testGenerateAlphabetizedCircularShiftPassMultiLines() {
        int length = multiWordsLineCs.size() + singleWordLineCs.size();
        List<String> actual = new ArrayList<>(length);
        List<String> expected = new ArrayList<>(length);

        // first line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs),
                0, actual, 0, multiWordsLineCs.size());
        System.arraycopy(multiWordsLineCs, 0, expected, 0, multiWordsLineCs.size());
        Collections.sort(expected);
        assertThat(actual,is(expected));

        // second line
        System.arraycopy(AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs),
                0, actual, multiWordsLineCs.size(), singleWordLineCs.size());
        System.arraycopy(singleWordLineCs, 0, expected, multiWordsLineCs.size(),
                singleWordLineCs.size());
        Collections.sort(expected);
        assertThat(actual,is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassEmptyLine() {
        // single-word line
        List<String> actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        List<String> expected = singleWordLineCs;

        assertThat(actual,is(expected));
        // append empty line
        actual = AlphabetizedCircularShift.generateAlphabetizedCircularShift(emptyLineCs);
        assertThat(actual,is(expected));   // ACS should not change
    }
**/
}