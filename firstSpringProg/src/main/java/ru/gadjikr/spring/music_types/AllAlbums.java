package ru.gadjikr.spring.music_types;

import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAlbums implements Music {
    public Music RockAlbum;
    public Music RapAlbum;
    public Music ClassicAlbum;
    public Music JazzAlbum;
    public Music AllAlbum;

    private final List<String> allMusic = new ArrayList<>();
    private final Map<String,List<String>> albums = new HashMap<>();


    public AllAlbums(Music musicRockBean, Music musicRapBean, Music musicClassicBean, Music musicJazzBean, Music musicAllBean) {

        this.RockAlbum = musicRockBean;
        this.RapAlbum = musicRapBean;
        this.ClassicAlbum = musicClassicBean;
        this.JazzAlbum = musicJazzBean;
        this.AllAlbum = musicAllBean;

        albums.put("Rock",musicRockBean.getMusicList());
        albums.put("Rap",musicRapBean.getMusicList());
        albums.put("Classic",musicClassicBean.getMusicList());
        albums.put("Jazz",musicJazzBean.getMusicList());
        albums.put("All",musicAllBean.getMusicList());

    }


    @Override
    public String getSong() {
        return allMusic.get((int) (Math.random()*allMusic.size()));
    }

    @Override
    public List<String> getMusicList() {
        return allMusic;
    }

}
