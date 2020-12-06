import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.assertj.core.api.Assertions.*;

public class LogLineTest {
    public void parse_should_return_trace() {
        assertThat(LogLine.parseLogLevel("[TRC]: Line 84 - Console.WriteLine('Hello World');")).isEqualTo(LogLevel.TRACE);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_debug() {
        assertThat(LogLine.parseLogLevel("[DBG]: ; expected")).isEqualTo(LogLevel.DEBUG);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_info() {
        assertThat(LogLine.parseLogLevel("[INF]: Timezone changed")).isEqualTo(LogLevel.INFO);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_warning() {
        assertThat(LogLine.parseLogLevel("[WRN]: Timezone not set")).isEqualTo(LogLevel.WARNING);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_error() {
        assertThat(LogLine.parseLogLevel("[ERR]: Disk full")).isEqualTo(LogLevel.ERROR);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_fatal() {
        assertThat(LogLine.parseLogLevel("[FTL]: Not enough memory")).isEqualTo(LogLevel.FATAL);
    }

    @Test
    @Ignore("Remove to run test")
    public void parse_should_return_unknown() {
        assertThat(LogLine.parseLogLevel("[XYZ]: Gibberish message.. beep boop..")).isEqualTo(LogLevel.UNKNOWN);
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_trace() {
        assertThat(LogLine.outputForShortLog(LogLevel.TRACE, "Line 13 - int myNum = 42;")).isEqualTo("0:Line 13 - int myNum = 42;");
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_debug() {
        assertThat(LogLine.outputForShortLog(LogLevel.DEBUG, "The name 'LogLevel' does not exist in the current context")).isEqualTo("1:The name 'LogLevel' does not exist in the current context");
    }


    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_info() {
        assertThat(LogLine.outputForShortLog(LogLevel.INFO, "File moved")).isEqualTo("4:File moved");
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_warning() {
        assertThat(LogLine.outputForShortLog(LogLevel.WARNING, "Unsafe password")).isEqualTo("5:Unsafe password");
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_error() {
        assertThat(LogLine.outputForShortLog(LogLevel.ERROR, "Stack overflow")).isEqualTo("6:Stack overflow");
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_fatal() {
        assertThat(LogLine.outputForShortLog(LogLevel.FATAL, "Dumping all files")).isEqualTo("7:Dumping all files");
    }

    @Test
    @Ignore("Remove to run test")
    public void Output_for_short_log_for_unknown() {
        assertThat(LogLine.outputForShortLog(LogLevel.UNKNOWN, "Something unknown happened")).isEqualTo("42:Something unknown happened");
    }
}
