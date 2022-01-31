import java.util.Scanner;

public class zad2 
{
    public static String[] wpisz(String[] stab)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Uzupełnij prosze tablice: ");
        for (int i = 0; i < stab.length; i++) 
        {
            System.out.print(i+1 + ". ");
            stab[i] = input.nextLine();
        }

        input.close();
        return stab;
    }

    public static void wypiszTAB(String[] stab)
    {
        System.out.println("\nTwoja tablica: ");
        for (int i = stab.length; i > 0; i--) 
        {
            System.out.println(i + ". " + stab[i-1]);
        }
    }

    public static void main(String[] args) 
    {
        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] stab = new String[6];
        wpisz(stab);
        wypiszTAB(stab);
    }
}
