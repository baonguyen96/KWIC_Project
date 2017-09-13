import java.util.Arrays;
import java.util.List;

abstract class AbstractCircularShiftTest {

    // test case 1
    final String multiWordsLine = "HELLO FROM SOFTWARE ARCHITECTURE COURSE.";
    final List<String> multiWordsLineCs = Arrays.asList(
            "HELLO FROM SOFTWARE ARCHITECTURE COURSE.",
            "FROM SOFTWARE ARCHITECTURE COURSE. HELLO",
            "SOFTWARE ARCHITECTURE COURSE. HELLO FROM",
            "ARCHITECTURE COURSE. HELLO FROM SOFTWARE",
            "COURSE. HELLO FROM SOFTWARE ARCHITECTURE");

    // test case 2
    final String singleWordLine = "hi";
    final List<String> singleWordLineCs = Arrays.asList("hi");

    // test case 3
    final String emptyLine = "";
    final List<String> emptyLineCs = Arrays.asList("");
}
