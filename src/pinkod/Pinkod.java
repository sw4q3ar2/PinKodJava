package pinkod;

public class Pinkod {
    public static void main(String[] args) {
        Beker bekeres = new Bekeres();
        Ellenorzes ellenorzes = new Ellenorzes();
        int[] kodTomb = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int proba = 1;

        Keveres.kever(kodTomb);

        String pinkod1 = bekeres.bekerniPinkod();

        String pinkod2 = bekeres.bekerniUjPinkod(proba);

        while (!ellenorzes.ellenorizniPinkod(pinkod1, pinkod2, proba) && ellenorzes.probatSzamlal(proba)) {
            proba++;
            pinkod2 = bekeres.bekerniUjPinkod(proba);
        }

        if (pinkod1.equals(pinkod2)) {
            System.out.println("Sikeres bejelentkezés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }
    }
}
