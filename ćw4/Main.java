import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        Random rand = new Random();
        int k = 0;
        int a = 5;
        int b = 0;

        System.out.println("======================== BREAK ==========================");
        for (;;) 
        {
            int x = rand.nextInt(100);
            if (x > 25) 
            {
                System.out.println("Wylosowano liczbe: " + x);
            } 
            else 
            {
                System.out.println("Wylosowano liczbę mniejszą niż 25, przerwano losowanie!");
                break;
            }
        }

        System.out.println("======================= CONTINUE ========================");
        for (int i = 0;i < 10;i++) 
        {
            if (i % 2 == 0) continue;
            else 
            {
                k += i;
                System.out.println("k jest równe: " + k);
            }
        }

        System.out.println("======================== RETURN =========================");
        for (int i = 0; i < a; i++) 
        {
            b += a;
            System.out.println("b jest równe: " + b);
            if (b == 25)
            {
                System.out.println("=========================================================");
                return;
            } 
        }
        
        System.out.println("jakiś kod, który nigdy nie zostanie wykonany :(");
    }
}
