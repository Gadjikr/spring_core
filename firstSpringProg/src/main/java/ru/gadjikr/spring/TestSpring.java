package ru.gadjikr.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gadjikr.spring.config.SpringConfig;
import ru.gadjikr.spring.music_types.AllMusic;
import ru.gadjikr.spring.music_types.ClassicalMusic;
import ru.gadjikr.spring.music_types.MusicOption;
import ru.gadjikr.spring.music_types.RapMusic;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("player - " + musicPlayer.getName());
        System.out.println("volume - " +musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic(MusicOption.ALL));

        // checking scope
//        RapMusic rapMusic = context.getBean("musicRapBean", RapMusic.class);
//        RapMusic rapMusic2 = context.getBean("musicRapBean", RapMusic.class);
//        System.out.println(rapMusic == rapMusic2);
//        ClassicalMusic classicalMusic = context.getBean("musicClassicBean", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("musicClassicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic==classicalMusic2);

//        AllMusic allMusic = context.getBean("musicAllBean", AllMusic.class);
//
//        System.out.println(allMusic.getMusicList().size());
//        System.out.println(allMusic.getMusicList().toString());

//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        context.close();
    }
}


// todo почему бины рок и джаз могут использоваться без создания бинов в спрингКонфиг?