package pinkod;

import java.util.Scanner;

public class Pinkod {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String pinkod;
        String pinkod2;
        int proba = 1;

        System.out.println("Adjon meg egy 4-6 hosszuságú pin kódot: ");
        pinkod = scr.next();
        while (pinkod.length() < 4 || pinkod.length() > 6) {
            System.out.println("Nem megfelelő formátum, minimum 4 maximum 6 számjegy legyen: ");
            pinkod = scr.next(); 
        }

        System.out.printf("(%d/3)Adja meg a pin kódot: ", proba);
        pinkod2 = scr.next();

        while (!(pinkod.equals(pinkod2)) && proba < 3) {
            proba++;
            System.out.println("Hibás pin kód!");
            System.out.printf("(%d/3)A pin kód nem egyezik: ", proba);
            pinkod2 = scr.next();
        }

        if (pinkod.equals(pinkod2)) {
            System.out.println("Sikeres bejelentkezés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }
    }

}
