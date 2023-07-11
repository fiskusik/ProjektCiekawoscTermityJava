import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class termity {
    private static final Random generator = new Random();
    public static void main(String[] arg)
        throws IOException
    {
        //Analiza zapytania: Ile jest osobników w każdej grupie, która podąża do stołu?
        //Pierwsza "noga stołu" znajdujcego się w kuchni
        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść piewszą nogę?\n(zgadywanka)");
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        double przedzial_poczatkowy1, przedzial_koncowy1;
        BufferedReader br1a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_poczatkowy1 = Double.parseDouble(br1a.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_koncowy1 = Double.parseDouble(br1a.readLine());
        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy1 + " (kontrola)");
        System.out.println("Liczba końcowa przedziału w drugiej grupie wynosi: " + przedzial_koncowy1 + " (kontrola)");
        System.out.println("Szanowny Kolego / Szanowan Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy1 + "do: " + przedzial_koncowy1 + " .");
        System.out.println("Wpisz jakąś liczbę i kliknij ");
        //Informacja na temat losowania ilości pierwsszej grupy termitów
        double losowanie_ilosci_1noga, zgadnięcie_1ekipa;
        BufferedReader br1b = new BufferedReader(new InputStreamReader(System.in));
        Random r1 = new Random();
        losowanie_ilosci_1noga = Math.round(przedzial_koncowy1*(r1.nextDouble()));
        zgadnięcie_1ekipa = Double.parseDouble((br1b.readLine()));
        if (zgadnięcie_1ekipa == losowanie_ilosci_1noga)
        {
            System.out.println("Jesteś Wielki! Uważaj na Termity");
        }
        else
        {
            System.out.println("Nie trafiony! Wylosowana liczba pierwszej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_1noga + ".");
        }

        //Druga "noga stołu" znajdujcego się w kuchni
        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść drugą nogę?\n(zgadywanka)");
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        double przedzial_poczatkowy2, przedzial_koncowy2;
        BufferedReader br2a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_poczatkowy2 = Double.parseDouble(br2a.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w pierwszej ekipie!");
        przedzial_koncowy2 = Double.parseDouble(br2a.readLine());
        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy2 + " (kontrola)");
        System.out.println("Liczba końcowa przedziału w drugiej grupie wynosi: " + przedzial_koncowy2 + " (kontrola)");
        System.out.println("Szanowny Kolego / Szanowan Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy2 + "do: " + przedzial_koncowy2 + " .");
        System.out.println("Wpisz jakąś liczbę i kliknij ");
        //Informacja na temat losowania ilości pierwsszej grupy termitów
        double losowanie_ilosci_2noga, zgadnięcie_2ekipa;
        BufferedReader br2b = new BufferedReader(new InputStreamReader(System.in));
        Random r2 = new Random();
        losowanie_ilosci_2noga = Math.round(przedzial_koncowy2*(r2.nextDouble()));
        zgadnięcie_2ekipa = Double.parseDouble((br2b.readLine()));
        if (zgadnięcie_2ekipa == losowanie_ilosci_2noga)
        {
            System.out.println("Jesteś Wielki! Uważaj na Termity");
        }
        else
        {
            System.out.println("Nie trafiony! Wylosowana liczba pierwszej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_2noga + ".");
        }
    }
}

