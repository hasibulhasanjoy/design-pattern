public class Radio implements Device {
    @Override
    public void powerOn() {
        System.out.println("Radio is on");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio is off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume is set to " + volume);
    }

}
