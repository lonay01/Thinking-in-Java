package p376task6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class E1 extends Exception {
    private static Logger logger = Logger.getLogger("E111");

    E1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
