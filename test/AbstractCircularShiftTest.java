public abstract class AbstractCircularShiftTest {

    // test case 1
    protected final String multiWordsLine = "HELLO FROM SOFTWARE ARCHITECTURE COURSE.";
    protected final String[] multiWordsLineCs = {
            "HELLO FROM SOFTWARE ARCHITECTURE COURSE.",
            "FROM SOFTWARE ARCHITECTURE COURSE. HELLO",
            "SOFTWARE ARCHITECTURE COURSE. HELLO FROM",
            "ARCHITECTURE COURSE. HELLO FROM SOFTWARE",
            "COURSE. HELLO FROM SOFTWARE ARCHITECTURE"
    };

    // test case 2
    protected final String singleWordLine = "hi";
    protected final String[] singleWordLineCs = {
            "HI"
    };

    // test case 3
    protected final String emptyLine = "";
    protected final String[] emptyLineCs = null;
}
