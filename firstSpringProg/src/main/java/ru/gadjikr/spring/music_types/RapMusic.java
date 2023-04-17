package ru.gadjikr.spring.music_types;

import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.List;

//@Component("musicRapBean")
public class RapMusic implements Music {
    String song1 = "Rap song 1";
    String song2 = "Rap song 2";
    String song3 = "Rap song 3";

    List<String> rapList = new ArrayList<>(3);


    public RapMusic() {
        rapList.add(song1);
        rapList.add(song2);
        rapList.add(song3);
    }

    @Override
    public String getSong() {
        String song = rapList.get((int) (Math.random() * rapList.size()));
        return song;
    }

    @Override
    public List<String> getMusicList() {
        return rapList;
    }
}
