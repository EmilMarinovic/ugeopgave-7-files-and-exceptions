import java.util.Scanner;

public class Opgave1 {
    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) { //Startede med at skrive Exception e, og så viste den den rigtige exception
            System.out.println("Du skal skrive et tal!");
            return promptNumber(msg);
        }
    }

    public static void main(String[] args) {
        Opgave1 o = new Opgave1();

        int input = o.promptNumber("Hvad er dit yndlingstal?");
        System.out.println("Hans yndlingsttal er " + input);
    }
}
