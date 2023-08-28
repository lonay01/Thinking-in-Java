package p376task6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class E2 extends Exception{
    private static Logger logger = Logger.getLogger("E2");

    E2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
