public class NotificationFactory {
    public static Notification geNotification(String type) {
        if (type.equalsIgnoreCase("Email")) {
            return new Email();
        } else if (type.equalsIgnoreCase("sms")) {
            return new Sms();
        }
        return null;
    }
}
