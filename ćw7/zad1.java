import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class zad1 
{
    public static Map<String, String> dodaj(Map<String, String> mapa, int min, Scanner input)
    {
        System.out.printf("\nPodaj %d lub więcej par wyrazów, jeśli chcesz zakończyć zostaw pole puste i wciśnij Enter: \n", min);
        for (int i = 1;;i++) 
        {
            System.out.println(i + " para:");
            System.out.print("Klucz: ");
            String klucz = input.nextLine();
            System.out.print("Wartość: ");
            String wartosc = input.nextLine();

            if ((klucz.isEmpty() || wartosc.isEmpty()) && i <= min) 
            {
                System.out.printf("Podaj proszę przynajmniej %d par\n", min);
                i--;
            }
            else if (klucz.isEmpty() || wartosc.isEmpty()) break;
            else mapa.put(klucz, wartosc);
        }

        System.out.println();
        return mapa;
    }

    public static Map<String, String> dodaj(Map<String, String> mapa, int min, int max, Scanner input)
    {
        String s;

        switch (min) 
        {
            case 1:
                s = "para";
            break;
            
            case 2:
            case 3:
            case 4:
                s = "pary";
            break;
        
            default:
                s = "par";
            break;
        }

        if (min == max) System.out.printf("\nPodaj %d kolejne %s: \n", max, s);
        else System.out.printf("\nPodaj od %d do %d par: \n", min, max);

        for (int i = 1;i <= max;i++) 
        {
            System.out.println(i + " para:");
            System.out.print("Klucz: ");
            String klucz = input.nextLine();
            System.out.print("Wartość: ");
            String wartosc = input.nextLine();

            if ((klucz.isEmpty() || wartosc.isEmpty()) && i <= min) 
            {
                System.out.printf("Podaj proszę przynajmniej %d %s\n", min, s);
                i--;
            }
            else if (klucz.isEmpty() || wartosc.isEmpty()) break;
            else mapa.put(klucz, wartosc);
        }

        System.out.println();
        return mapa;
    }

    public static void wypisz(Map<String, String> mapa)
    {
        System.out.println("Twoja mapa:");
        for (Map.Entry<String, String> el : mapa.entrySet()) 
        {
            String klucz = (String)el.getKey();
            String wartosc = (String)el.getValue();
            System.out.println(klucz + ": " + wartosc);
        }
    }

    public static Map<String, String> usun(Map<String, String> mapa, int o)
    {
        int i = 1;
        for (Map.Entry<String, String> el : mapa.entrySet()) 
        {
            String klucz = (String)el.getKey();
            i++;
            if (i == o)
            {
                mapa.remove(klucz);
                break;
            } 
        }
        return mapa;
    }

    public static Map<String, String> usun(Map<String, String> mapa, Scanner input)
    {
        for (;;) 
        {
            System.out.println("\nWybierz klucz który chcesz usunąć z mapy, pozostaw puste i wciśnij Enter by zakończyć:");
            wypisz(mapa);
            System.out.print("Klucz do usunieca: ");
            String klucz = input.nextLine();
            
            if (klucz.isEmpty()) break;

            if (!(mapa.containsKey(klucz))) 
            {
                System.out.println("\nMapa nie posiada danego klucza, spróbuj jeszcze raz!");
                continue;
            }

            System.out.println("Usunięto klucz '" + klucz + "'!\n");
            mapa.remove(klucz);
        }
        
        return mapa;
    }

    public static Map<String, String> zamien(Map<String, String> mapa, Scanner input)
    {
        for (;;) 
        {
            System.out.println("\nWybierz klucz którego wartosc chcesz podmienic w mapie, pozostaw puste i wciśnij Enter by zakończyć:");
            wypisz(mapa);
            System.out.print("Klucz: ");
            String klucz = input.nextLine();
            
            if (klucz.isEmpty()) break;

            if (!(mapa.containsKey(klucz))) 
            {
                System.out.println("\nMapa nie posiada danego klucza, spróbuj jeszcze raz!");
                continue;
            }

            System.out.println("Nowa wartość: ");
            String wartosc = input.nextLine();
            System.out.println("Zmieniono wartość klucza '" + klucz + "' na '" + wartosc + "'!\n");
            mapa.put(klucz, wartosc);
        }
        
        return mapa;
    }

    public static void main(String[] args) 
    {
        /* Zad.1* Napisać program:
            a) Stworzenie mapę: Map<String, String>,
            b) uzupełnić wartościami (dowolność), przynajmniej 5 rekordów,
            c) usunąć 5-tą parę, dodać 2-ie dodatkowe pary i podwienić wartość w 1-ej i 2-giej parze (wartości dowolne),
            d) wyświetlić zawartość mapy i wyświetlić za pomocą pętli
        */;

        Scanner input = new Scanner(System.in);
        Map<String, String> mapa = new LinkedHashMap<String, String>();
        int warunek = 0;

        mapa = dodaj(mapa, 5, input);
        wypisz(mapa);

        System.out.println("\nChcesz usunąć elementy z listy własnoręcznie, czy automatycznie?");
        while (true) 
        {
            System.out.print("1) Własnoręcznie\n2) Automatycznie\nWybór: ");

            try 
            {
                warunek = input.nextInt();
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("\nPodaj numer opcji! (Liczbe)\nBŁĄD: " + e + "\n");
                input.nextLine();
            }

            switch (warunek) 
            {
                    case 1:
                        input.nextLine();
                        usun(mapa, input);
                    break;
    
                    case 2:
                        usun(mapa, 5);
                        input.nextLine();
                    break;                
                
                    default:
                        System.out.println("Prosze wybrać którąś z opcji!");
                    break;
            }

            if (warunek == 1 || warunek == 2) break;
            else continue;
        }

        mapa = dodaj(mapa, 2, 2, input);
        zamien(mapa, input);
        input.close();

        System.out.println("Twoja mapa: " + mapa);
        wypisz(mapa);
    }
}
/*
    W razie jakichkolwiek niejasności pisać do: d.szypniewski.kontakt@gmail.com
*/