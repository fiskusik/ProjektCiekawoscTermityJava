import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class termity {
    private static final Random generator = new Random();
    public static void main(String[] arg)
        throws IOException
    {
        System.out.println("========================================================================");System.out.println("Mamy stół, który jest drewniany.");
        System.out.println("Do stołu podąża ekipa zgłodniałych termitów, które mają określony termin drugiego śniadania.");
        System.out.println("Cel: zjedzenie pierwszej nogi.");
        System.out.println("W tym samym czasie podąża tzw. konkurencja, która też jest głodna.");
        System.out.println("Cel: zjedzenie drugiej nogi.");
        System.out.println("To samo dzieje się z pozostałymi nogami, które wchodzą w skład tego stołu, czyli również podążają ekipy na tzw. drugie śniadanie.");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
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
        System.out.println("Szanowny Kolego / Szanowna Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy1 + " do: " + przedzial_koncowy1 + " .");
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
        System.out.println("========================================================================");
        //Druga "noga stołu" znajdujcego się w kuchni
        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść drugą nogę?\n(zgadywanka)");
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        double przedzial_poczatkowy2, przedzial_koncowy2;
        BufferedReader br2a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w drugiej ekipie!");
        przedzial_poczatkowy2 = Double.parseDouble(br2a.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w drugiej ekipie!");
        przedzial_koncowy2 = Double.parseDouble(br2a.readLine());
        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy2 + " (kontrola)");
        System.out.println("Liczba końcowa przedziału w drugiej grupie wynosi: " + przedzial_koncowy2 + " (kontrola)");
        System.out.println("Szanowny Kolego / Szanowna Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy2 + " do: " + przedzial_koncowy2 + " .");
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
            System.out.println("Nie trafiony! Wylosowana liczba drugiej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_2noga + ".");
        }
        System.out.println("========================================================================");
        //Trzecia "noga stołu" znajdujcego się w kuchni
        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść drugą nogę?\n(zgadywanka)");
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        double przedzial_poczatkowy3, przedzial_koncowy3;
        BufferedReader br3a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w trzeciej ekipie!");
        przedzial_poczatkowy3 = Double.parseDouble(br3a.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w trzeeciej ekipie!");
        przedzial_koncowy3 = Double.parseDouble(br3a.readLine());
        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy3 + " (kontrola)");
        System.out.println("Liczba końcowa przedziału w drugiej grupie wynosi: " + przedzial_koncowy3 + " (kontrola)");
        System.out.println("Szanowny Kolego / Szanowna Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy3 + " do: " + przedzial_koncowy3 + " .");
        System.out.println("Wpisz jakąś liczbę i kliknij ");
        //Informacja na temat losowania ilości pierwsszej grupy termitów
        double losowanie_ilosci_3noga, zgadnięcie_3ekipa;
        BufferedReader br3b = new BufferedReader(new InputStreamReader(System.in));
        Random r3 = new Random();
        losowanie_ilosci_3noga = Math.round(przedzial_koncowy3*(r3.nextDouble()));
        zgadnięcie_3ekipa = Double.parseDouble((br3b.readLine()));
        if (zgadnięcie_3ekipa == losowanie_ilosci_3noga)
        {
            System.out.println("Jesteś Wielki! Uważaj na Termity");
        }
        else
        {
            System.out.println("Nie trafiony! Wylosowana liczba trzeciej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_3noga + ".");
        }
        System.out.println("========================================================================");
        //Czwarta "noga stołu" znajdujcego się w kuchni
        System.out.println("Informacja:");
        System.out.println("Analiza: Ile jest osobników w danej grupie,\nktóra podąża do stołu, aby zjeść drugą nogę?\n(zgadywanka)");
        //Informacja na temat przedziału ilości pierwsszej grupy termitów
        double przedzial_poczatkowy4, przedzial_koncowy4;
        BufferedReader br4a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę poczatkową przedziału ilości termitów znajdującychb się w czwartej ekipie!");
        przedzial_poczatkowy4 = Double.parseDouble(br4a.readLine());
        System.out.println("Podaj liczbę końcowa przedziału ilości termitów znajdującychb się w czwartej ekipie!");
        przedzial_koncowy4 = Double.parseDouble(br3a.readLine());
        System.out.println("Liczba początkowa przedziału w pierwszej grupie wynosi: " + przedzial_poczatkowy4 + " (kontrola)");
        System.out.println("Liczba końcowa przedziału w drugiej grupie wynosi: " + przedzial_koncowy4 + " (kontrola)");
        System.out.println("Szanowny Kolego / Szanowna Koleżanko: program losuje w tym mommencie liczbę osobników z przedziału od: " + przedzial_poczatkowy4 + " do: " + przedzial_koncowy4 + " .");
        System.out.println("Wpisz jakąś liczbę i kliknij ");
        //Informacja na temat losowania ilości pierwsszej grupy termitów
        double losowanie_ilosci_4noga, zgadnięcie_4ekipa;
        BufferedReader br4b = new BufferedReader(new InputStreamReader(System.in));
        Random r4 = new Random();
        losowanie_ilosci_4noga = Math.round(przedzial_koncowy4*(r4.nextDouble()));
        zgadnięcie_4ekipa = Double.parseDouble((br4b.readLine()));
        if (zgadnięcie_4ekipa == losowanie_ilosci_4noga)
        {
            System.out.println("Jesteś Wielki! Uważaj na Termity");
        }
        else
        {
            System.out.println("Nie trafiony! Wylosowana liczba czwartej ekipy zgłodniałych termitów wynosi: ");
            System.out.println("Wielkość grupy: " + (int) losowanie_ilosci_4noga + ".");
        }
        //Obliczenia statystyczne
        System.out.println("========================================================================");
        System.out.println("Obliczenia statystyczne i ciekawe wnioski na przyszłość.");
        System.out.println("Zestawienie zbiorcze *ataku na stół znajdujący się w kuchnni*.");
        System.out.println("Liczba poczatkowa - pierwsza grupa: " + przedzial_poczatkowy1 + ".");
        System.out.println("Liczba końcowa - pierwsza grupa: " + przedzial_koncowy1 + ".");
        System.out.println("Liczba poczatkowa - druga grupa: " + przedzial_poczatkowy2 + ".");
        System.out.println("Liczba końcowa - druga grupa: " + przedzial_koncowy2 + ".");
        System.out.println("Liczba poczatkowa - trzecia grupa: " + przedzial_poczatkowy3 + ".");
        System.out.println("Liczba końcowa - trzecia grupa: " + przedzial_koncowy3 + ".");
        System.out.println("Liczba poczatkowa - czwarta grupa: " + przedzial_poczatkowy4 + ".");
        System.out.println("Liczba końcowa - czwarta grupa: " + przedzial_koncowy4 + ".");
        System.out.println("Liczba losowa dla pierwszej grupy: " + losowanie_ilosci_1noga + ".");
        System.out.println("Liczba losowa dla drugiej grupy: " + losowanie_ilosci_2noga + ".");
        System.out.println("Liczba losowa dla trzeciej grupy: " + losowanie_ilosci_3noga + ".");
        System.out.println("Liczba losowa dla czwartej grupy: " + losowanie_ilosci_4noga + ".");
        System.out.println("Obliczenia dla średniej arytmetycznej liczb wylosowanych system.");
        double suma_podawana, suma_wylosowana;
        suma_podawana = (zgadnięcie_1ekipa + zgadnięcie_2ekipa + zgadnięcie_3ekipa + zgadnięcie_4ekipa) / 4;
        System.out.println("Wynik średniej arytmetycznej: " + suma_podawana + " (człowiek)");
        suma_wylosowana = (losowanie_ilosci_1noga + losowanie_ilosci_2noga + losowanie_ilosci_3noga + losowanie_ilosci_4noga) / 4;
        System.out.println("Wynik średniej arytmetycznej: " + suma_wylosowana + " (system)");
        //Obliczenia max, min
        double arr1[] = {zgadnięcie_1ekipa, zgadnięcie_2ekipa, zgadnięcie_3ekipa, zgadnięcie_4ekipa};
        int maxValue1 = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; ++i){
            maxValue1 = (int) Math.max(maxValue1, arr1[i]);
        }
        System.out.println("Wartość max -> człowiek wynosi: " + maxValue1);
        int minValue1 = Integer.MAX_VALUE;
        for(int i = 0; i < arr1.length; ++i){
            minValue1 = (int) Math.min(minValue1, arr1[i]);
        }
        System.out.println("Wartość min -> człowiek wynosi: " + minValue1);

        double arr2[] = {losowanie_ilosci_1noga, losowanie_ilosci_2noga, losowanie_ilosci_3noga, losowanie_ilosci_4noga};
        int maxValue2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr2.length; ++i){
            maxValue2 = (int) Math.max(maxValue2, arr2[i]);
        }
        System.out.println("Wartość max -> komputer wynosi: " + maxValue2);
        int minValue2 = Integer.MAX_VALUE;
        for(int i = 0; i < arr2.length; ++i){
            minValue2 = (int) Math.min(minValue2, arr2[i]);
        }
        System.out.println("Wartość min -> komputer wynosi: " + minValue2);
    }
}

