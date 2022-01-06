package week6.abstractexample;

public class CommandLineLogger extends AbstractLogger {

    @Override
    public void logString(String logString) {
        System.out.println(this.formatLogString(logString));
    }
}
