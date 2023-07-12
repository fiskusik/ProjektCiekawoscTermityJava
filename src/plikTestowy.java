import java.io.BufferedReader;
import java.io.InputStreamReader;

public class plikTestowy {
    public static void main (String[] args)
    {
        double dana_a = 123456789;
        double dana_b = 987654345;

        System.out.println("Wynik ->  max: " + Math.max(dana_a, dana_b) + ".");
        System.out.println("Wynik ->  min: " + Math.min(dana_a, dana_b) + ".");
    }
}
