public class CheckBoxFactory {
    public static CheckBox createCheckBox(String system) {
        if (system.equalsIgnoreCase("windows")) {
            return new WindowsCheckBox();
        } else if (system.equalsIgnoreCase("mac")) {
            return new MacCheckBox();
        }
        return null;
    }
}
