import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class CircularShiftTest extends AbstractCircularShiftTest {

    private CircularShift cs;

    @AfterEach
    void teardown() {
        cs = null;
    }

    @Test
    void testGenerateCircularShiftPassMultiWordsLine() {
        cs = new CircularShift(multiWordsLine);
        List<String> actual = cs.getShiftedLines();
        List<String> expected = multiWordsLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateCircularShiftPassSingleWordLine() {
        cs = new CircularShift(singleWordLine);
        List<String> actual = cs.getShiftedLines();
        List<String> expected = singleWordLineCs;

        assertThat(actual, is(expected));
    }


    @Test
    void testGenerateCircularShiftPassEmptyLine() {
        cs = new CircularShift(emptyLine);
        List<String> actual = cs.getShiftedLines();
        List<String> expected = emptyLineCs;

        assertThat(actual, is(expected));
    }

}