import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class termity {
    private static Random generator = new Random();
    public static void main(String[] arg)
        throws IOException
    {
        //Analiza zapytania: Ile jest osobników w każdej grupie, która podąża do stołu?
        //Pierwsza "noga stołu" znajdujcego się w kuchni

        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść piewszą nogę?\n(zgadywanka)");

        double losowanie_ilosci_1noga, zgadnięcie_1ekipa;
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        //double przedzial_poczatkowy1, przedzial_koncowy1;
        //przedzial_poczatkowy1 = Double.parseDouble("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        //przedzial_koncowy1 = Double.parseDouble("Podaj liczbę końcowy przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        //System.out.print("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy1);
        //System.out.print("Liczba początkowa końcowy w pierwszej grupie wynosi: " + przedzial_koncowy1);

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.print("Szanowny Kolego / Szanowan Koleżanko: program losuaje w tym mommencie liczbę osobników z przedziału od 1 do 1000000 ");

        Random r1 = new Random();
        losowanie_ilosci_1noga = Math.round(1000000*(r1.nextDouble()));
        zgadnięcie_1ekipa = Double.parseDouble((br.readLine()));
        if (zgadnięcie_1ekipa == losowanie_ilosci_1noga)
        {
            System.out.println("Jesteś Wielki! Uważaj na Termity");
        }
        else
        {
            System.out.println("Nie trafiony! Wylosowana liczba pierwszej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_1noga + ".");
        }
    }
}

