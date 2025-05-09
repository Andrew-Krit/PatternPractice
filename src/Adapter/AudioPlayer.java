package Adapter;

public class AudioPlayer implements MediaPlayer
{
    private MediaAdapter _mediaAdapter;

    @Override
    public void play(String audioType, String fileName)
    {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.printf("Playing mp3 file. Name: %s \n", fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
        {
            _mediaAdapter = new MediaAdapter(audioType);
            _mediaAdapter.play(audioType, fileName);
        }
        else
        {
            System.out.printf("Invalid media. %s format not supported \n", audioType);
        }
    }
}
