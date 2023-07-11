import java.io.BufferedReader;
import java.io.InputStreamReader;

public class plikTestowy {
    public static void main (String[] args) throws java.lang.Exception
    {
        double przedzial_poczatkowy1, przedzial_koncowy1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_poczatkowy1 = Double.parseDouble(br.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_koncowy1 = Double.parseDouble(br.readLine());

        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy1);
        System.out.println("Liczba końcowa przedziału w pierwszej grupie wynosi: " + przedzial_koncowy1);
    }
}
