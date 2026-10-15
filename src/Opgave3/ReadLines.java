package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadLines {

    public ArrayList<String> readLines(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();
        return lines;
    }
}
