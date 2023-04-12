package ru.gadjikr.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("musicRapBean")
public class RapMusic implements Music{
    String song1 = "Rap song 1";
    String song2 = "Rap song 2";
    String song3 = "Rap song 3";

    List<String> rapList = new ArrayList<>(3);

//    @PostConstruct
//    public void doMyInit(){
//        System.out.println("constructing RAP bean");
//    }
//
//    @PreDestroy
//    public void doMyDestroy(){
//        System.out.println("destroing RAP bean");
//    }

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
