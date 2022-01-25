import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class zad3 
{
    public static void sortuj(Set<String> hset)
    {
        TreeSet<String> sort = new TreeSet<>(hset);
        wypiszSet(sort);
    }

    public static void wypiszSet(Set<String> set)
    {
        set.forEach(s -> System.out.print(s + " "));
    }

    public static void main(String[] args) 
    {
        /* zad.3* Dla chętnych (nie będzie punktowane):
                Napisać podobny program jak w zad.1 zamiast zwierząt wprowadzć dowolne dane 
                np. imiona, nazwiska, miasta, samochody ... . (dowolność),
                Wykonać na HashSet
                -- podpowiedź: Set<String> nazwaSeta = new HashSet<>();
                posortować kolekcję
                -- podpowiedź można przekonwertować dane do TreeSet albo do listy
         */

        Set<String> hset = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 10 wyrazów: ");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print(i + ". ");
            String liczba = input.nextLine();
            hset.add(liczba);
        }

        input.close();

        System.out.println("\nNie posortowany HashSet:");
        wypiszSet(hset);

        System.out.println("\n\nPosortowany HashSet zmieniony w TreeSet:");
        sortuj(hset);
    }
}
