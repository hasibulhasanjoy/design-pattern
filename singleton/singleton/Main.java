public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getConnection();
        DatabaseConnection db2 = DatabaseConnection.getConnection(); // only one instance.

        System.out.println(db1 == db2); // true
    }
}
