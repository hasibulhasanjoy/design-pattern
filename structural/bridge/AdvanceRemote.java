public class AdvanceRemote extends RemoteControl {

    public AdvanceRemote(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }

}
