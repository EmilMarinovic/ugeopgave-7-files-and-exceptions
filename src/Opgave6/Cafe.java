package Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<Drink> coffeMenu;

    public Cafe() {
        this.coffeMenu = new ArrayList<>();
    }

    public void loadData() {
        File file = new File("data/menu.csv");
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //skip header
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] values = s.split(",");
                String name = values[0];
                int price = Integer.parseInt(values[1].trim());
                int soldNumber = Integer.parseInt(values[2].trim());
                Drink drink = new Drink(name, price, soldNumber);
                coffeMenu.add(drink);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunne ikke findes");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Der er opstået en fejl i at indlæse data");
        }
    }

    public void saveData() {
        try {
            FileWriter writer = new FileWriter("data/menu.csv");
            writer.write("Name, Price, Soldnumber\n");
            for (Drink d : coffeMenu) {
                writer.write(d.toString() + "\n");
            }
            writer.close();
        }catch(IOException e) {
            System.out.println("Kunne ikke gemme dataen");
        }
    }

    public void showMenu() {
        int count = 1;
        for (Drink d : coffeMenu) {
            System.out.println(count + ". " + d.getName() + " - " + d.getPrice() + " (" + d.getSoldNumber() + " sold)");
            count++;
        }
        System.out.println("0. Close");
    }

    public ArrayList<Drink> getCoffeMenu() {
        return coffeMenu;
    }
}