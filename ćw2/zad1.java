import java.util.Scanner;

public class zad1 
{
  /*
  
  Zadanie praktycznie identyczne co ćw1/zadanie 1, dlatego dodałem metodę żeby kod się trochę różnił

  */

  public static int skroc(int indeks, int ile)
  {
    String ost_cyfry = Integer.toString(indeks);
    int podzielnik = Integer.parseInt(ost_cyfry.substring(ost_cyfry.length() - ile));
    return podzielnik;
  }

  public static void main(String[] args) 
  {
    /* zad.1 Napisz program który będzie iterował od 100 do 0,
    *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
    * (jesli tą liczbą jest 0 to przez 2 ostatnie) 
    */

    Scanner input = new Scanner(System.in);

    System.out.print("Podaj swój numer indeksu: ");
    int indeks = input.nextInt();
    input.close();

    int x = 100;
    int ostatnia = skroc(indeks, 1);
    int ostatnie2 = skroc(indeks, 2);

    do 
    {
      if (ostatnia == 0) 
      {
        if (x % ostatnie2 == 0) 
        {
          System.out.printf("Liczba %d podzielna przez %d\n", x, ostatnie2);
        }
      }
      else if (x % ostatnia == 0) 
      {
        System.out.printf("Liczba %d podzielna przez %d\n", x, ostatnia);
      }
      x--;
    } while (x != 0);
  }
}