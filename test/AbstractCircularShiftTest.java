@SuppressWarnings({"UnusedDeclaration"})
abstract class AbstractCircularShiftTest {

    // test case 1
    final String multiWordsLine1 = "Hello from Software Architecture course. ";
    final String[] multiWordsLine1Cs = {
            "Hello from Software Architecture course.",
            "from Software Architecture course. Hello",
            "Software Architecture course.Hello from",
            "Architecture course. Hello from Software",
            "course. Hello from Software Architecture",
            "Hello from Software Architecture course."
    };

    // test case 2
    final String singleWordLine = "Hi";
    final String[] singleWordLineCs = {
            "Hi"
    };

    // test case 3
    final String emptyLine = "";
    final String[] emptyLineCs = null;
}
