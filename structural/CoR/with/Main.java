public class Main {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getLoggerChain();

        // loggerChain.logMessage(Constants.INFO, "This is info message");
        // loggerChain.logMessage(Constants.DEBUG, "This is Debug message");
        loggerChain.logMessage(Constants.ERROR, "This is Error message");
    }
}
