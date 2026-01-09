public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connected");
    }

    public static DatabaseConnection getConnection() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
