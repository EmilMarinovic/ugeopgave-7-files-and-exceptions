package Opgave6;

import java.util.Scanner;

    public class TextUI {
        private Scanner scan = new Scanner(System.in);

        public String promptText(String msg){
            System.out.println(msg);
            String input = scan.nextLine();
            return input;
        }

        public int promptNumeric(String msg){
            int input = 0;
            System.out.println(msg);
            try {
                input = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                scan.nextLine();
                promptNumeric(msg);
            }
            return input;
        }



    }