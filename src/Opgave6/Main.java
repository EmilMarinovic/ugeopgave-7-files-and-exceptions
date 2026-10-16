package Opgave6;

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        TextUI ui = new TextUI();
        cafe.loadData();
        boolean running = true;
        while (running) {
            cafe.showMenu();
            int input = ui.promptNumeric("Hvad vil du købe?");
            if (input >= 1 && input <= cafe.getCoffeMenu().size()) {
                Drink choice = cafe.getCoffeMenu().get(input - 1);
                System.out.println("Du valgte " + choice.getName() + ": Det bliver " + choice.getPrice() + " kr");
                choice.setSoldNumber(choice.getSoldNumber() + 1);
            } else if (input == 0){
                running = false;
                cafe.saveData();
            } else {
                System.out.println("Ugyldigt valg");
            }
        }
    }
}
