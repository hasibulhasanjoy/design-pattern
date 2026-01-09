public class AudioPlayer {
    private MP3Player mP3Player;
    private VlcAdapter vlcAdapter;
    private AacAdapter aacAdapter;

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mP3Player = new MP3Player();
            mP3Player.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcAdapter = new VlcAdapter();
            vlcAdapter.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("aac")) {
            aacAdapter = new AacAdapter();
            aacAdapter.play(audioType, fileName);
        }
    }
}