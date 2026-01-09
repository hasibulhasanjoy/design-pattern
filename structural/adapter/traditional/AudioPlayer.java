public class AudioPlayer {
    private final MP3Player mP3Player = new MP3Player();
    private final VlcPlayer vlcPlayer = new VlcPlayer();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mP3Player.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("invalid formate");
        }
    }
}