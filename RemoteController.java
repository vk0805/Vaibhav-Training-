package assignment1;

public class RemoteController {

    private RemoteButton bulbOnButton;
    private RemoteButton bulbOffButton;
    private RemoteButton musicOnButton;
    private RemoteButton musicOffButton;

    public RemoteController(){
        bulbOnButton=new RemoteButton(new OnCommand(new Bulb())) ;
        bulbOffButton=new RemoteButton(new OffCommand(new Bulb())) ;
        musicOnButton=new RemoteButton(new OnCommand(new MusicSystem())) ;
        musicOffButton=new RemoteButton(new OffCommand(new MusicSystem())) ;
    }
    public RemoteButton bulbOnButton(){
        return bulbOnButton;
    }
    public RemoteButton bulbOffButton(){
        return bulbOffButton;
    }
    public RemoteButton musicOnButton(){
        return musicOnButton;
    }
    public RemoteButton musicOffButton(){
        return musicOffButton;
    }

}
