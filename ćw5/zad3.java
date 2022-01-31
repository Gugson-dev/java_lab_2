import java.util.Scanner;

public class zad3 
{
    /* 

                          v  WEDŁUG ZALECEŃ  v

    public static void dane(String imie)
    {
        System.out.prinln(imie);
    }

    public static void dane(String imie, String nazwisko)
    {
        System.out.prinln(imie + "\n" + nazwisko);
    }

    public static void dane(String imie, String nazwisko, int wiek)
    {
        System.out.prinln(imie + "\n" + nazwisko + "\n" + wiek);
    }

    */

    public static void dane(String imie)
    {
        System.out.println("====================== IMIE ======================");
        System.out.println("Twoje imie: " + imie + "\n");
    }

    public static void dane(String imie, String nazwisko)
    {
        System.out.println("================= IMIE + NAZWISKO ================");
        System.out.println("Twoje imie: " + imie);
        System.out.println("Twoje nazwisko: " + nazwisko + "\n");
    }

    public static void dane(String imie, String nazwisko, int wiek)
    {
        System.out.println("============= IMIE + NAZWISKO + WIEK =============");
        System.out.println("Twoje imie: " + imie);
        System.out.println("Twoje nazwisko: " + nazwisko);
        System.out.println("Twój wiek: " + wiek + "\n");
    }

    public static void main(String[] args) 
    {
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        Scanner input = new Scanner(System.in);
        
        System.out.print("Podaj imie: ");
        String imie = input.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = input.nextInt();

        input.close();

        dane(imie);
        dane(imie, nazwisko);
        dane(imie, nazwisko, wiek);
    }   
}
