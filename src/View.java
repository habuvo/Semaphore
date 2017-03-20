import java.util.Scanner;

/**
 * Created by habuvo on 20.03.17.
 */
public class View {

    public void greeting() {System.out.println("Enter time in mins, -1 for exit");}

    public void bye() {System.out.println("Bye!");}

    public void greenLight() {System.out.println("Green light");}

    public void yellowLight() {System.out.println("Yellow light");}

    public void redLight() {System.out.println("Red light");}

    public void errInput() {System.out.println("Wrong input");}

    public int getInput(Scanner sc) { return sc.nextInt();}

}
