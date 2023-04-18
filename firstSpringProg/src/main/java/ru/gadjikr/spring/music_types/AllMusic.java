package ru.gadjikr.spring.music_types;

import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllMusic implements Music {
    private final Music musicRockBean;
    private final Music musicRapBean;
    private final Music musicClassicBean;
    private final Music musicJazzBean;

    private final List<String> allMusic = new ArrayList<>();
    private final Map<String,List<String>> allGenres = new HashMap<>();


    public AllMusic(Music musicRockBean, Music musicRapBean, Music musicClassicBean, Music musicJazzBean) {

        this.musicRockBean = musicRockBean;
        this.musicRapBean = musicRapBean;
        this.musicClassicBean = musicClassicBean;
        this.musicJazzBean = musicJazzBean;

        allMusic.addAll(musicRockBean.getMusicList());
        allMusic.addAll(musicRapBean.getMusicList());
        allMusic.addAll(musicClassicBean.getMusicList());
        allMusic.addAll(musicJazzBean.getMusicList());


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
