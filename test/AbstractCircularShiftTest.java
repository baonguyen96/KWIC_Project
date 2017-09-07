abstract class AbstractCircularShiftTest {

    // test case 1
    final String msg1 = "Hello from Software Architecture course. ";
    final String[] msg1CsFail = {
            "Hello from Software Architecture course. ",
            "from Software Architecture course. Hello ",
            "Software Architecture course.Hello from ",
            "Architecture course. Hello from Software ",
            "course. Hello from Software Architecture "
    };
    final String[] msg1CsPass = {
            "Hello from Software Architecture course.",
            "from Software Architecture course. Hello",
            "Software Architecture course.Hello from",
            "Architecture course. Hello from Software",
            "course. Hello from Software Architecture",
            "Hello from Software Architecture course."
    };

    // test case 2
    final String msg2 = "Hi";
    final String[] msg2CsPass = {
            "Hi"
    };
    final String[] msg2CsFail = {
            "Hi",
            "Hi"
    };

    // test case 3
    final String msg3 = "";

}
