
package pinkod;

public class Ellenorzes {
    public static boolean ellenorizniPinkod(String pinkod1, String pinkod2, int proba) {
        if (pinkod1.equals(pinkod2)) {
            System.out.println("Sikeres bejelentkezés!");
            return true;
        } else {
            System.out.println("Hibás pin kód!");
            System.out.printf("(%d/3) A pin kód nem egyezik.\n", proba);
            return false;
        }
    }

    public static boolean probatSzamlal(int proba) {
        return proba < 3;
    }
}
