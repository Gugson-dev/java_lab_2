import java.util.Scanner;

public class zad1 
{
  public static void main(String[] args) 
  {
    /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
      Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
      to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
    */

    Scanner input = new Scanner(System.in);

    System.out.print("Podaj swój numer indeksu: ");
    int indeks = input.nextInt();
    input.close();

    int x = 1000;

    /* 

    Co tu się dzieje? 
    Przekształcam indeks na string, po czym ucinam ze stringa końcówkę (2 ostatnie liczby) i przekształcam je ponownie na int
    
    */

    String ost_cyfry = Integer.toString(indeks);
    int podzielnik = Integer.parseInt(ost_cyfry.substring(ost_cyfry.length() - 2));

    do 
    {
      if (x % podzielnik == 0) 
      {
        System.out.printf("Liczba %d podzielna przez %d\n", x, podzielnik);
      }

      x--;
    } while (x != 0);
  }
}
