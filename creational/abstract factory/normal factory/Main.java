public class Main {
    public static void main(String[] args) {
        Button wb = ButtonFactory.createButton("windows");
        CheckBox wc = CheckBoxFactory.createCheckBox("mac"); // inconsistency
        wb.paint();
        wc.paint();

        CheckBox mc = CheckBoxFactory.createCheckBox("mac");
        Button mb = ButtonFactory.createButton("windows"); // inconsistency
        mc.paint();
        mb.paint();
    }
}
