package assignment1;

public class TestRemoteController {
    public static void main(String args[]){
        RemoteController remoteController=new RemoteController();
        remoteController.bulbOnButton().pressButton();
        remoteController.bulbOffButton().pressButton();
        remoteController.musicOnButton().pressButton();
        remoteController.musicOffButton().pressButton();

    }
}
