
package pinkod;

import java.util.Scanner;

public class Beker {
    Scanner scr = new Scanner(System.in);
    String pinkod;
    String pinkod2;
    int proba = 1;
    
    public String bekerPin(){
        System.out.println("Adjon meg egy 4-6 hosszuságú pin kódot: ");
        pinkod = scr.next();
        while (pinkod.length() < 4 || pinkod.length() > 6) {
            System.out.println("Nem megfelelő formátum, minimum 4 maximum 6 számjegy legyen: ");
            pinkod = scr.next(); 
        }
        return pinkod;
    }
    
    public String beUjPin(){
        System.out.printf("(%d/3)Adja meg a pin kódot: ", proba);
        return scr.next();
    }
}
