package ru.gadjikr.spring.music_types;

import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.List;



public class JazzMusic implements Music {
    private String song1 = "Jazz song1";
    private String song2 = "Jazz song2";
    private String song3 = "Jazz song3";

    private List<String> jazzList = new ArrayList<>(3);

    public JazzMusic(){
        jazzList.add(song1);
        jazzList.add(song2);
        jazzList.add(song3);
    }

    @Override
    public String getSong() {
        String song = jazzList.get((int) (Math.random()* jazzList.size()));
        return song;
    }

    @Override
    public List<String> getMusicList() {
        return jazzList;
    }
}
