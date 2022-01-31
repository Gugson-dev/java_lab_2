public class zad1 
{
   public static int[] uzupelnij40(int[] itab)
   {
         for (int i = 0; i < itab.length; i++) 
         {
            itab[i] = 40 - i;
         }

         return itab;
   }

   public static void wypiszTAB(int[] itab)
   {
      int l = 1;
      System.out.println("Twoja tablica:");
      for (int i : itab) 
      {
         System.out.println(l + ". " + i);
         l++;
      }
   }

   public static void main(String[] args) 
   {
      /* zad.1
      a) stworzyć tablicę typu int[20],
      b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
      c) napisać metodę, która wypisze otrzymane wartości,
      d) wstawić wywołanie metody do metody main
      */
      
      int[] itab = new int[20];
      uzupelnij40(itab);
      wypiszTAB(itab);
   }
}
