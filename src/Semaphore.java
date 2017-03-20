/**
 * Created by habuvo on 20.03.17.
 */
public class Semaphore {
    private int green;
    private int yellow;
    private int red;

    public Semaphore(int green, int yellow, int red) {
        this.green = green;
        this.yellow = yellow;
        this.red = red;
    }

    public void doLight(View view, int time) {
        time %= green + yellow + red;
        if (time <= green && time>0) view.greenLight();
        else if (time <= green+yellow && time>0) view.yellowLight();
        else if (time <= green+yellow+red && time >0 || time == 0 ) view.redLight();
        else view.errInput();
    }
}
