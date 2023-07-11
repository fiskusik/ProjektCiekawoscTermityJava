import java.io.BufferedReader;
import java.io.InputStreamReader;

public class plikTestowy {
    public static void main (String[] args) throws java.lang.Exception
    {
        double a, b, pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta.");
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        pole = a*b;
        System.out.println("Pole prostokąta o boku a = " + a + "o boku b = " + b);
                System.out.println(" wynosi " + pole + ".");
    }
}
