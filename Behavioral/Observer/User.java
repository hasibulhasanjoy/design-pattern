public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendNotification() {
        System.out.println(name + " : new post uploaded");
    }

}