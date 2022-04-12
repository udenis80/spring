package ru.job4j.spring_course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicPlayer (Music music) {
        this.music=music;
    }
    public void playMusic() {
        System.out.println("Playing:" + music.getSong());
    }
}
