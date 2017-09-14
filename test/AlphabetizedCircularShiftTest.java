import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

class AlphabetizedCircularShiftTest extends AbstractCircularShiftTest {

    @AfterEach
    void teardown() {
        AlphabetizedCircularShift.clear();
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineMultiWords() {
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        List<String> actual = AlphabetizedCircularShift.getLines();
        List<String> expected = multiWordsLineCs;
        Collections.sort(expected);

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftFailSingleLineMultiWords() {
        List<String> expected = new ArrayList<>(multiWordsLineCs);   // unsorted
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        List<String> actual = AlphabetizedCircularShift.getLines();

        assertThat(actual, is(not(expected)));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineSingleWords() {
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        List<String> actual = AlphabetizedCircularShift.getLines();
        List<String> expected = singleWordLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassMultiLines() {
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        // first line
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(multiWordsLineCs);
        actual = AlphabetizedCircularShift.getLines();
        expected.addAll(multiWordsLineCs);
        Collections.sort(expected);
        assertThat(actual, is(expected));

        // second line
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        actual = AlphabetizedCircularShift.getLines();
        expected.addAll(singleWordLineCs);
        Collections.sort(expected);
        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassEmptyLine() {
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        // single-word line
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(singleWordLineCs);
        actual = AlphabetizedCircularShift.getLines();
        expected = singleWordLineCs;
        assertThat(actual, is(expected));

        // append empty line
        AlphabetizedCircularShift.generateAlphabetizedCircularShift(emptyLineCs);
        actual = AlphabetizedCircularShift.getLines();
        expected.addAll(emptyLineCs);
        Collections.sort(expected);
        assertThat(actual, is(expected));
    }

}