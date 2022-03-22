package assignment1;

public class Bulb implements MyDevice {

    @Override
    public void on() {
        System.out.println("Bulb is open");
    }

    @Override
    public void off() {
        System.out.println("Bulb is off");

    }
}
