import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salida {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombre;
        System.out.println(" Ingrese su nombre");
        nombre = br.readLine();

        int edad;
        System.out.println(" Ingrese su edad: ");
        edad = Integer.parseInt(br.readLine());

        System.out.println(" Ingrese su altura : ");
        double altura = Double.parseDouble(br.readLine());
    }
}
