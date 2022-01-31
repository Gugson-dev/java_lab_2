import java.util.Scanner;

public class zad2 
{
   public static void main(String[] args) 
   {
      /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
      * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
      * za pomocą pętli forEach powiększone o 11 */

      Scanner input = new Scanner(System.in);
      int[] liczby = new int[5];

      System.out.println("Podaj kolejno 5 liczb:");
      for (int i = 0; i < 5; i++) 
      {
         System.out.printf("%d. ", i+1);
         liczby[i] = input.nextInt();
      }

      input.close();
      int k = 1;

      System.out.println("\nTwoje liczby zwiększone o 11 to:");
      for (int l : liczby) 
      {
         System.out.printf("%d. %d\n", k, l+11);
         k++;
      }
   }
}