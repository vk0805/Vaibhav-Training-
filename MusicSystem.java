package assignment1;

public class MusicSystem implements MyDevice{

    @Override
    public void on() {
        System.out.println("Music System is open");
    }

    @Override
    public void off() {
        System.out.println("Music System is off");
    }
}
