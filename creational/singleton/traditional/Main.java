public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = new DatabaseConnection();
        DatabaseConnection db2 = new DatabaseConnection(); // multiple instance of the same object.

        db1.update();
        db2.update(); // conflict may occur
    }
}
