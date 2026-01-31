public class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println("INFO: " + message);
        } else if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (level == ERROR) {
            System.out.println("ERROR: " + message);
        }
    }
}
