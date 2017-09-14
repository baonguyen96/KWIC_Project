import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class CircularShiftTest extends AbstractCircularShiftTest {

    @AfterEach
    void teardown() {
        CircularShift.clear();
    }

    @Test
    void testGenerateCircularShiftPassMultiWordsLine() {
        CircularShift.generateCircularShift(multiWordsLine);
        List<String> actual = CircularShift.getShiftedLines();
        List<String> expected = multiWordsLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateCircularShiftPassSingleWordLine() {
        CircularShift.generateCircularShift(singleWordLine);
        List<String> actual = CircularShift.getShiftedLines();
        List<String> expected = singleWordLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateCircularShiftPassEmptyLine() {
        CircularShift.generateCircularShift(emptyLine);
        List<String> actual = CircularShift.getShiftedLines();
        List<String> expected = emptyLineCs;

        assertThat(actual, is(expected));
    }

}