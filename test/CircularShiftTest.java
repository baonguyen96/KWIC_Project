import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CircularShiftTest extends AbstractCircularShiftTest {

    @Test
    private void testGenerateCircularShiftPassMsg1() {
        String[] actual = CircularShift.generateCircularShift(msg1);
        String[] expected = msg1CsPass;

        assertEquals(actual, expected);
    }


    @Test
    private void testGenerateCircularShiftFailMsg1() {
        String[] actual = CircularShift.generateCircularShift(msg1);
        String[] expected = msg1CsFail;

        assertEquals(actual, expected);
    }


    @Test
    private void testGenerateCircularShiftPassMsg2() {
        String[] actual = CircularShift.generateCircularShift(msg2);
        String[] expected = msg2CsPass;

        assertEquals(actual, expected);
    }


    @Test
    private void testGenerateCircularShiftFailMsg2() {
        String[] actual = CircularShift.generateCircularShift(msg2);
        String[] expected = msg2CsFail;

        assertEquals(actual, expected);
    }

    @Test
    private void testGenerateCircularShiftPassMsg3() {
        String[] actual = CircularShift.generateCircularShift(msg3);
        String[] expected = msg3CsPass;

        assertEquals(actual, expected);
    }


    @Test
    private void testGenerateCircularShiftFailMsg3() {
        String[] actual = CircularShift.generateCircularShift(msg3);
        String[] expectedFail = msg3CsPass;

        assertNotEquals(actual, expectedFail);
    }
}