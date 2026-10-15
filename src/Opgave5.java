import java.util.ArrayList;

public class Opgave5 {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis");

        double sum = 0;
        for (String drink : data) {
            String[] values = drink.split(",");
            String name = values[0];
            String description = values[1].trim();
            try {
                double price = Double.parseDouble(values[2].trim());
                sum += price;
                System.out.println(name + " - " + description + " (" + price + " kr)");
            } catch (NumberFormatException e) {
                System.out.println(name + " - " + description + " - Kunne ikke læse pris: " + values[2].trim());
            }
        }
        System.out.println("Den samlede pris er: " + sum);
    }
}
