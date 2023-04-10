package ru.gadjikr.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {


    private List<String> musicList = new ArrayList<>();

    private Music rock;
    private Music rap;
    private Music classical;

    @Autowired
    public MusicPlayer(@Qualifier("musicRockBean") Music rock, @Qualifier("musicRapBean") Music rap, @Qualifier("musicClassicBean") Music classical) {
        this.rock = rock;
        this.rap = rap;
        this.classical = classical;
    }


    public String playMusic(MusicOption musicOption) {
        Music music;

        switch (musicOption) {
            case ROCK -> music = rock;

            case RAP -> music = rap;

            default -> music = classical;
        }

        musicList = music.getMusicList();
        String song = musicList.get((int) (Math.random() * musicList.size()));

        return "playing : (shuffle)" + "\n" +
                "Song : " + song + "\n" +
                "Album : " + musicOption.name();

    }

}





