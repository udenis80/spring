package ru.job4j.spring_course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic) {
        this.classicalMusic=classicalMusic;
    }
    public void playMusic() {
        System.out.println("Playing:" + classicalMusic.getSong());
    }
}
