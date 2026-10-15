package Opgave2;

import java.util.ArrayList;

public class Main {
    private static Drink d = new Drink();
    private static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        /*try {
            d.setPrice(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Dette er ikke muligt: " + e.getMessage());
        }*/

        items.add("Astronaut");
        items.add("Sex on the beach");
        items.add("Rom & coke");
        items.add("Gin hass");

        try {
            System.out.println(d.getItem(items, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
