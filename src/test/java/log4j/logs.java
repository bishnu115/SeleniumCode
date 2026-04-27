package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logs {
    static Logger log= LogManager.getLogger(logs.class);

    public static void main(String[] args) {

        log.info("Test started");
        log.warn("This is a warning");
        log.error("This is an error");
    }
}
