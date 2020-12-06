enum LogLevel {
    TRACE(0),
    DEBUG(1),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(7),
    UNKNOWN(42);

    private LogLevel(int level) {
        this.level = level;
    }

    public final int level;
}


public class LogLine {
    public static LogLevel parseLogLevel(String logLine) {
        switch (logLine.substring(1, 4)) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public static String outputForShortLog(LogLevel logLevel, String message) {
        return Integer.toString(logLevel.level) + ":" + message;
    }
}
