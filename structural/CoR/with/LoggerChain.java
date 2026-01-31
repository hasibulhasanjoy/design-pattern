public class LoggerChain {
    public static Logger getLoggerChain() {
        Logger errorLogger = new ErrorLogger(Constants.ERROR);
        Logger debugLogger = new DebugLogger(Constants.DEBUG);
        Logger infoLogger = new InfoLogger(Constants.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }
}
