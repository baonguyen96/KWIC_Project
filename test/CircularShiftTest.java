import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class CircularShiftTest extends AbstractCircularShiftTest {

    @Test
    void testGenerateCircularShiftPassMultiWordsLine() {
        List<String> actual = CircularShift.generateCircularShift(multiWordsLine);
        List<String> expected = multiWordsLineCs;

        assertThat(actual,is(expected));
    }


/**    @Test
    void testGenerateCircularShiftPassSingleWordLine() {
        List<String> actual = CircularShift.generateCircularShift(singleWordLine);
        List<String> expected = singleWordLineCs;

        assertThat(actual,is(expected));
    }


    @Test
    void testGenerateCircularShiftPassEmptyLine() {
        List<String> actual = CircularShift.generateCircularShift(emptyLine);
        List<String> expected = emptyLineCs;
        assertThat(actual,is(expected));
    }

**/
}