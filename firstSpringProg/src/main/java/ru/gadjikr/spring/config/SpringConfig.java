package ru.gadjikr.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import ru.gadjikr.spring.Computer;
import ru.gadjikr.spring.MusicPlayer;
import ru.gadjikr.spring.music_types.*;

@Configuration
//@ComponentScan("ru.gadjikr.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    ClassicalMusic musicClassicBean() {
        return new ClassicalMusic();
    }

    @Bean
    RockMusic musicRockBean() {
        return new RockMusic();
    }

    @Bean
    JazzMusic musicJazzBean() {
        return new JazzMusic();
    }

    @Bean
    RapMusic musicRapBean() {
        return new RapMusic();
    }

    @Bean
    AllMusic musicAllBean() {
        return new AllMusic(musicRockBean(), musicRapBean(), musicClassicBean(), musicJazzBean());
    }

    @Bean
    AllAlbums allAlbums(){
        return new AllAlbums(musicRockBean(), musicRapBean(), musicClassicBean(), musicJazzBean(), musicAllBean());
    };

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(allAlbums());
    }

    @Bean
    Computer computer() {
        return new Computer(musicPlayer());
    }

}
