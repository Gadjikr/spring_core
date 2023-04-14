package ru.gadjikr.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.gadjikr.spring.music_types.ClassicalMusic;
import ru.gadjikr.spring.music_types.MusicOption;
import ru.gadjikr.spring.music_types.RapMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("player - " + musicPlayer.getName());
        System.out.println("volume - " +musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic(MusicOption.RAP));

        // checking scope
        RapMusic rapMusic = context.getBean("musicRapBean", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("musicRapBean", RapMusic.class);
        System.out.println(rapMusic == rapMusic2);
        ClassicalMusic classicalMusic = context.getBean("musicClassicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicClassicBean", ClassicalMusic.class);
        System.out.println(classicalMusic==classicalMusic2);


        context.close();
    }
}


// TODO: 13