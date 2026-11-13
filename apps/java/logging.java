package fixture;
public class LoggingFixture {
    public void log(Request request) {
        String value = request.getParameter("value"); // SOURCE
        // SINK: untrusted data in log record; CR/LF validation needed.
        logger.info("value=" + value);
    }
}
