abstract class AbstractCircularShiftTest {

    // test case 1
    final String multiWordsLine = "HELLO FROM SOFTWARE ARCHITECTURE COURSE.";
    final String[] multiWordsLineCs = {
            "HELLO FROM SOFTWARE ARCHITECTURE COURSE.",
            "FROM SOFTWARE ARCHITECTURE COURSE. HELLO",
            "SOFTWARE ARCHITECTURE COURSE. HELLO FROM",
            "ARCHITECTURE COURSE. HELLO FROM SOFTWARE",
            "COURSE. HELLO FROM SOFTWARE ARCHITECTURE"
    };

    // test case 2
    final String singleWordLine = "hi";
    final String[] singleWordLineCs = {
            "HI"
    };

    // test case 3
    final String emptyLine = "";
    final String[] emptyLineCs = null;
}
