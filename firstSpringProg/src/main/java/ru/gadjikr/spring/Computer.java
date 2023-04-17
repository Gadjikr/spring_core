package ru.gadjikr.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gadjikr.spring.music_types.MusicOption;

//@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

//    @Autowired
    public Computer( MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "\nid = " + id +
                "\nmusicPlayer = " + musicPlayer +
                "\n" + musicPlayer.playMusic(MusicOption.RAP);
    }
}

