package Opgave3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ReadLines reader = new ReadLines();
        try {
            ArrayList<String> lines = reader.readLines("data.csv/data.csv.csv");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }
    }
}
