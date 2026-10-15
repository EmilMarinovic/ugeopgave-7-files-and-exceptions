package Opgave6;

import java.util.ArrayList;

public class Cafe {
    private ArrayList<Drink> coffeMenu;

    public Cafe() {
        this.coffeMenu = new ArrayList<>();
    }

    public void loadData() {

    }

    public void saveData() {

    }

    public void showMenu() {
        for (Drink d : coffeMenu) {
            System.out.println(d.getName() + " - " + d.getPrice() + " (" + d.getSoldNumber() + " sold)");
        }
    }
}
