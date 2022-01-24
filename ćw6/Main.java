import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę 5-cio elementową typu:
        a) double[],
        b) char[],
        c) boolean[] 
        przypisać do niej wartości i wyświetlić za pomocą dowolnej pętli. 
        */

        Random rand = new Random();

        double[] dtab = new double[5];
        char[] ctab = {'a','b','c','d','e'};
        boolean[] btab = new boolean[5];
        int k = 0;

        System.out.println("Tablica liczb typu double:");
        for (int i = 0; i < dtab.length; i++) {
            dtab[i] = (Math.random() * 100) + 1;
            System.out.printf("- %.2f\n",dtab[i]);
        }

        System.out.println("\nTablica znaków typu char");
        for (char znak : ctab) {
            System.out.println("- " + znak);
        }

        System.out.println("\nTablica wartości typu bool:");
        while (k != 5) {
            btab[k] = rand.nextBoolean();
            System.out.println("- " + btab[k]);
            k++;
        }
    }
}
