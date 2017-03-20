import java.util.Scanner;

/**
 * Created by habuvo on 20.03.17.
 */
public class Controller {
    static final int GREEN = 3;
    static final int YELLOW = 2;   // maybe user input later - so move to View
    static final int RED = 5;

    private int green;
    private int yellow;
    private int red;

    public static void main(String[] args) {
        int time;
        Scanner sc = new Scanner(System.in);
        Semaphore sf = new Semaphore(GREEN, YELLOW, RED);
        View view = new View();

        view.greeting();
        while (true) {
            time = view.getInput(sc);
            if (time == -1) {
                view.bye();
                break;
            } else {
                sf.doLight(view, time);
            }
        }
    }
}
