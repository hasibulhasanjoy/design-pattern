public class ButtonFactory {
    public static Button createButton(String system) {
        if (system.equalsIgnoreCase("windows")) {
            return new WindowsButton();
        } else if (system.equalsIgnoreCase("mac")) {
            return new MacButton();
        }
        return null;
    }
}
