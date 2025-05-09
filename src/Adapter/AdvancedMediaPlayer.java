package Adapter;

public class AdvancedMediaPlayer
{
    public void playVlc(String fileName)
    {
        System.out.printf("Playing vlc file. Name %s \n", fileName);
    }

    public void playMp4(String fileName)
    {
        System.out.printf("Playing mp4 file. Name %s \n", fileName);
    }
}
