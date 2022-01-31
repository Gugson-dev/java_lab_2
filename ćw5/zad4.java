public class zad4 
{
    public static int metoda(int a, int b)
    {
        return a + b;
    }

    public static int metoda(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args) 
    {
        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        /* 
        
        Żeby nie było, że nie umiem zrobić wedle zaleceń, to jedno zadanie 1 do 1 z instrukcjami

        */
        
        int zmiennaA = metoda(1, 2);
        int zmiennaB = metoda(7, 8, 9);
        System.out.print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4)));
    }
}
