package ru.gadjikr.spring.music_types;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.gadjikr.spring.Music;

import java.util.ArrayList;
import java.util.List;

@Component("musicClassicBean")
@Scope("prototype")
public class ClassicalMusic implements Music {
    String song1 = "Classical song 1";
    String song2 = "Classical song 2";
    String song3 = "Classical song 3";

    List<String> classicalList = new ArrayList<>(3);

    public ClassicalMusic() {
        classicalList.add(song1);
        classicalList.add(song2);
        classicalList.add(song3);
    }

    @Override
    public String getSong() {
        String song = classicalList.get((int) (Math.random() * classicalList.size()));
        return song;
    }

    @Override
    public List<String> getMusicList() {
        return classicalList;
    }
}
