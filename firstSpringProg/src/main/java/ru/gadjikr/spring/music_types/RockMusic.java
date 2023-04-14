package ru.gadjikr.spring.music_types;

import org.springframework.stereotype.Component;
import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.List;

@Component("musicRockBean")
public class RockMusic implements Music {
    String song1 = "Rock song 1";
    String song2 = "Rock song 2";
    String song3 = "Rock song 3";

    List<String> rockList = new ArrayList<>(3);

    public RockMusic() {
        rockList.add(song1);
        rockList.add(song2);
        rockList.add(song3);
    }

    @Override
    public String getSong() {
        String song = rockList.get((int) (Math.random() * rockList.size()));
        return song;
    }

    @Override
    public List<String> getMusicList() {
        return rockList;
    }

}
