
package pinkod;

public class Keveres {
    static void kever(int[] kodTomb) {
        
        for (int i = 0; i < kodTomb.length; i++) {
            int j= (int) (Math.random() * (i + 1));
            int csere = kodTomb[i];
            kodTomb[i] = kodTomb[j];
            kodTomb[j] = csere;
            
        }
    }
}
