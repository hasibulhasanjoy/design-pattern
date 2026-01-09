public class VlcAdapter implements MediaPlayer {
    private final VlcPlayer vlcPlayer = new VlcPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        }
    }

}
