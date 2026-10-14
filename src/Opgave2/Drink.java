package Opgave2;

import java.util.ArrayList;

public class Drink {
    private double price;

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Prisen skal være et positivt tal");
        this.price = price;
    }

    public String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException("Indeks "
                    + index + " er uden for range 0-" + (items.size() - 1));
        }
        return items.get(index);
    }
}
