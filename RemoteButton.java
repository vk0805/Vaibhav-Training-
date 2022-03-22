package assignment1;

public class RemoteButton {
    private Coomand coomand;
    public RemoteButton(Coomand coomand){
        this.coomand=coomand;
    }
    public void pressButton(){
        coomand.execute();
    }
}
