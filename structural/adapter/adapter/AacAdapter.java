public class AacAdapter implements MediaPlayer {
    private final AacPlayer aacPlayer = new AacPlayer();

    @Override
    public void play(String audioType, String fileName) {
        aacPlayer.playAac(fileName);
    }
}
