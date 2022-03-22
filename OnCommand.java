package assignment1;

public class OnCommand implements Coomand{
    private MyDevice myDevice;
    public OnCommand(MyDevice myDevice){
        this.myDevice=myDevice;

    }
    @Override
    public void execute() {
        myDevice.on();
    }
}
