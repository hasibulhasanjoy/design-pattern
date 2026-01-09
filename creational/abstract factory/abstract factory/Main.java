public class Main {
    public static void main(String[] args) {
        UiFactory factory1 = new WindowsUiFactory();
        UiFactory factory2 = new MacUiFactory();

        Button wb = factory1.createButton();
        CheckBox wc = factory1.createCheckBox();

        Button mb = factory2.createButton();
        CheckBox mc = factory2.createCheckBox();

        wb.paint();
        wc.paint();

        mb.paint();
        mc.paint();
    }
}
