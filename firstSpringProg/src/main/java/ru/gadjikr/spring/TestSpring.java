package ru.gadjikr.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gadjikr.spring.config.SpringConfig;
import ru.gadjikr.spring.music_types.*;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("player - " + musicPlayer.getName());
        System.out.println("volume - " +musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic(MusicOption.ALL));



        context.close();
    }
}


// todo почему бины рок и джаз могут использоваться без создания бинов в спрингКонфиг?