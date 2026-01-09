public class TV implements Device {
    @Override
    public void powerOn() {
        System.out.println("TV is on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume is set to " + volume);
    }
}
