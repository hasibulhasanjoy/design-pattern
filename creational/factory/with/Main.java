public class Main {
    public static void main(String[] args) {
        Notification e = NotificationFactory.geNotification("email");
        e.send();

        Notification s = NotificationFactory.geNotification("sms");
        s.send();
    }
}
