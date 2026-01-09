public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        BasicRemote basicRemote = new BasicRemote(tv);
        AdvanceRemote advanceRemote = new AdvanceRemote(radio);

        basicRemote.powerOn();
        basicRemote.powerOff();

        advanceRemote.powerOn();
        advanceRemote.powerOff();
        advanceRemote.setVolume(10);
    }
}
