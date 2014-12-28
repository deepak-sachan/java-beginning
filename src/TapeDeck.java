/**
 * Created by deepak on 28/12/14.
 */
public class TapeDeck {
    boolean canRecord;
    void playTape(){
        System.out.print("tape is playing");

    }
    void recordTape(){
        System.out.print("tape recording");
    }
}
class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t= new TapeDeck();
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }

}