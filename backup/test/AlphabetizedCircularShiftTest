import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

class AlphabetizedCircularShiftTest extends AbstractCircularShiftTest {

    private AlphabetizedCircularShift acs;

    @AfterEach
    void teardown() {
        AlphabetizedCircularShift.clear();
        acs = null;
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineMultiWords() {
        acs = new AlphabetizedCircularShift(multiWordsLineCs);
        List<String> actual = acs.getLines();
        List<String> expected = multiWordsLineCs;
        Collections.sort(expected);

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftFailSingleLineMultiWords() {
        List<String> expected = new ArrayList<>(multiWordsLineCs);   // unsorted
        acs = new AlphabetizedCircularShift(multiWordsLineCs);
        List<String> actual = acs.getLines();

        for (String s : expected) {
            System.out.println(s);
        }

        assertThat(actual, is(not(expected)));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassSingleLineSingleWords() {
        acs = new AlphabetizedCircularShift(singleWordLineCs);
        List<String> actual = acs.getLines();
        List<String> expected = singleWordLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassMultiLines() {
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        // first line
        acs = new AlphabetizedCircularShift(multiWordsLineCs);
        actual.addAll(acs.getLines());
        expected.addAll(multiWordsLineCs);
        Collections.sort(expected);
        assertThat(actual, is(expected));

        // second line
        acs = new AlphabetizedCircularShift(singleWordLineCs);
        actual = acs.getLines();
        expected.addAll(singleWordLineCs);
        Collections.sort(expected);
        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateAlphabetizedCircularShiftPassEmptyLine() {
        // single-word line
        acs = new AlphabetizedCircularShift(singleWordLineCs);
        List<String> actual = new ArrayList<>(acs.getLines());
        List<String> expected = new ArrayList<>(singleWordLineCs);
        assertThat(actual, is(expected));

        // append empty line
        acs = new AlphabetizedCircularShift(emptyLineCs);
        actual = acs.getLines();
        expected.addAll(emptyLineCs);
        assertThat(actual, is(expected));   // ACS should not change
    }

}