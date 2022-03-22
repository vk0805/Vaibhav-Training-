package assignment1;

public class OffCommand implements Coomand{
    private MyDevice myDevice;
    public OffCommand(MyDevice myDevice){
        this.myDevice=myDevice;

    }
    @Override
    public void execute() {
        myDevice.off();
    }
}
