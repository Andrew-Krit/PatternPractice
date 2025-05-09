package Adapter;

public class MediaAdapter implements MediaPlayer
{
    private AdvancedMediaPlayer _advancedMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
        {
            _advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    public void play(String audioType, String fileName)
    {
        if (audioType.equalsIgnoreCase("vlc"))
        {
            _advancedMediaPlayer.playVlc(fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4"))
        {
            _advancedMediaPlayer.playMp4(fileName);
        }
    }
}
