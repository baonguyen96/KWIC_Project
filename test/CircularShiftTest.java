import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CircularShiftTest extends AbstractCircularShiftTest {

    @Test
    public void testGenerateCircularShiftPassMultiWordsLine() {
        String[] actual = CircularShift.generateCircularShift(multiWordsLine);
        String[] expected = multiWordsLineCs;

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testGenerateCircularShiftPassSingleWordLine() {
        String[] actual = CircularShift.generateCircularShift(singleWordLine);
        String[] expected = singleWordLineCs;

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testGenerateCircularShiftPassEmptyLine() {
        String[] actual = CircularShift.generateCircularShift(emptyLine);
        String[] expected = emptyLineCs;

        assertArrayEquals(expected, actual);
    }


}