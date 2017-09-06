abstract class AbstractCircularShiftTest {

    // test case 1
    String msg1 = "Hello from Software Architecture course. ";
    String[] msg1CsPass = {
            "Hello from Software Architecture course. ",
            "from Software Architecture course. Hello ",
            "Software Architecture course.Hello from ",
            "Architecture course. Hello from Software ",
            "course. Hello from Software Architecture "
    };
    String[] msg1CsFail = {
            "Hello from Software Architecture course.",
            "from Software Architecture course. Hello",
            "Software Architecture course.Hello from",
            "Architecture course. Hello from Software",
            "course. Hello from Software Architecture",
            "Hello from Software Architecture course."
    };

    // test case 2
    String msg2 = "Hi";
    String[] msg2CsPass = {
            "Hi"
    };
    String[] msg2CsFail = {
            "Hi",
            "Hi"
    };

    // test case 3
    String msg3 = "";
    String[] msg3CsPass = {
            ""
    };

}
