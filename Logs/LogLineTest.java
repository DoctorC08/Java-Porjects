package Logs;

public class LogLineTest {
    public static void main(String[] args) {
        testLogLevelParsing();
        testShortLogOutput();
    }

    public static void testLogLevelParsing() {
        System.out.println("Testing log level parsing...");

        assert new LogLine("[TRC]: Trace message").getLogLevel() == LogLevel.TRACE : "Failed: [TRC]";
        assert new LogLine("[DBG]: Debug message").getLogLevel() == LogLevel.DEBUG : "Failed: [DBG]";
        assert new LogLine("[INF]: Info message").getLogLevel() == LogLevel.INFO : "Failed: [INF]";
        assert new LogLine("[WRN]: Warning message").getLogLevel() == LogLevel.WARNING : "Failed: [WRN]";
        assert new LogLine("[ERR]: Error message").getLogLevel() == LogLevel.ERROR : "Failed: [ERR]";
        assert new LogLine("[FTL]: Fatal message").getLogLevel() == LogLevel.FATAL : "Failed: [FTL]";
        assert new LogLine("[UNK]: Unknown message").getLogLevel() == LogLevel.UNKNOWN : "Failed: [UNK]";

        System.out.println("Log level parsing tests passed!");
    }

    public static void testShortLogOutput() {
        System.out.println("Testing short log output...");

        assert new LogLine("[TRC]: Trace message").getOutputForShortLog().equals("1:Trace message") : "Failed: [TRC]";
        assert new LogLine("[DBG]: Debug message").getOutputForShortLog().equals("2:Debug message") : "Failed: [DBG]";
        assert new LogLine("[INF]: Info message").getOutputForShortLog().equals("4:Info message") : "Failed: [INF]";
        assert new LogLine("[WRN]: Warning message").getOutputForShortLog().equals("5:Warning message") : "Failed: [WRN]";
        assert new LogLine("[ERR]: Error message").getOutputForShortLog().equals("6:Error message") : "Failed: [ERR]";
        assert new LogLine("[FTL]: Fatal message").getOutputForShortLog().equals("42:Fatal message") : "Failed: [FTL]";
        assert new LogLine("[UNK]: Unknown message").getOutputForShortLog().equals("0:Unknown message") : "Failed: [UNK]";

        System.out.println("Short log output tests passed!");
    }
}
