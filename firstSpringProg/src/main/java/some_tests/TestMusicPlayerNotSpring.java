package some_tests;

interface IMusic{
    void play();
}

class ClassicMusic implements IMusic{
    @Override
    public void play() {
        System.out.println("playing classic music ");
    }
}

class RockMusic implements IMusic{
    @Override
    public void play() {
        System.out.println("playing rock music ");
    }
}

public class TestMusicPlayerNotSpring {
    public static void main(String[] args) {
        IMusic music;
        music = new ClassicMusic();
        music.play();
        music = new RockMusic();
        music.play();
    }

}
